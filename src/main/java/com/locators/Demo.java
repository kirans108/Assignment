package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;

public class Demo {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException, IOException, AWTException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("swamykiran97@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kiran@0426");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Not Now']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create")).click();
        Thread.sleep(3000);

        Robot robot = new Robot();
        robot.mouseMove(666,502);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        Runtime.getRuntime().exec("C:\\Users\\kiran\\OneDrive\\Documents\\InstaAutoit.exe");
        driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'Next')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='button'][normalize-space()='Share']")).click();
    }

}
