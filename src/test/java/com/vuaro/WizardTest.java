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





    }

    @AfterClass
    public void clear(){
        close_session();
    }
}
