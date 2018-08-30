/**
 * 
 */

package mvi.upop.response;

import org.json.JSONObject;

/**
 * @author Sathish Kumar V
 *
 */
public interface ResponseGenerator {

    JSONObject getResponse(JSONObject request);

}
