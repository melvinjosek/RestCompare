package solution;

import java.io.File;
import java.util.Scanner;

import utils.JsonUtils;

public class JsonCompare {

	public static void main(String[] args) {

		try (Scanner scFile1 = new Scanner(new File("src\\main\\resources\\json1.txt"), "UTF-8");
				Scanner scFile2 = new Scanner(new File("src\\\\main\\\\resources\\\\json2.txt"), "UTF-8")) {
			while (scFile1.hasNextLine() && scFile2.hasNextLine()) {
				String json1 = scFile1.nextLine();
				String json2 = scFile2.nextLine();
				if (JsonUtils.compareJson(json1, json2)) {
					System.out.println(" equals ");
				} else {
					System.out.println(" not equals ");
				}	
			}
		} catch (Exception e) {
			System.out.print("Exception triggered :" + e.getMessage());
		}
	}
}
