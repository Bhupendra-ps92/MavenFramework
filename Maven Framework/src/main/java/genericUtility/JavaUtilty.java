package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class JavaUtilty {
	public int generateRandomNo(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
		
	}

	public String fetchDataFromPropertyFile(String key) throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/PropertyData.properties");
		Properties property = new Properties();
		property.load(fis);
		return property.getProperty(key);
	}

}
