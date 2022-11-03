package com.LBP_PRO_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Setup {
	public WebDriver driver;

	@BeforeTest
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--headed--");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void closeDriver() {
		// driver.quit();
	}
}