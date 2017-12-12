package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumHello {

    public static void main(String[] args) {
    	
        System.setProperty("webdriver.gecko.driver", "d:/geckodriver.exe"); 
        //������������Ϊ FirefoxDriver ����
        WebDriver driver = new FirefoxDriver();
        //��������ַ
        driver.get("https://www.baidu.com/");
        //��������ڱ��
        driver.manage().window().maximize();
        //��λ�����Ԫ��
        WebElement txtbox = driver.findElement(By.name("wd"));
        //������������ı�
        txtbox.sendKeys("HelloWorld");
        //��λ��ťԪ��
        WebElement btn = driver.findElement(By.id("su"));
        //�����ť
        btn.click();
        //�ر�����
        driver.close();


    }

}