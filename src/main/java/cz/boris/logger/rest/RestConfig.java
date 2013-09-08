package cz.boris.logger.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class RestConfig extends ResourceConfig {

	public RestConfig() {
		super();
		register(ReportResource.class);
		register(JacksonFeature.class);
	}
	
	

}
