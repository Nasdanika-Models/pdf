module org.nasdanika.models.pdf.processors {
		
	requires transitive org.nasdanika.models.pdf;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.pdf.processors;
	opens org.nasdanika.models.pdf.processors; // For loading resources
	
}
