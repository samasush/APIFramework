package Pojo;

import java.util.HashMap;
import java.util.Map;

public class RestApiHandler {

	private Map<String, String> headers=new HashMap<>();
	private Map<String, String> queryParams;
	private String endpoints;
	String strError="";
	
	public Map<String, String> getHeaders(){
		return headers;
	}
	
	public void setHeaders(Map<String, String> map) {
		this.headers.putAll(map);
	}
	public Map<String, String> getQueryParams(){
		return queryParams;
	}
	public void setQueryParams(Map<String, String> queryParams) {
		this.queryParams=queryParams;		
	}
	public String getEndpoint() {
		return endpoints;		
	}
	public void setEndpoint(String endpoint) {
		this.endpoints=endpoint;
	}
		
	}
	
	
