package com.elisonwell.beetl;

import java.util.ArrayList;
import java.util.List;

public class ForTest extends BaseTest{
	public static void main(String[] args) throws Exception{
		List<String> list = new ArrayList<String>();
		list.add("duyisong");
		list.add("elisonwell");
		list.add("sushi");
		template = gt.getTemplate("/com/elisonwell/beetl/resource/forTest.text");
		template.binding("list",list);
		String str = template.render();
		System.out.println(str);
	}
}
