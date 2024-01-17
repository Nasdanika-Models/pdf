package org.nasdanika.models.pdf.util;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;
import org.nasdanika.models.pdf.PdfFactory;
import org.nasdanika.models.pdf.Word;

public class PDFTextLoader extends PDFTextStripper {
	
	private PdfFactory factory;

	protected org.nasdanika.models.pdf.Document modelDocument;
	protected org.nasdanika.models.pdf.Page modelPage;
	protected org.nasdanika.models.pdf.Article modelArticle;
	protected org.nasdanika.models.pdf.Paragraph modelParagraph;
	protected org.nasdanika.models.pdf.Line modelLine;
		
	public PDFTextLoader() {
		this(PdfFactory.eINSTANCE);
	}
	
	public PDFTextLoader(PdfFactory factory) {
		this.factory = factory;
		setSortByPosition(true);
	}
	
	protected org.nasdanika.models.pdf.Document createModelDocument() {
		return factory.createDocument();
	}
	
	protected org.nasdanika.models.pdf.Page createModelPage() {
		return factory.createPage();
	}
	
	protected org.nasdanika.models.pdf.Article createModelArticle() {
		return factory.createArticle();
	}
	
	protected org.nasdanika.models.pdf.Paragraph createModelParagraph() {
		return factory.createParagraph();
	}
	
	protected org.nasdanika.models.pdf.Line createModelLine() {
		return factory.createLine();
	}
	
	protected org.nasdanika.models.pdf.Word createModelWord() {
		return factory.createWord();
	}
	
	@Override
	protected void startDocument(PDDocument document) throws IOException {
		modelDocument = createModelDocument();
		PDDocumentInformation info = document.getDocumentInformation();
		if (info != null) {
			modelDocument.setAuthor(info.getAuthor());
			Calendar cd = info.getCreationDate();
			if (cd != null) {
				modelDocument.setCreated(cd.getTime());
			}
			modelDocument.setCreator(info.getCreator());
			modelDocument.setKeywords(info.getKeywords());
			Calendar md = info.getModificationDate();
			if (md != null) {
				modelDocument.setModified(md.getTime());
			}
			modelDocument.setProducer(info.getProducer());
			modelDocument.setSubject(info.getSubject());
			modelDocument.setTitle(info.getTitle());			
		}
	}
		
	@Override
	protected void startPage(PDPage page) throws IOException {
		modelPage = createModelPage();
		modelDocument.getPages().add(modelPage);
	}
	
	@Override
	protected void endPage(PDPage page) throws IOException {
		modelPage = null;
	}
	
	@Override
	protected void startArticle() throws IOException {
		modelArticle = createModelArticle();
		modelPage.getArticles().add(modelArticle);
	}
	
	@Override
	protected void endArticle() throws IOException {
		modelArticle = null;
	}
	
	@Override
	protected void writeParagraphStart() throws IOException {
		super.writeParagraphStart();
		modelParagraph = createModelParagraph();
		modelArticle.getParagraphs().add(modelParagraph);
	}
	
	@Override
	protected void writeParagraphEnd() throws IOException {
		modelParagraph = null;
		super.writeParagraphEnd();
	}
	
	@Override
	protected void writeLineSeparator() throws IOException {
		super.writeLineSeparator();
		modelLine = null;
	}
	
	@Override
	protected void writeString(String text, List<TextPosition> textPositions) throws IOException {
		Word modelWord = createModelWord();
		modelWord.setText(text);
		// TODO - text positions
		if (modelLine == null) {
			modelLine = createModelLine();
			modelParagraph.getLines().add(modelLine);
		}
		modelLine.getWords().add(modelWord);
	}

    public org.nasdanika.models.pdf.Document load(PDDocument doc) throws IOException {
    	getText(doc);
    	return modelDocument;
    }
	

}
