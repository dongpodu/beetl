package com.elisonwell.beetl;

import java.io.IOException;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;

public class BaseTest {
	protected static Template template=null;
	protected static GroupTemplate gt=null;
	static{
		ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader();
		Configuration cfg;
		try {
			cfg = Configuration.defaultConfiguration();
			gt = new GroupTemplate(resourceLoader, cfg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
