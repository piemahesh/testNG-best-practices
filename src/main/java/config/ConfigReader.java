package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	static Properties props = new Properties();

	static {

		try {
			File propsFile = new File(
					"D:\\STUDENTS\\Testing-Jan-2025\\testNgBp\\src\\main\\resources\\props.properties");
			FileInputStream file = new FileInputStream(propsFile);
			props.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String get(String key) {
		return props.getProperty(key);
	}
}
