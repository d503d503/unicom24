package com.vuaro;

import org.openqa.selenium.By;
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

    //------Anketa----

    @FindBy(xpath = ".//input[@id=\"client-last_name\"]")
    WebElement clientLastName;

    public void setClientLastName(String lastName){
        clientLastName.sendKeys(lastName);

    }

    @FindBy(xpath = ".//input[@id=\"client-first_name\"]")
    WebElement clientFirstName;

    public void setClientFirstName(String firstName){
        clientFirstName.sendKeys(firstName);

    }

    @FindBy(xpath = ".//input[@id=\"client-middle_name\"]")
    WebElement clientMiddleName;

    public void setClientMiddleName(String middleName){
        clientMiddleName.sendKeys(middleName);

    }

    @FindBy(xpath = ".//input[@id=\"client-birthday\"]")
    WebElement clientBirthday;

    public void setClientBirthday(String birthday){
        clientBirthday.clear();
        clientBirthday.sendKeys(birthday);

    }

    @FindBy(xpath = ".//input[@id=\"client-birthplace\"]")
    WebElement clientBirthplace;

    public void setClientBirthPlace(String birthplace){
        clientBirthplace.sendKeys(birthplace);

    }



    @FindBy(xpath = ".//input[@id=\"client-passport\"]")
    WebElement clientPassport;

    public void setClientPassport(String passport){
        clientPassport.sendKeys(passport);

    }

    @FindBy(xpath = ".//textarea[@id=\"client-passport_issue\"]")
    WebElement clientPassportIssued;

    public void setClientPassportIssued(String issuedInfo){
        clientPassportIssued.sendKeys(issuedInfo);

    }

    @FindBy(xpath = ".//input[@id=\"client-passport_date\"]")
    WebElement clientPassportDate;

    public void setClientPassportDate(String passportDate){
        clientPassportDate.clear();
        clientPassportDate.sendKeys(passportDate);

    }

    @FindBy(xpath = ".//input[@id=\"client-phone_cell\"]")
    WebElement clientCellPhone;

    public void setClientCellPhone(String cellPhoneNumber){
        clientCellPhone.clear();
        clientCellPhone.sendKeys(cellPhoneNumber);

    }

    @FindBy(xpath = ".//*[@id=\"client_sex_chosen\"]")
    WebElement sexChosen; //это див


    public void seClientSex(String sex){


        sexChosen.click();
        WebElement clientSex = driver.findElement(By.xpath(".//li[text()=\"Мужской\"]"));
        clientSex.click();


    }

    @FindBy(xpath = ".//label[@for=\"client-address_reg\"]")
    WebElement addressLabel;

    public void openAddressPopUP(){
        addressLabel.click();
    }

    //всплывающее окно ввода адреса
    @FindBy(xpath = ".//*[@id=\"region\"]")
    WebElement oblastInput;

    public void setOblast(String oblast){
        oblastInput.sendKeys(oblast);
    }

    @FindBy(xpath = ".//*[@id=\"locality\"]")
    WebElement localityInput;

    public void setLocality(String loc){
        localityInput.sendKeys(loc);
    }

    @FindBy(xpath = ".//*[@id=\"street\"]")
    WebElement streetInput;

    public void setStreet(String street){
        streetInput.sendKeys(street);
    }

    @FindBy(xpath = ".//*[@id=\"house_number\"]")
    WebElement houseNumberInput;

    public void setHouseNumber(String houseNum){
        houseNumberInput.sendKeys(houseNum);
    }


    @FindBy(xpath = ".//*[@class=\"i-button__text\" and text()=\"ОК\"]")
    WebElement submitPopUpButton;

    public void submitPopUpFormOkBtn(){
        submitPopUpButton.click();
    }

    @FindBy(xpath = ".//label[@for=\"client-address_fact\"]")
    WebElement addressFactLabel;

    public void openAddressFactPopUP(){
        addressFactLabel.click();
    }


    //


    @FindBy(xpath = ".//*[@textarea=\"client-address_reg\"]")
    WebElement addressRegistered;

    @FindBy(xpath = ".//*[@textarea=\"client-address_fact\"]")
    WebElement addressFact;

    @FindBy(xpath = ".//*[@input=\"client-job\"]")
    WebElement clientJob;


    @FindBy(xpath = ".//*[@input=\"client-job_activity_kind\"]")
    WebElement clientJobType;


    @FindBy(xpath = ".//*[@input=\"client-job_joining_date\"]")
    WebElement clientJobDate;

    @FindBy(xpath = ".//*[@input=\"client-phone_work\"]")
    WebElement workPhone;

    @FindBy(xpath = ".//*[@input=\"client-job_post\"]")
    WebElement workPost;


    @FindBy(xpath = ".//*[@input=\"client-total_experience_date_start\"]")
    WebElement workStart;


    @FindBy(xpath = ".//*[@input=\"client-job_employer_phone\"]")
    WebElement employeePhone;

    @FindBy(xpath = ".//*[@input=\"client-job_org_head\"]")
    WebElement headName;

    @FindBy(xpath = ".//*[@input=\"client-job_supervisor\"]")
    WebElement supervisorName;

    @FindBy(xpath = ".//*[@input=\"client-total_experience_year\"]")
    WebElement experienceYear;

    @FindBy(xpath = ".//*[@input=\"client-total_experience_month\"]")
    WebElement experienceMonth;

    @FindBy(xpath = ".//*[@input=\"client-average_income_6months\"]")
    WebElement srednSalary;

    @FindBy(xpath = ".//*[@input=\"client-job_address_fact\"]")
    WebElement jobFactAddress;

    @FindBy(xpath = ".//*[@input=\"client-job_address_legal\"]")
    WebElement jobLegalAddress;

    @FindBy(xpath = ".//*[@input=\"client_education_chosen\n\"]")
    WebElement educationLevel;

    @FindBy(xpath = ".//*[@id=\"contact-last_name\n\"]")
    WebElement contactLastName;

    @FindBy(xpath = ".//*[@id=\"contact-first_name\n\"]")
    WebElement contactFirstName;

    @FindBy(xpath = ".//*[@id=\"contact-middle_name\n\"]")
    WebElement contactMiddleName;

    @FindBy(xpath = ".//*[@id=\"contact-relation_degree\n\"]")
    WebElement contactRelationDegree;

    @FindBy(xpath = ".//*[@id=\"contact-post\n\"]")
    WebElement contactPost;

    @FindBy(xpath = ".//*[@id=\"contact-job\n\"]")
    WebElement contactJob;

    @FindBy(xpath = ".//*[@id=\"contact-phone_cell\n\"]")
    WebElement contactPhoneCell;









































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
