package com.owlReasoner;

import java.io.*;
import org.apache.jena.riot.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.reasoner.*;
import com.hp.hpl.jena.util.*;

class SimpleReasoner {
	public static void main(String[] args) throws IOException {
		SimpleReasoner simpleReasoner = new SimpleReasoner();
		simpleReasoner.doLocalReason();
	}
	public void doLocalReason() throws IOException {
		File file = new File ("../StarWars-SecondDump.ttl");
		FileOutputStream output = new FileOutputStream(file);
        Model data = RDFDataMgr.loadModel("../StarWars-FirstDump.ttl") ;
		Model schema = FileManager.get().loadModel("../root-ontology.owl");
		Reasoner reasoner = ReasonerRegistry.getOWLMiniReasoner();
		reasoner = ((com.hp.hpl.jena.reasoner.Reasoner) reasoner).bindSchema(schema);
		InfModel infmodel = ModelFactory.createInfModel(reasoner, data);
		Resource character = infmodel.getResource("file:///Users/Chauncey/Documents/Projects/StarWars/StarWarsFuseki/StarWars-FirstDump.ttl#Character/2");
		printStatements(infmodel, character, null, null);
		infmodel.write(output, "TTL");
	}
	public void printStatements(Model m, Resource s, Property p, Resource o) {
	    for (StmtIterator i = m.listStatements(s,p,o); i.hasNext(); ) {
	        Statement stmt = i.nextStatement();
	        System.out.println(" - " + PrintUtil.print(stmt));
	    }
	}
}