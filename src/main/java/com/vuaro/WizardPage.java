package com.vuaro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by D503 on 13.10.14.
 */
public class WizardPage extends BaseActions{

    private String page_url="https://unicom24.ru/lk/wizard/";

    @FindBy(xpath = ".//*[text()=\"Потребительский кредит\"]")
    private WebElement consumerCreditType;


    @FindBy(xpath = ".//*[text()=\"Автокредит\"]")
    private WebElement vehicleCreditType;

    @FindBy(xpath = ".//*[@id='period' and @name = \"period\"]")
    private WebElement period;

    @FindBy(xpath = ".//*[@id='period' and @name = \"age\"]")
    private WebElement age;

    @FindBy(xpath = ".//*[@id=\"monthlyIncome\"]")
    private WebElement salary;

    @FindBy(xpath = ".//span[contains(text(),\"Выбрать банки\")]")
    WebElement goBanks;

    @FindBy(xpath = ".//*[text()='Тестовый банк (для обучения)']")
    WebElement testBankCheckbox;


    @FindBy(xpath = ".//span[contains(text(),\"Заполнить анкету\")]")
    WebElement goAnketa;

    @FindBy(xpath = ".//span[contains(text(),\"Создать новую анкету\")]")
    WebElement createNewAnketa;


    public WizardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void open(){
        driver.get(page_url);
        sleep(2000);//todo переписать на нормальное ожидание появление формы

    }


    public void selectConsumerCreditType(){
        consumerCreditType.click();

    }


    public void setPeriod(String period){
        this.period.sendKeys(period);
    }


    public void setAge(String s) {
        age.sendKeys(s);
    }

    public void setWorkType(int i) {
        /*
        TODO implement this method - by default is not necessary to fill him
         */
    }


    public void setSalary(String sal) {
        salary.sendKeys(sal);
    }

    public void waitForOffers() {
        //todo temp realization
        sleep(10000);
    }

    public void getSelectBankTab() {
        goBanks.click();


    }

    public void selectTestBank() {
        testBankCheckbox.click();
    }

    public void getSelectAnketaTab() {

        goAnketa.click();

    }

    public void getCreateNewAnketa() {

        createNewAnketa.click();

    }
}
