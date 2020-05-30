import java.util.ArrayList;

import io.restassured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


//
public class Pubentries {

	static ArrayList<String>namedata = new ArrayList<String>();
//
//	public static void main(String[] args) {
//		
//		RestAssured.baseURI = "https://edition.cnn.com";
//		 RequestSpecification http  = RestAssured.given();
//		 
//		 Response Response = http.request(Method.GET,"/ads.txt");
//		 String Entries = Response.asString();
//		 System.out.println(Entries);
//		 //System.out.println(Response);
//		 
//		 
//				
//		// TODO Auto-generated method stub
//				//ads.txt
//				//https://edition.cnn.com
//	}

	
	public static void replacenext() {
		 String name = "pubmatic";
		 name.offsetByCodePoints(0,9);
		 System.out.println(name);
		 
		
		 
		 
		
	}
}
