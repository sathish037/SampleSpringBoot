/**
 * 
 */
package mvi.upop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sathish Kumar V
 *
 */
@RestController
@RequestMapping(value = "/UpopGateway/api")
public class SampleSimulatorController {
	
	
	/**
	 * For developer testing purpose. WARN: Does not support any part, in the
	 * application process.
	 * 
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value = "/test.bt", method = RequestMethod.GET)
	public String getHello() throws Exception {
		List<String> value = new ArrayList<>();
		value.add("MVI");
		value.add("Employee");
		return value.toString();
	}
	
	@RequestMapping(value = "/welcome.bt", method = RequestMethod.GET)
	public String getwelcom() throws Exception {
		return "welcome";
	}
	
	 @RequestMapping(value = "/acp_front_url.do", method = RequestMethod.POST)
	    public ResponseEntity<?> acpFrontUrlHandler(HttpServletRequest rq, HttpServletResponse rs, ModelMap model,
	            @RequestParam Map<String, String> allRequestParams) throws Exception {
					return null;
	 }
	 
	 @RequestMapping(value = "/acp_back_url.do", method = RequestMethod.POST)
	    public ResponseEntity<?> acpBackUrlHandler1(HttpServletRequest rq, HttpServletResponse rs, ModelMap model,
	            @RequestParam Map<String, String> allRequestParams) throws Exception {
					return null;
	 }
}
