package Testcasesmodule5;

import java.util.ArrayList;
import java.util.Hashtable;

public class logintestcases {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		for(String i : list ) {
			
			System.out.println(i);
			
		Hashtable<String, String >table = new Hashtable<String, String>();
		
		table.put("name", "Ronak");
		table.put("place", "Indore");
		table.put("Profession", "IT");
		
		System.out.println(table.get("name"));		
				
		table.put("name", "ABCDE");
		System.out.println();
				
		}
		
	}

}
