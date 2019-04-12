package com.airline.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class AirlineData {

	private static final String FOLDER_NAME = "src/main/resources/static/";
	private static File FOLDER = null;
	private static File[] FILES = null;
	static {
		FOLDER = new File(FOLDER_NAME);
		FILES = FOLDER.listFiles();
		
		//for(File file : FILES) {
		//	System.out.println(file.getName());
		//}
	}

	public static String[] readAirlineFile() {

		String[] lines = null;
		try {
			lines = Files.readAllLines(FILES[0].toPath()).toArray(new String[0]);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}

	public static String[] readAirPlaneFile() {
		String[] lines = null;
		try {
			lines = Files.readAllLines(FILES[3].toPath()).toArray(new String[0]);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}

	public static String[] readAirportFile() {
		String[] lines = null;
		try {
			lines = Files.readAllLines(FILES[2].toPath()).toArray(new String[0]);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}

	public static String[] readAirRouteFile() {
		String[] lines = null;
		try {
			lines = Files.readAllLines(FILES[4].toPath()).toArray(new String[0]);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
}
