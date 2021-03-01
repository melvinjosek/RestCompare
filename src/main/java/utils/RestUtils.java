package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestUtils {

	public static String getRequest(String urlStr) {
		HttpURLConnection conn = null;
		try {
			URL url = new URL(urlStr);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:221.0) Gecko/20100101 Firefox/31.0");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String outputLne;
			String output = "";
			while ((outputLne = br.readLine()) != null) {
				output = output + outputLne;
			}
			br.close();
			return output;

		} catch (MalformedURLException e) {
			System.err.println("MalformedURLException" + e.getMessage());
			return null;

		} catch (IOException e) {
			System.err.println("IOException" + e.getMessage());
			return null;
		} finally {
			if (conn != null)
				conn.disconnect();
		}
	}

}
