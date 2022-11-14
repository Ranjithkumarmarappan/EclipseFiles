package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStart {
	public static void main(String[] args) {
		BrowserStart browser = new BrowserStart();
		browser.chrome();
		browser.fireFox();
		browser.ieBrowser();
	}
	private void chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\WorkSpace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// TODO Auto-generated method stub

	}
	private void fireFox() {
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse\\WorkSpace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		// TODO Auto-generated method stub

	}
	private void ieBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\eclipse\\WorkSpace\\Selenium\\Driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();  
		driver.get("https://www.facebook.com/");
		// TODO Auto-generated method stub

	}


}
