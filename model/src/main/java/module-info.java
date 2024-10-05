import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.pdf.util.PdfEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.pdf.util.PdfTextResourceFactoryCapabilityFactory;

module org.nasdanika.models.pdf {
	
	exports org.nasdanika.models.pdf;
	exports org.nasdanika.models.pdf.impl;
	exports org.nasdanika.models.pdf.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.apache.pdfbox;
	requires transitive org.nasdanika.capability;
	
	provides CapabilityFactory with 
		PdfEPackageResourceSetCapabilityFactory,
		PdfTextResourceFactoryCapabilityFactory;
	
}