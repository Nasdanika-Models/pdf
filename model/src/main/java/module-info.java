module org.nasdanika.models.pdf {
	
	exports org.nasdanika.models.pdf;
	exports org.nasdanika.models.pdf.impl;
	exports org.nasdanika.models.pdf.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.apache.pdfbox;
	
}