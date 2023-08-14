package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Validation {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("swamykiran97@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Kiran@0426");
        Thread.sleep(3000);
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(3000);
        String title= driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);
       // driver.switchTo().alert().dismiss();

        if
          (driver.findElement(By.xpath("//span[text()='Automation TestData']")).isDisplayed())
           System.out.println("Username is Displayed");
        else
        System.out.println("Username is not displayed");

        if(driver.findElement(By.xpath("//span[text()='Memories']")).isEnabled())
        System.out.println("Button is unabled");
        else
            System.out.println("Button is not unabled");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[name()='g' and contains(@mask,'url(#:R6km')]//*[name()='image' and contains(@x,'0')]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();
        driver.findElement(By.xpath("//a[@id='u_0_0_lG']")).click();
        WebElement btnselect= driver.findElement(By.xpath("//input[@id='u_9_5_ww']"));
        btnselect.click();
        Thread.sleep(2000);
        if(btnselect.isSelected())
        System.out.println("Button is selected");
        else
        System.out.println("Button is not selected");











    }
}
