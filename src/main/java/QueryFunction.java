import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.query.*;
import de.fuberlin.wiwiss.d2rq.jena.ModelD2RQ;
import de.fuberlin.wiwiss.d2rq.vocab.VocabularySummarizer;
import org.apache.log4j.BasicConfigurator;

public class QueryFunction {
	public String doQuery() {
		BasicConfigurator.configure();
		Model m = new ModelD2RQ("file:/Users/Chauncey/Documents/Projects/StarWars/java-getting-started/StarWars-mapping.ttl");
		// Find anything with an rdf:type of iswc:InProceedings
		String sparql = 
			"PREFIX fictu:<http://example/fictu#>" +
		    "SELECT ?motherName WHERE {" +
		    "   ?fce fictu:hasMother ?mother . " +
		    "	?mother fictu:hasName ?motherName ." +
		    "}";
		Query q = QueryFactory.create(sparql);
		ResultSet rs = QueryExecutionFactory.create(q, m).execSelect();
		while (rs.hasNext()) {
		    QuerySolution row = rs.nextSolution();
			    return "Title: " + row.toString();
			};
		m.close();
		return "Cao Ni Ba";
	}
}
