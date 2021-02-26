package solution;

import java.io.File;
import java.util.Scanner;

import utils.JsonUtils;
import utils.RestUtils;

public class RestCompare {

	public static void main(String[] args) {

		try (Scanner scFile1 = new Scanner(new File("src\\main\\resources\\File1.txt"), "UTF-8");
				Scanner scFile2 = new Scanner(new File("src\\\\main\\\\resources\\\\File2.txt"), "UTF-8")) {
			while (scFile1.hasNextLine() && scFile2.hasNextLine()) {
				String url1 = scFile1.nextLine();
				String url2 = scFile2.nextLine();
				if (JsonUtils.compareJson(RestUtils.getRequest(url1), RestUtils.getRequest(url2))) {
					System.out.println(url1 + " equals " + url2);
				} else {
					System.out.println(url1 + " not equals " + url2);
				}
			}
		} catch (Exception e) {
			System.err.print("Exception encountered :" + e.getMessage());
		}
	}
}
