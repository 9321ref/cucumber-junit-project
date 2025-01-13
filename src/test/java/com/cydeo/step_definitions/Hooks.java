package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
    In this class, we will be able to create "pre" and "post" condition
    for ALL the SCENARIOS and even STEPS.
*/
public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before (order = 1)
    public void SetupMethod(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }


    //@Before (value = "@login",order = 2) // ikinci bu execute olacak ama sadece login olan
    public void login_scenario_before(){
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");

    }
    /*
        @After will be executed automatically after EVERY scenario in the project
     */
    @After
    public void teardownMethod(Scenario scenario){

        //bunu ezberlemene gerek yok developer bu sekilde yazmis
        if (scenario.isFailed()) { // -> eger senaryo yanlissa ekran resmi alir
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");

        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }




   //@BeforeStep
    public void setupStep(){
        System.out.println("---> @BeforeStep: running before EACH STEP!");
    }

    //@AfterStep
    public void teardownStep(){
        System.out.println("-----> @AfterSTEP : Running after each step!");
    }





}
