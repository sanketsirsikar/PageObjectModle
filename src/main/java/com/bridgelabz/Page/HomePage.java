package com.bridgelabz.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.bridgelabz.Base.BaseClass.driver;

public class HomePage {
    @FindBy(xpath = " //span[contains(text(),'My Profile')]")
    private WebElement Profilelink;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public String verifyHomePageTitle(){
        return driver.getTitle();
    }
    public ProfilePage gotoProfile(){
        Profilelink.click();
        return new ProfilePage();
    }
}

