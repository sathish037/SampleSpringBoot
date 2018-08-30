/**
 * 
 */
package mvi.upop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sathish Kumar V
 *
 */
@RestController
@RequestMapping(value = "/UpopNotifCtrl")
public class UpopSimulatorController {
	
	
	/**
	 * For developer testing purpose. WARN: Does not support any part, in the
	 * application process.
	 * 
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value = "/test.bt", method = RequestMethod.GET)
	public String getHello() throws Exception {
		return "Success";
	}
}
