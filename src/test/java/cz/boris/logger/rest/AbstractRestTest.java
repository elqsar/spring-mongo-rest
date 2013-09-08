package cz.boris.logger.rest;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;

public class AbstractRestTest extends JerseyTest  {

	@Override
	protected Application configure() {
		enable(TestProperties.LOG_TRAFFIC);
		enable(TestProperties.DUMP_ENTITY);
		return new RestConfig();
	}
	
	
	
}
