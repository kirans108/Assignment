package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkedIn {
    public static void main(String[] args) throws InterruptedException {

            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.linkedin.com/");
            Thread.sleep(1000);
            driver.navigate().refresh();
            Thread.sleep(1000);
            driver.findElement(By.id("session_key")).sendKeys("Kiran");
            Thread.sleep(1000);
            driver.findElement(By.id("session_password")).sendKeys("Kiran");
            //perform page down page up actions
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(500);
            actions.sendKeys(Keys.PAGE_UP).perform();
            Thread.sleep(500);
            driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();
            driver.findElement(By.linkText("Forgot password?")).click();
            driver.findElement(By.className("back_button")).click();
            driver.findElement(By.id("join_now")).click();
            driver.findElement(By.name("email-or-phone")).sendKeys("kiran@gmail.com");
            driver.findElement(By.id("password")).sendKeys("kirabn1521@");
            driver.findElement(By.id("join-form-submit")).click();

    }
}
