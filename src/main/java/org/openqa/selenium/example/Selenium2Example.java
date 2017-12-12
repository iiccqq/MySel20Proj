package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2Example {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"d:\\chromedriver.exe");

		// ChromeOptions options = new ChromeOptions();
		// 通过配置参数禁止data;的出现
		// options.addArguments("--user-data-dir=C:/Users/Administrator/AppData/Local/Google/Chrome/User Data/Default");
		// 通过配置参数删除“您使用的是不受支持的命令行标记：--ignore-certificate-errors。稳定性和安全性会有所下降。”提示
		// options.addArguments("--start-maximized",
		// "allow-running-insecure-content", "--test-type");
		WebDriver driver = new ChromeDriver();// options);
		driver.get("http://test.iiccqq.com");
		// 定位输入框元素
		WebElement txtbox = driver.findElement(By.name("username"));
		// 在输入框输入文本
		txtbox.sendKeys("iiccqq");
		// 定位输入框元素
		WebElement password = driver.findElement(By.name("password"));
		// 在输入框输入文本
		password.sendKeys("Xxxx$xx");

		WebElement login = driver.findElement(By.className("formsubmit_btn"));
		login.click();
		// 关闭驱动
		// 定位按钮元素
		WebElement btn = driver.findElement(By.xpath("//button[text()='打卡']"));
		// 点击按钮
		btn.click();
		driver.close();

	}
}