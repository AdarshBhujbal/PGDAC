package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\seleniumdata\\chromedriver-win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/v4/");
		d.findElement(By.linkText("here")).click();
		d.manage().window().maximize();
		d.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).sendKeys("adarsh");
		d.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]")).click();
		d.get("https://demo.guru99.com/v4/");
		Thread.sleep(2000);
		d.navigate().back();
	}

}
