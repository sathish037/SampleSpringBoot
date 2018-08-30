/**
 * 
 */
package mvi.upop.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import mvi.upop.controller.SampleSimulatorController;

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
		System.out.println("Success :  "+mvResult.getResponse().getContentAsString());
	}

}
