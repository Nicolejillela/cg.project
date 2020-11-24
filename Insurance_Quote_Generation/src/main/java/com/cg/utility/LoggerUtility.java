package com.cg.utility;

import org.apache.log4j.Logger;

public class LoggerUtility 
{
	static Logger plpLogger=null;
	static
	{
		plpLogger = Logger.getLogger(LoggerUtility.class);
	}
	public static Logger getLogger()
	{
		return plpLogger;
	}
}
