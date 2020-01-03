package com.airline.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AirlineData {

	private static final String FOLDER_NAME = "src/main/resources/static/";
	private static String[] FILES = new String[4];
	private static String FILE_NAMES[] = { "airlines.dat", "airports.dat", "planes.dat", "routes.dat" };

	static {
		int counter = 0;

		for (String fileName : FILE_NAMES) {
			FILES[counter++] = new StringBuffer().append(FOLDER_NAME).append(fileName).toString();
		}
		
	}

	public static String[] readAirlineFile() {

		String[] lines = null;
		try {
			lines = Files.readAllLines(Paths.get(FILES[0])).toArray(new String[0]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}

	public static String[] readAirPlaneFile() {
		String[] lines = null;
		try {
			lines = Files.readAllLines(Paths.get(FILES[1])).toArray(new String[0]);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}

	public static String[] readAirportFile() {
		String[] lines = null;
		try {
			lines = Files.readAllLines(Paths.get(FILES[2])).toArray(new String[0]);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}

	public static String[] readAirRouteFile() {
		String[] lines = null;
		try {
			lines = Files.readAllLines(Paths.get(FILES[3])).toArray(new String[0]);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
}
