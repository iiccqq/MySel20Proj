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
		// ͨ�����ò�����ֹdata;�ĳ���
		// options.addArguments("--user-data-dir=C:/Users/Administrator/AppData/Local/Google/Chrome/User Data/Default");
		// ͨ�����ò���ɾ������ʹ�õ��ǲ���֧�ֵ������б�ǣ�--ignore-certificate-errors���ȶ��ԺͰ�ȫ�Ի������½�������ʾ
		// options.addArguments("--start-maximized",
		// "allow-running-insecure-content", "--test-type");
		WebDriver driver = new ChromeDriver();// options);
		driver.get("http://test.iiccqq.com");
		// ��λ�����Ԫ��
		WebElement txtbox = driver.findElement(By.name("username"));
		// ������������ı�
		txtbox.sendKeys("iiccqq");
		// ��λ�����Ԫ��
		WebElement password = driver.findElement(By.name("password"));
		// ������������ı�
		password.sendKeys("Xxxx$xx");

		WebElement login = driver.findElement(By.className("formsubmit_btn"));
		login.click();
		// �ر�����
		// ��λ��ťԪ��
		WebElement btn = driver.findElement(By.xpath("//button[text()='��']"));
		// �����ť
		btn.click();
		driver.close();

	}
}