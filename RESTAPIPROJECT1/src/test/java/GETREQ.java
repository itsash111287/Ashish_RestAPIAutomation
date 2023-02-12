import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.Method;
//import io.restassured.internal.support.FileReader;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.Assert;



public class GETREQ {

////    int statusCode;
@SuppressWarnings("null")
		////
////    @Test
////    void getUserDetailsTest() {
////        RestAssured.baseURI = "https://reqres.in/api/users/";
////
////        RequestSpecification httpRequest = RestAssured.given();
////
////        Response response = httpRequest.request(Method.GET, "2");
////
////        // Response response = get("https://reqres.in/api/users/2");
////
////        String responsebody = response.getBody().asString();
////               System.out.println("Response body is " + responsebody);
////        statusCode = response.getStatusCode();
////        Assert.assertEquals(statusCode, 200);
////
////    }
////
////    @Test
////    void createUserTest() {
////        RestAssured.baseURI = "https://reqres.in/api/users/";
////
////        RequestSpecification httpRequest = RestAssured.given();
////
////        JSONObject requestParams = new JSONObject();
////        requestParams.put("name", "Ram");
////        requestParams.put("job", "student");
////
////        httpRequest.header("Content-Type", "application/json");
////
////        httpRequest.body(requestParams.toJSONString());
////
////        Response response = httpRequest.request(Method.POST);
////
////        statusCode = response.getStatusCode();
////        Assert.assertEquals(statusCode, 201);
////
////    }
////
////    @Test
////    void checkAuthorizationTest() {
////
////        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
////
////        RequestSpecification httpRequest = RestAssured.given();
////
////        Response response = httpRequest.request(Method.GET, "/");
////
////        statusCode = response.getStatusCode();
////        Assert.assertEquals(statusCode, 401);
////
////        httpRequest.auth().preemptive().basic("postman", "password");
////
////        Response responseWithAuth = httpRequest.request(Method.GET, "/");
////        statusCode = responseWithAuth.getStatusCode();
////        Assert.assertEquals(statusCode, 200);
////
////        JsonPath respeone = responseWithAuth.jsonPath();
////
////        Boolean authentication = respeone.get("authenticated");
////        Assert.assertTrue(authentication);
////    }
////
////    @Test
////    void updateUserDetailsTest() {
////
////        RestAssured.baseURI = "https://reqres.in/api/users/";
////
////        RequestSpecification httpRequest = RestAssured.given();
////
////        JSONObject updateData = new JSONObject();
////        updateData.put("name", "Ashish");
////
////        httpRequest.header("Content-Type", "application/json");
////
////        httpRequest.body(updateData.toJSONString());
////        Response response = httpRequest.request(Method.PUT, "4");
////        statusCode = response.getStatusCode();
////        Assert.assertEquals(statusCode, 200);
////
////        JsonPath newData = response.jsonPath();
////        String name = newData.get("name");
////        Assert.assertEquals(name, "Ashish");
////
////    }
////
////    @Test
////    void deleteUserTest() {
////        RestAssured.baseURI = "https://reqres.in/api/users/";
////
////        RequestSpecification httpRequest = RestAssured.given();
////
////        Response response = httpRequest.request(Method.DELETE, "4");
////        statusCode = response.getStatusCode();
////        Assert.assertEquals(statusCode, 204);
////    }
////
////
////
////
////
////
////    @Test
////	void getweather(){
////		System.out.println("I have done it");
////		
////		RestAssured.baseURI = "http://dummy.restapiexample.com";
////		//Request Object
////		//test GIT COMMIT AGAIN
////		RequestSpecification httrequest = RestAssured.given();
////		
////		//Response Object
////
////		Response response = httrequest.request(Method.GET,"/employee");
////		System.out.println(response);
////		
////		//print response
////	
////		
////	
////		
////		String responsebody = response.getBody().asString();
////		//System.out.println("Response body is:" + responsebody);
////		
////		//Status code validation
////		
////		int statuscode = response.getStatusCode();
////		System.out.println("Status code is : " + statuscode);
////		
////		//Validate
////		
////		Assert.assertEquals(statuscode, 200);
////		
////		String statusline = response.statusLine();
////		System.out.println("Status line is: " + statusline);
////		
////		//validation
////		
////		//Assert.assertEquals(statusline, "HTTP/1.1 201 OK");
////		
////	}
//////    @Test
//////    public void UpdateRecords(){
//////    	 int empid = 15410;
//////    	 
//////    	 RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
//////    	 RequestSpecification request = RestAssured.given();
//////    	 
//////    	 JSONObject requestParams = new JSONObject();
//////    	 requestParams.put("name", "Zion"); // Cast
//////    	 requestParams.put("age", 23);
//////    	 requestParams.put("salary", 12000);
//////    	 
//////    	 request.body(requestParams.toJSONString());
//////    	 Response response = request.put("/update/"+ empid);
//////    	 
//////    	 int statusCode = response.getStatusCode();
//////    	 System.out.println(response.asString());
//////    	 Assert.assertEquals(statusCode, 200); 
//////    	 
//////    	 }
//    
   	  
    	  @Test
    	  public static void letsreadfile() throws Exception {

    		        URL oracle = new URL("https://edition.cnn.com/ads.txt");
    		        BufferedReader in = new BufferedReader(
    		        new InputStreamReader(oracle.openStream()));
    		   
    		       FileWriter fw = new FileWriter("C:/Users/TEMP.DESKTOP-SGAKA4V.000/pubreseller.txt",true);
    		       FileWriter frd = new FileWriter("C:/Users/TEMP.DESKTOP-SGAKA4V.000/pubdirect.txt",true);
			
    		   		BufferedWriter bw = new BufferedWriter(fw);
				    BufferedWriter bwa = new BufferedWriter(frd);

    		        String inputLine;
    		     		        	while ((inputLine = in.readLine()) != null)
    		        		
    		     		        		
  		        		{	
   		        		if (inputLine.contains("pubmatic.com") && inputLine.contains("RESELLER"))
    		        		{  
 		        	     	
    		            System.out.println(inputLine);
    		            bw.write(inputLine);
    		            bw.newLine();
    		            continue;
    		      
   		        		}
   		        		if (inputLine.contains("pubmatic.com") && inputLine.contains("DIRECT"))
   		        		{
   		        			System.out.println(inputLine);
   		        			bwa.write(inputLine);
   		        			bwa.newLine();
   		        		}
    		        		}
  		        		bw.close();
    		        	bwa.close();
}



}
    		        			        	      
    		    

    	









    	    	
    	    	

    

