package com.vuaro;

import org.testng.annotations.*;

/**
 * Created by D503 on 13.10.14.
 */
public class WizardTest extends BaseActions{

    LoginPage loginPage;
    WizardPage wizardPage;

    @Parameters({"browser"})
    @BeforeClass
    public void init(String browser){

        start_session(browser);

        loginPage = new LoginPage(driver);
        wizardPage = new WizardPage(driver);


    }

    @BeforeMethod
    public void setUp(){

        loginPage.open();
        loginPage.login("selenium@mailinator.com","mypassword");
        wizardPage.open();

    }

    @Test
    public void sendCreditRequestTest(){

        wizardPage.selectConsumerCreditType();

        wizardPage.setPeriod("60");

        wizardPage.setAge("30");

        wizardPage.setWorkType(1);

        wizardPage.setSalary("80000");

        wizardPage.waitForOffers();

        wizardPage.getSelectBankTab();

        wizardPage.selectTestBank();

        wizardPage.getSelectAnketaTab();

        wizardPage.getCreateNewAnketa();

        //переходим к заполнению анкеты

        wizardPage.setClientLastName("Иванов");

        wizardPage.setClientFirstName("Иван");

        wizardPage.setClientMiddleName("Иванович");

        wizardPage.setClientBirthday("11.10.1986");

        wizardPage.setClientBirthPlace("Урюпинск");

        wizardPage.setClientPassport("1122333444");

        wizardPage.setClientPassportIssued("ОВД РОВД МВД ГИБДД");

        wizardPage.setClientPassportDate("11.10.2002");

        wizardPage.setClientCellPhone("9111111111");

        wizardPage.seClientSex("Мужской");

        wizardPage.openAddressPopUP();

            wizardPage.setOblast("Ленинградская");

            wizardPage.setLocality("Колпино");

            wizardPage.setStreet("Ленина");

            wizardPage.setHouseNumber("11");

            wizardPage.submitPopUpFormOkBtn();

        wizardPage.openAddressFactPopUP();

            wizardPage.setOblast("Ленинградская");

            wizardPage.setLocality("Колпино");

            wizardPage.setStreet("Ленина");

            wizardPage.setHouseNumber("11");

            wizardPage.submitPopUpFormOkBtn();

        wizardPage.setClientJob("Рога и копыта");

        wizardPage.setActivityType("ИТ");

        wizardPage.setClientJoiningDate("10.2013");

        wizardPage.setClientPhoneWork("4142323");

        wizardPage.setClientWorkPost("Директор по развитию");

        wizardPage.setClientTotalExpFromDate("10.2001");

        wizardPage.setEmployeeCount("500");

        wizardPage.setEmployeePhone("2342123");

        wizardPage.setClientJobOrgHead("Анатолий Васюков");

        wizardPage.setSupervisorName("Василий Анатольев");

        wizardPage.setExperienceYear("10");

        wizardPage.setExperienceMonth("5");

        wizardPage.setAverSalary("50000");

        wizardPage.openFactJobAddressWindow();

            wizardPage.setOblast("Ленинградская");

            wizardPage.setLocality("Колпино");

            wizardPage.setStreet("Ленина");

            wizardPage.setHouseNumber("11");

            wizardPage.submitPopUpFormOkBtn();

        wizardPage.openLegalJobAddressWindow();

            wizardPage.setOblast("Ленинградская");

            wizardPage.setLocality("Колпино");

            wizardPage.setStreet("Ленина");

            wizardPage.setHouseNumber("11");

            wizardPage.submitPopUpFormOkBtn();

        wizardPage.setEducationLevel();

        wizardPage.setContactLastName("Семенов");

        wizardPage.setContactFirstName("Толян");

        wizardPage.setContactMiddleName("Михалыч");

        wizardPage.setContactRelationDegree("Братан");

        wizardPage.setContactJob("Лесопилка");

        wizardPage.setContactPost("Слесарь");

        wizardPage.setContactPhoneCell("9053435678");

        //Переходим к загрузке документов

        wizardPage.setGoDocumentsUpload();

        wizardPage.uploadAgreement("testFiles/agreement.doc");

        wizardPage.uploadPassportCopy("testFiles/scan.jpg");

        wizardPage.sendRequestToBank();

        //все. в принципе, тут можно написать проверку на то, что вывелось сообщение об успех


















    }

    @AfterClass
    public void clear(){
        close_session();
    }
}
