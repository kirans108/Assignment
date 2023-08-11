package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramPage {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input")).sendKeys("kiran");
        driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("kiran@123");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Back to login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Sign up")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("8512558745646");
        driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("kumar");
        driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("s@004");
        driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("#@kjdbfja");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[@alt='Get it on Google Play'][1]")).click();
        driver.close();
    }
}
