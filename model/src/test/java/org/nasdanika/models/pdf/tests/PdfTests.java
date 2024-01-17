package org.nasdanika.models.pdf.tests;

import java.io.File;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.pdf.Document;
import org.nasdanika.models.pdf.Line;
import org.nasdanika.models.pdf.Page;
import org.nasdanika.models.pdf.util.PDFTextLoader;
import org.nasdanika.models.pdf.util.PdfTextResourceFactory;

public class PdfTests {
	
	@Test
	public void testLoad() throws Exception {
		PDDocument document = Loader.loadPDF(new File("test.pdf"));
		PDFTextLoader loader = new PDFTextLoader();
		Document modelDocument = loader.load(document);
		System.out.println(modelDocument.getPages().size());
		modelDocument.eAllContents().forEachRemaining(e -> {
			if (e instanceof Line) {
				((Line) e).getWords().forEach(w -> System.out.print(w.getText() + " "));
				System.out.println();
			}
		});
	}
	
	/**
	 * Basic test
	 * @throws Exception
	 */
	@Test
	public void testReadPdf() throws Exception {
		
		PDDocument document = Loader.loadPDF(new File("test.pdf"));
		
        PDFTextStripper tStripper = new PDFTextStripper() {
        
        	@Override
        	public String getArticleStart() {
        		return "<article page=\"" + getCurrentPageNo() + "\">" + System.lineSeparator();
        	}
        	
        	@Override
        	public String getArticleEnd() {
        		return "</article>" + System.lineSeparator();
        	}
        	
        	@Override
        	public String getParagraphStart() {
        		return "<paragraph page=\"" + getCurrentPageNo() + "\">" + System.lineSeparator();
        	}
        	
        	@Override
        	public String getParagraphEnd() {
        		return "</paragraph>" + System.lineSeparator();
        	}
        	
        	@Override
        	public String getPageStart() {
        		return "<page page=\"" + getCurrentPageNo() + "\"/>" + System.lineSeparator();
        	}
       	        	
        };
        
        tStripper.setSortByPosition(true);
        
        String pdfFileInText = tStripper.getText(document);
        System.out.println(pdfFileInText);
        
	}	

	@Test
	public void testPdfTextResource() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("pdf", new PdfTextResourceFactory());
		File test = new File("test.pdf").getCanonicalFile();
		URI resourceURI = URI.createFileURI(test.getAbsolutePath());
		Resource pdfTextResource = resourceSet.getResource(resourceURI, true);
		for (EObject root: pdfTextResource.getContents()) {
			Document modelDocument = (Document) root;
			System.out.println(modelDocument.getAuthor());
			System.out.println(modelDocument.getTitle());
			System.out.println(pdfTextResource.getURIFragment(root));
			
			Page pageTen = modelDocument.getPages().get(10);
			System.out.println(pdfTextResource.getURIFragment(pageTen));
		}
		
		EObject pageTen = resourceSet.getEObject(resourceURI.appendFragment("//@pages.10"), false);
		System.out.println(pageTen);
	}
			
}
