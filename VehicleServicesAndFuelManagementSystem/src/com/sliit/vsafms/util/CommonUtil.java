package com.sliit.vsafms.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommonUtil {

	public static final Logger log = Logger.getLogger(CommonUtil.class.getName());
	public static final Properties properties = new Properties();
	
	static {
	
			try {
				
				
//				File dbFile = new File("config.properties");
//				FileReader dbFileReader=dbFileReader = new FileReader(dbFile);
//					properties.load(dbFileReader);
				properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.log(Level.SEVERE, e.getMessage());
			}
	
	}
	
	
//	public static String generateIDs(ArrayList<String> arrayList) {
//
//		String id;
//		int next = arrayList.size();
//		next++;
//		id = CommonConstants.STUDENT_ID_PREFIX + next;
//		if (arrayList.contains(id)) {
//			next++;
//			id = CommonConstants.STUDENT_ID_PREFIX + next;
//		}
//		return id;
//	}
}
