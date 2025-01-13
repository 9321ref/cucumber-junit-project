package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    //#1- Create the constructor and initialize the driver with an object
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[text()='Alle akzeptieren']")
    public WebElement acceptierenBox;



    //#2- Use @FindBy instead of findElement()
    @FindBy(name = "q")
    public WebElement searchBox;


}
