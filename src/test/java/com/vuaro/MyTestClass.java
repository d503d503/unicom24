package com.vuaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by D503 on 12.10.14.
 */
public class MyTestClass {

    private WebDriver driver;

    @Parameters({"browser"})
    @BeforeClass
    public void setUp(String browser){
         if(browser.equalsIgnoreCase("firefox")) {
             this.driver=new FirefoxDriver();
         }

        driver.manage().deleteAllCookies();
    }

    @Test(enabled = true)
    public void testClass(){

        driver.get("https://unicom24.ru/lk/accounts/login/");

        WebElement login = driver.findElement(By.xpath(".//*[@id='id_username']")) ;
        WebElement password = driver.findElement(By.xpath(" .//*[@id='id_password']")) ;
        WebElement form = driver.findElement(By.xpath(".//form[@class='js-account-form clearfix']")) ;


        login.sendKeys("selenium@mailinator.com");
        password.sendKeys("mypassword");
        form.submit();






    }

    @AfterClass
    public void tearDown(){

        driver.close();
    }
}
