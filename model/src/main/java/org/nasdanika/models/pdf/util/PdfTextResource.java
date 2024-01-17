package org.nasdanika.models.pdf.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * Text loading resource
 * @author Pavel
 *
 */
public class PdfTextResource extends ResourceImpl {
	
	public PdfTextResource(URI uri) {
		super(uri);
	}
		
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();

		int nRead;
		byte[] data = new byte[16384];

		while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
		  buffer.write(data, 0, nRead);
		}
		buffer.close();

		PDDocument document = Loader.loadPDF(buffer.toByteArray());
		PDFTextLoader loader = createLoader();
		getContents().add(loader.load(document));
	}

	protected PDFTextLoader createLoader() {
		return new PDFTextLoader();
	}
			
}