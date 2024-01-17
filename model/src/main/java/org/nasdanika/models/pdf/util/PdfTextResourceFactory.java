package org.nasdanika.models.pdf.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class PdfTextResourceFactory extends ResourceFactoryImpl {
		
	@Override
	public Resource createResource(URI uri) {
		return new PdfTextResource(uri) {
			
			@Override
			protected PDFTextLoader createLoader() {
				return PdfTextResourceFactory.this.createLoader(this);
			}
			
		};
	}
	

	protected PDFTextLoader createLoader(PdfTextResource resource) {
		return new PDFTextLoader();
	}
	
}
