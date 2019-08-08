package com.epamsystems.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	int Time_In_Mili = 10;
	WebDriver driver;

	@Before
	public void setUP() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Time_In_Mili, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {
		driver.close();
	}
	

}
