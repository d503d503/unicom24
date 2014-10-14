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






    }

    @AfterClass
    public void clear(){
        close_session();
    }
}
