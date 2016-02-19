package com.elisonwell.beetl;


public class IfTest extends BaseTest{
	public static void main(String[] args) throws Exception{
		boolean flag = true;
		template = gt.getTemplate("/com/elisonwell/beetl/resource/ifTest.text");
		
		
		template.binding("flag",flag);
		template.binding("name","duyisong");
		
		
		String str = template.render();
		System.out.println(str);
	}
}
