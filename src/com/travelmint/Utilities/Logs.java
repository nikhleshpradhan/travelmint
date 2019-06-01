package com.travelmint.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	
	public static void takeLogs(String Classname, String message)
	{
		
		Logger log = Logger.getLogger(Classname);
		DOMConfigurator.configure("E:\\TravelMint\\logs.xml");
		log.info(message);
	}

}
