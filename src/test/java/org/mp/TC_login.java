package org.mp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_login {
    @Test
    public void login_test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement((By.id("btnLogin"))).click();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

        driver.close();

    }
}
