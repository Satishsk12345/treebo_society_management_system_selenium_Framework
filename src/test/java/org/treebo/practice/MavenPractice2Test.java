package org.treebo.practice;

import org.testng.annotations.Test;

import treebo.genericUtility.WebDriverUtility;





public class MavenPractice2Test {
	@Test(groups = "sanity")
	public void step1Test() {
		String browser=System.getProperty("b");
		String url=System.getProperty("u");
		System.out.println("Browser name is =======>>>>>>"+browser);
		System.out.println("URL is ======>>>>>>>    "+url);
		
		WebDriverUtility webdriver = new WebDriverUtility();
		webdriver.openBrowserWithApplication(browser, 10l, url);
		
	}

}
