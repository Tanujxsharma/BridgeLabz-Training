package JSON;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;


public class MergeTwoJSON {
	public static void main(String[] args) throws Exception {
		String json1 = "{ \"name\": \"tanuj\", \"email\": \"tanuj@gmail.com\" }";
		String json2 = "{ \"phone\": \"9876543210\", \"city\": \"Agra\" }";
		
		ObjectMapper obj = new ObjectMapper();
		
		JsonNode node1 = obj.readTree(json1);
		JsonNode node2 = obj.readTree(json2);
		
		ObjectNode merge = obj.createObjectNode();
		
		merge.setAll((ObjectNode) node1);
		merge.setAll((ObjectNode) node2);
		
		System.out.println(merge.toPrettyString());
		
	}
}
