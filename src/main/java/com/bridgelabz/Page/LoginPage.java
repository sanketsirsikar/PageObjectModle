package com.bridgelabz.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.bridgelabz.Base.BaseClass.driver;

public class LoginPage {
    @FindBy(id = "email_input")
    private WebElement emailfieald;
    @FindBy(id = "mob_password")
    private WebElement Passwordfieald;
    @FindBy(xpath= "//button[@id='mob_login_password_submit']")
    private WebElement SigninButoon;

    public LoginPage(){
        PageFactory.initElements(driver,this);

    }
    public HomePage login(String uname, String pwd){
        emailfieald.sendKeys(uname);
        Passwordfieald.sendKeys(pwd);
        SigninButoon.click();
        return new HomePage();

    }
    public String verifyLoginPageTitle(){
        return driver.getTitle();
    }

}


