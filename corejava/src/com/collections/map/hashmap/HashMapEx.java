package com.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		

		
		map.put(1,"chakri");
		map.put(2,"chenna");
		map.put(3,"chandhu");
		
		for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  

	}
		
		String value = map.get(1);
		System.out.println(value);
		
		

	}
}