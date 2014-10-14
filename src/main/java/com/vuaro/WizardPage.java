package com.vuaro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

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

    @FindBy(xpath = ".//*[@id=\"client-job\"]")
    WebElement clientJob;

    public void setClientJob(String jobName){
        clientJob.sendKeys(jobName);
    }


    @FindBy(xpath = ".//*[@id=\"client-job_activity_kind\"]")
    WebElement clientJobType;

    public void setActivityType(String type){
        clientJobType.sendKeys(type);

    }


    @FindBy(xpath = ".//*[@id=\"client-job_joining_date\"]")
    WebElement clientJobDate;

    public void setClientJoiningDate(String date){
        clientJobDate.clear();
        clientJobDate.sendKeys(date);
    }

    @FindBy(xpath = ".//*[@id=\"client-phone_work\"]")
    WebElement workPhone;

    public void setClientPhoneWork(String phone){
        workPhone.sendKeys(phone);

    }

    @FindBy(xpath = ".//*[@id=\"client-job_post\"]")
    WebElement workPost;

    public void setClientWorkPost(String post){
        workPost.sendKeys(post);
    }




    @FindBy(xpath = ".//*[@id=\"client-total_experience_date_start\"]")
    WebElement workStart;

    public void setClientTotalExpFromDate(String date){
        workStart.clear();
        workStart.sendKeys(date);

    }


    @FindBy(xpath = ".//*[@id=\"client-job_employees_count\"]")
    WebElement employeeCount;

    public void setEmployeeCount(String count){
        employeeCount.sendKeys(count);
    }


    @FindBy(xpath = ".//*[@id=\"client-job_employer_phone\"]")
    WebElement employeePhone;

    public void setEmployeePhone(String phone){
        employeePhone.sendKeys(phone);
    }



    @FindBy(xpath = ".//*[@id=\"client-job_org_head\"]")
    WebElement headName;

    public void setClientJobOrgHead(String name){
        headName.sendKeys(name);
    }



    @FindBy(xpath = ".//*[@id=\"client-job_supervisor\"]")
    WebElement supervisorName;

    public void setSupervisorName(String name){
        supervisorName.sendKeys(name);
    }



    @FindBy(xpath = ".//*[@id=\"client-total_experience_year\"]")
    WebElement experienceYear;

    public void setExperienceYear(String year){
        experienceYear.sendKeys(year);
    }

    @FindBy(xpath = ".//*[@id=\"client-total_experience_month\"]")
    WebElement experienceMonth;

    public void setExperienceMonth(String month){
        experienceMonth.sendKeys(month);
    }



    @FindBy(xpath = ".//*[@id=\"client-average_income_6months\"]")
    WebElement srednSalary;

    public void setAverSalary(String salary){
        srednSalary.sendKeys(salary);
    }

    @FindBy(xpath = ".//label[@for=\"client-job_address_fact\"]")
    WebElement jobFactAddress;

    public void openFactJobAddressWindow(){
        jobFactAddress.click();
    }



    @FindBy(xpath = ".//label[@for=\"client-job_address_legal\"]")
    WebElement jobLegalAddress;

    public void openLegalJobAddressWindow(){
        jobLegalAddress.click();
    }

    @FindBy(xpath = ".//*[@id=\"client_education_chosen\"]")
    WebElement educationLevel;

    @FindBy(xpath = ".//*[@id=\"client_education_chosen\"]//li[text()=\"Неполное среднее\"]")
    WebElement eduLevel;

    public void setEducationLevel(){
        educationLevel.click();
        eduLevel.click();
    }

    @FindBy(xpath = ".//*[@id=\"contact-last_name\"]")
    WebElement contactLastName;

    public void setContactLastName(String lastName){
        contactLastName.sendKeys(lastName);
    }

    @FindBy(xpath = ".//*[@id=\"contact-first_name\"]")
    WebElement contactFirstName;

    public void setContactFirstName(String name){
        contactFirstName.sendKeys(name);
    }

    @FindBy(xpath = ".//*[@id=\"contact-middle_name\"]")
    WebElement contactMiddleName;

    public void setContactMiddleName(String middleName){
        contactMiddleName.sendKeys(middleName);
    }

    @FindBy(xpath = ".//*[@id=\"contact-relation_degree\"]")
    WebElement contactRelationDegree;

    public void setContactRelationDegree(String degree){
        contactRelationDegree.sendKeys(degree);
    }

    @FindBy(xpath = ".//*[@id=\"contact-post\"]")
    WebElement contactPost;

    public void setContactPost(String Post) {
        contactPost.sendKeys(Post);
    }

    @FindBy(xpath = ".//*[@id=\"contact-job\"]")
    WebElement contactJob;

    public void setContactJob(String job){
        contactJob.sendKeys(job);
    }

    @FindBy(xpath = ".//*[@id=\"contact-phone_cell\"]")
    WebElement contactPhoneCell;

    public void setContactPhoneCell(String phone) {
        contactPhoneCell.clear();
        contactPhoneCell.sendKeys(phone);
    }


    @FindBy(xpath = ".//span[text()=\"Загрузить документы\"]")
    WebElement documentsUploadBtn;

    public void setGoDocumentsUpload(){
        documentsUploadBtn.click();
        sleep(2000);
    }

    @FindBy(xpath = ".//div[@class=\"step-upload_group\"][1]/input")
    WebElement agreementUpload;

    public void uploadAgreement(String fileName){
        String script="b=document.getElementsByTagName('input')[0];\n" +
                "b.style.position=\"relative\";\n" +
                "b.style.top=\"0\";\n" +
                "b.style.width=\"200px\";\n" +
                "b.style.height=\"20px\";\n" +
                "b.style.opacity=100;";

        ((JavascriptExecutor)driver).executeScript(script);
        File file = new File(fileName);
//        driver.findElement(By.xpath(".//div[@class=\"step-upload_group\"][1]/input")).sendKeys(image.getAbsolutePath());
        agreementUpload.sendKeys(file.getAbsolutePath());
    }


    @FindBy(xpath = ".//div[@class=\"step-upload_group\"][2]/input")
    WebElement passportUpload;

    public void uploadPassportCopy(String fileName){

        String script="b=document.getElementsByTagName('input')[1];\n" +
                "b.style.position=\"relative\";\n" +
                "b.style.top=\"0\";\n" +
                "b.style.width=\"200px\";\n" +
                "b.style.height=\"20px\";\n" +
                "b.style.opacity=100;";

        ((JavascriptExecutor)driver).executeScript(script);

        File file = new File(fileName);

        passportUpload.sendKeys(file.getAbsolutePath());
    }

    @FindBy(xpath = ".//span[@class=\"i-juicy-button__text__bold\" and contains(text(),\"банк\")]")
    WebElement sendButton;

    public void sendRequestToBank(){
        sendButton.click();
    }









































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
