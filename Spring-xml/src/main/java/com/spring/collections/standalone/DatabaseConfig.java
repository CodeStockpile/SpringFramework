package com.spring.collections.standalone;

import java.util.Properties;

public class DatabaseConfig {
	private Properties prop;

	public DatabaseConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatabaseConfig(Properties prop) {
		super();
		this.prop = prop;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "DatabaseConfig [prop=" + prop + "]";
	}
	
	
}
