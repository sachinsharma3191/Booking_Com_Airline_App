package com.airline.common;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {

	public static Date convertStringToDate(String dateString) {
		Timestamp timestamp = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			Date parsedDate = dateFormat.parse(dateString);
			timestamp = new java.sql.Timestamp(parsedDate.getTime());
		} catch (Exception e) { // this generic but you can control another types of exception
			// look the origin of excption
		}
		return convertTimestampToDate(timestamp);
	}

	public static Date convertTimestampToDate(Timestamp time) {
		return new Date(time.getTime());

	}
}
