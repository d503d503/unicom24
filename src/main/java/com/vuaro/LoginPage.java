package com.vuaro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by D503 on 13.10.14.
 */
public class LoginPage  extends BaseActions{

    private String login_page="https://unicom24.ru/lk/accounts/login/";

    @FindBy(xpath = ".//*[@id='id_username']")
    WebElement loginField;

    @FindBy(xpath = " .//*[@id='id_password']")
    WebElement passField;

    @FindBy(xpath = ".//form[@class='js-account-form clearfix']")
    WebElement loginForm;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void open() {
        driver.get(login_page);
    }


    public void login(String s, String pass) {

        loginField.sendKeys(s);
        passField.sendKeys(pass);

        loginForm.submit();


    }
}
