package utils;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class JsonUtils {

	public static Boolean compareJson(String json1, String json2) {
		try {
			return JSONCompare.compareJSON(json2, json1, JSONCompareMode.NON_EXTENSIBLE).passed();
		} catch (JSONException e) {
			System.err.println("Error comparing json."+e.getMessage());
			return false;
		}
	}
}
