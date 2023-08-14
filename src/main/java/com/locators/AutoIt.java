package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.io.IOException;

public class AutoIt {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("swamykiran97@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Kiran@0426");
        Thread.sleep(3000);
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Add Picture']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Upload Photo']")).click();
        Thread.sleep(1000);
        Runtime.getRuntime().exec("C:\\Users\\kiran\\OneDrive\\Documents\\firstautoIT.exe");
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.mouseWheel(5);
        driver.findElement(By.xpath("//span[text()='Save']")).click();
        Thread.sleep(5000);
        driver.close();




    }
}
