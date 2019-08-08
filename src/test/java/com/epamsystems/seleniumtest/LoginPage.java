package com.epamsystems.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	WebDriver driver;

	@Test
	public void login1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.starwars.com/");

		// Click on login link
		WebElement loginLnl = driver.findElement(By.xpath("//*[@id='nav-utility']//div[contains(text(),'Log In')]"));
		loginLnl.click();

		// Enter userID
		WebElement userID = driver.findElement(By.xpath("//input[@type='email']"));
		userID.sendKeys("mdalam7841@gmail.com");

		// Enter password
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("s1234567");

		// Click on login button
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		loginBtn.click();

		// Get page title
		String pageTitle = driver.getCurrentUrl();
		System.out.println("Page URL: " + pageTitle);

		// Enter logout button
		WebElement logOut = driver.findElement(By.xpath("//input[@type='output']"));
		logOut.click();

	}

	@Test
	public void login2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.starwars.com/video");


		// Click on login link
		WebElement loginLnl = driver.findElement(By.xpath("//*[@id='nav-utility']/div[2]/div[1]/div[1]"));
		loginLnl.click();

		// Enter UserID
		WebElement userID = driver
				.findElement(By.xpath("//*[@id='did-ui-view']/div//section/div[1]/div//span[2]/input"));
		userID.sendKeys("mdalam7841@gmail.com");

		// Enter Password
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("s1234567");

		// Click on login button
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		loginBtn.click();

		// Page title
		String pageTitle = driver.getCurrentUrl();
		System.out.println("Page URL: " + pageTitle);

		// Click on login button
		WebElement logOut = driver.findElement(By.xpath("//input[@type='output']"));
		logOut.click();

	}

	@Test
	public void login3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.starwars.com/films");

		// click on login button
		WebElement loginLnl = driver.findElement(By.xpath("//*[@id='nav-utility']/div[2]/div[1]/div[1]"));
		loginLnl.click();

		// Enter userID
		WebElement userID = driver.findElement(By.xpath("//input[@type='email']"));
		userID.sendKeys("mdalam7841@gmail.com");

		// Enter Password
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("s1234567");

		// Click on login button
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		loginBtn.click();

		// Page Title
		String pageTitle = driver.getTitle();
		System.out.println("Page URL: " + pageTitle);

		// Click on login button
		WebElement logOut = driver.findElement(By.xpath("//input[@type='output']"));
		logOut.click();

	}

}
