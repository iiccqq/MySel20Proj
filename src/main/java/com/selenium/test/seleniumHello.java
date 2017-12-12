package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumHello {

    public static void main(String[] args) {
    	
        System.setProperty("webdriver.gecko.driver", "d:/geckodriver.exe"); 
        //定义驱动对象为 FirefoxDriver 对象
        WebDriver driver = new FirefoxDriver();
        //驱动的网址
        driver.get("https://www.baidu.com/");
        //浏览器窗口变大
        driver.manage().window().maximize();
        //定位输入框元素
        WebElement txtbox = driver.findElement(By.name("wd"));
        //在输入框输入文本
        txtbox.sendKeys("HelloWorld");
        //定位按钮元素
        WebElement btn = driver.findElement(By.id("su"));
        //点击按钮
        btn.click();
        //关闭驱动
        driver.close();


    }

}