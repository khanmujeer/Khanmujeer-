package com.crm.genericLibrary;



import java.io.FileInputStream;
import java.util.Properties;


public class Filedata {

	  String propFile="./src/main/resources/Properties/common.properties";
	public  String getDataFromPropreties(String key) throws Exception  
	{
		FileInputStream file=new FileInputStream(propFile);
		Properties prop=new Properties();
		prop.load(file);
		String value=prop.getProperty(key);
		return value;
		
	}
}