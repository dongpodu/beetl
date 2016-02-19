package com.elisonwell.beetl;

import java.util.HashMap;
import java.util.Map;

public class Test extends BaseTest{
	public static void main(String[] args) throws Exception{
		Map<String,String> map = new HashMap<String, String>();
		map.put("name", "sushi");
		map.put("age", "20");
		template.binding("map", map);
		
		String str = template.render();
		System.out.println(str);
	}
}
