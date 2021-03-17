package stepDefinations;

import CommonMethod.RequestPayload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.junit.Assert.*;


public class StepDefination extends RequestPayload{

	
	boolean blnResult;
	String strError="";
	public RequestSpecification req;
	public ResponseSpecification resspec;
	public Response res;
	
	static StepDefination commonsteps= new StepDefination();

	
	@Given("User sends the Http request to the ratesAPI server with valid Parameter")
	public void user_sends_the_http_request_to_the_rates_api_server_with_valid_parameter() {
	    res = ((RequestSpecification) res).when().get().then().spec(resspec).extract().response();
	}
	@When("User hit the api with request and endpoint URL")
	public void user_hit_the_api_with_request_and_endpoint_url() {
		assertEquals(res.getStatusCode(), 200);
	}
	@Then("API return all {records} with {OK}")
	public void api_should_return_all_records_with_OK(String keyValue, String ExpectedValue) {
	    
	    String resp=res.asString();
	    JsonPath js=new JsonPath(resp);
	    assertEquals(js.get(keyValue).toString(),ExpectedValue);
	    }

	
}
