package org.nasdanika.models.pdf.util;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;

public class PdfTextResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(ResourceSet resourceSet) {
		return new PdfTextResourceFactory();
	}
	
	@Override
	protected String getExtension() {
		return "pdf";
	}

}
