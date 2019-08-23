package jp.co.internous.action;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("0");
		list.add("taro");
		list.add("3");
		list.add("4");
		list.add("5");

		for (int i = 1; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (String s : list) {
			System.out.println(s);
		}

	}

}
