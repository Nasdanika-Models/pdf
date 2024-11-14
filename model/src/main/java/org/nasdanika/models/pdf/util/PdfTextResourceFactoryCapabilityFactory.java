package org.nasdanika.models.pdf.util;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.CapabilityFactory.Loader;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

public class PdfTextResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(
			ResourceSet resourceSet, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		return new PdfTextResourceFactory();
	}
	
	@Override
	protected String getExtension() {
		return "pdf";
	}

}
