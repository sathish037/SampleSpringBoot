/**
 * 
 */
package response;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import generator.AuthResponseGenerator;
import generator.CaptResponseGenerator;
import generator.RefundResponseGenerator;
import generator.ReversalAuthResponseGenerator;
import generator.ReversalSaleResponseGenerator;
import generator.SaleResponseGenerator;

/**
 * @author Sathish Kumar V
 *
 */
public class MTIBasedResponseHandler {
	
	private static final Logger log = Logger.getLogger(MTIBasedResponseHandler.class);
	
	private static Map<String, ResponseGenerator> responseConstructors = new HashMap<>();
	
	static {
		responseConstructors.put(MTIConstants.SALE_TXN_TYPE,  new SaleResponseGenerator());    //SALE
		responseConstructors.put(MTIConstants.RSALE_TXN_TYPE, new ReversalSaleResponseGenerator()); //RSALE
		responseConstructors.put(MTIConstants.CRED_TXN_TYPE,  new RefundResponseGenerator()); // CRED
		responseConstructors.put(MTIConstants.AUTH_TXN_TYPE,  new AuthResponseGenerator()); // AUTH
		responseConstructors.put(MTIConstants.RAUTH_TXN_TYPE, new ReversalAuthResponseGenerator()); //RAUTH
		responseConstructors.put(MTIConstants.CAPT_TXN_TYPE,  new CaptResponseGenerator()); //CAPT
		responseConstructors.put(MTIConstants.RCAPT_TXN_TYPE, new CaptResponseGenerator()); //RCAPT
	}
	
	
	public static JSONObject constructResponse(){
		String mtp = "";
		JSONObject jsonObject = new JSONObject();
		final ResponseGenerator generator = responseConstructors.get(mtp);
        if (generator != null) {
            final JSONObject response = generator.getResponse(jsonObject);
            if (response != null) {
                return response;
            }
        } else {
            log.error("No response generator found for MTI {}");
        }
		return null;
	}
}
