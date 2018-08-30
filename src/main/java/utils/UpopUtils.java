/**
 * 
 */
package utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Sathish Kumar V
 *
 */
public class UpopUtils {
	
	public static final SimpleDateFormat sfd = new SimpleDateFormat("yyyymmdd HH:mm:ss.SSS");
	
	 /**
     * This method is used for convert date to ISO-8601 (in UTC).
     * 
     * @return
     */
    public static String getCurrentTimeStr() {
        Date today = Calendar.getInstance().getTime();
        String dateString = sfd.format(today);
        return dateString;
    }
    
    public static String genCorrId(String mrchTrxRef) {
        SimpleDateFormat sdf = new SimpleDateFormat("yymmdd");
        int rnd = RandomUtils.nextInt(999999);
        String frnd = String.format("%06d", rnd);
        String fmt = sdf.format(new Date()) + ':' + mrchTrxRef + ':' + frnd;
        return fmt;
    }
    
    /**
     * @param input
     * @return
     */
    public static ResponseEntity<String> getResponse(String input) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "text/plain;charset=UTF-8");
        return new ResponseEntity<String>(input, responseHeaders, HttpStatus.OK);
    }
    
    
    public static Object constructJsonStringToObj(Class<?> object, String jsonData) throws IOException {
        if (isEmpty(jsonData)) {
            return null;
        }
        final ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonData, object);
        } catch (IOException e) {
            throw e;
        }
    }
    
    /**
     * This method is used to check whether the string is null or empty.
     * 
     * @param value
     * @return true if the string is (empty or null), otherwise false.
     */
    public static boolean isEmpty(final String value) {
        return !(value != null && !value.trim().isEmpty());
    }
}
