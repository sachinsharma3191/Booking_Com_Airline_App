package com.airline.common;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

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

	public static boolean isNotNullOrEmptyString(String string) {
		return !isNullorEmptyString(string);
	}

	public static boolean isNullorEmptyString(String obj) {
		return obj.isEmpty() || obj.length() == 0 || "".equals(obj);
	}

	public static boolean isNotNullorEmptyObject(Object obj) {
		return !isNullorEmptyObject(obj);
	}

	public static boolean isNullorEmptyObject(Object obj) {
		return obj == null;
	}

	public static boolean isNotEmptyList(List<?> list) {
		return !isEmptyList(list);
	}

	public static boolean isEmptyList(List<?> list) {
		return list == null || list.isEmpty() || list.size() == 0;
	}
	
	public static <T> List<T> castList(Class<? extends T> clazz, Collection<?> c) {
	    List<T> r = new ArrayList<T>(c.size());
	    for(Object o: c)
	      r.add(clazz.cast(o));
	    return r;
	}
}
