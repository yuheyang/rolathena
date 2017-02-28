package com.chlitina.o2o.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LogTxt {

	public void writefile() {
		Properties prop = new Properties();
		try {

			prop.load(new FileInputStream("/WEB-INF/beans.xml"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		// String filepath = prop.getProperty("111");
	}
}
