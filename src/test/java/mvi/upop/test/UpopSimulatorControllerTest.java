/**
 * 
 */
package mvi.upop.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import controller.SampleSimulatorController;

/**
 * @author Sathish Kumar V
 *
 */
public class UpopSimulatorControllerTest {
	
	private MockMvc mokmvc;
	
	@Before
	public void setUp() {
		mokmvc = MockMvcBuilders.standaloneSetup(new SampleSimulatorController()).build();
	}
	
	@Test
	public void getHelloWorld() throws Exception {
		MvcResult mvResult = mokmvc.perform(MockMvcRequestBuilders.get("/UpopGateway/api/test.bt").contentType(MediaType.APPLICATION_JSON)
				).andReturn();
		Assert.assertNotNull("Success response is not null ", mvResult.getResponse().getContentAsString());
	}
	
	@Test
	public void getWelcome() throws Exception {
		MvcResult mvResult = mokmvc.perform(MockMvcRequestBuilders.get("/UpopGateway/api/welcome.bt").contentType(MediaType.APPLICATION_JSON)
				).andReturn();
		Assert.assertNotNull("Success response is not null ", mvResult.getResponse().getContentAsString());
	}

}
