package CommonMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;

import Pojo.ApiResponse;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestPayload {

	//ApiResponse apires=given().expect().defaultParser(Parser.JSON).when()
			//.get("https://api.ratesapi.io/api/latest HTTP").as(ApiResponse.class);
	

	//RestAssured.baseURI="https://api.ratesapi.io/api/latest";
	RequestSpecification req;
	ResponseSpecification resspec;
	Response res;
	public HttpResponse httpResponse=null;
	//public Map<String, String> headParameters=new HashMap();
	//private Map<String, String> apiInfo=new LinkedHashMap();
	//public List<String> resultlist=new ArrayList();
	/** String strError to be used in order to capture any error occurred at runtime..**/
	public String strError;
	/** Boolean Type.. to be used to capture the result.**/
	public boolean blnResult;
	
	
	public String getRequestPayload(String methodName)
	{
		String requestPayload="";
		req=(RequestSpecification) new RequestSpecBuilder().setBaseUri("https://api.ratesapi.io/api/latest")
				.setContentType(ContentType.JSON).build();
		
		resspec= (ResponseSpecification) new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		res=(Response) given().spec(req).body(requestPayload);
		return requestPayload;
		
		
		
	}


	private RequestSpecification given() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
