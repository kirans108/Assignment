package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class InstagramAutomation extends BaseClass{

    @Test
    public void takescreenshots() throws InterruptedException, IOException {
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("swamykiran97@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kiran@0426");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
        Thread.sleep(5000);
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File ss=screenshot.getScreenshotAs(OutputType.FILE);
        File destination= new File("C:\\Users\\kiran\\IdeaProjects\\SeleniumProject\\src\\main\\resources\\srcshot2.jpg");
        FileHandler.copy(ss,destination);


    }

    @Test
    public void validation() throws InterruptedException {
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("swamykiran97@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kiran@0426");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
        driver.findElement(By.xpath("//div[text()='Not Now']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Profile")).click();

        if(driver.findElement(By.linkText("automationtestdata")).isDisplayed())
        System.out.println("usename is displayed");
        else
        System.out.println("username is not displayed");

        if(driver.findElement(By.linkText("Edit profile")).isEnabled())
        System.out.println("button is unable");
        else
        System.out.println("Button is not unabled");


    }
    @Test
    public void fileUploadUsingSendKeys() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("swamykiran97@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kiran@0426");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Not Now']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create")).click();
        driver.findElement(By.xpath("//button[text()='Select from computer']")).sendKeys("C:\\Users\\kiran\\Downloads\\sampleFile.jpeg");
        driver.findElement(By.xpath("//div[text()='Next']")).click();
        driver.findElement(By.xpath("//div[text()='Next']")).click();
        driver.findElement(By.xpath("//div[text()='Share']")).click();
    }
    @Test
    public void fileUploadUsingrobotclass() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("swamykiran97@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Kiran@0426");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Not Now']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create")).click();
        Thread.sleep(2000);
        StringSelection selection = new StringSelection("C:\\Users\\kiran\\Downloads\\sampleFile.jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        Robot robot = new Robot();
        robot.mouseMove(666,502);


        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);


        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);


    }
    @Test
    public void fileUploadUsingAutoIt() throws InterruptedException, IOException, AWTException {
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
