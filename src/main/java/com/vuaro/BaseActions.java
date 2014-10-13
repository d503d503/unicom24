package com.vuaro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by D503 on 13.10.14.
 */
public class BaseActions extends Assert {

    WebDriver driver;

    @Parameters({"browser"})
    public void start_session(String browser){
        if(browser.equals("firefox")){
           driver = new FirefoxDriver();
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

    }

    public void close_session(){
        driver.close();
    }

    public void click(WebElement element) {
        element.click();
    }

    /**
     * Эта херня только для дебага.
     * @param time
     */
    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
