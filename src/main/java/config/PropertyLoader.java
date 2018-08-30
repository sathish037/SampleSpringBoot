/**
 * 
 */
package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author Sathish Kumar V
 *
 */
public class PropertyLoader {
	transient Properties properties = null;

	private static final Logger LOGGER = Logger.getLogger(PropertyLoader.class);

	/**
	 * @param encryptor
	 *            - StandardPBEStringEncryptor
	 * @param fileName
	 *            - File name
	 */
	public PropertyLoader( final String fileName) {
		properties = new Properties();
		InputStream stream = null;
		try {
			stream = ValidationUtils.class.getResourceAsStream("/" + fileName);
			properties.load(stream);
		} catch (IOException e) {
			LOGGER.error("Error occured while loading " + fileName + " file. ", e);
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					LOGGER.error("Unable to close the input stream", e);
				}
			}
		}
	}

	/**
	 * return the property value for the key
	 * 
	 * @param key
	 *            - property key
	 * @return property value
	 */
	public String getPropertyValue(final String key) {
		return properties.getProperty(key);
	}

	/**
	 * @return Properties object
	 */
	public Properties getProperty() {
		return properties;
	}
}
