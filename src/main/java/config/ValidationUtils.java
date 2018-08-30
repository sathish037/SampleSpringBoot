package config;

public class ValidationUtils {
	
	/**
	 * This method is used to check the whether the value is empty or not
	 * 
	 * @param value as true if empty otherwise false
	 * @return
	 */
	public static boolean isEmpty(Object value){
		return value == null || value.toString().trim().isEmpty();
	}

}
