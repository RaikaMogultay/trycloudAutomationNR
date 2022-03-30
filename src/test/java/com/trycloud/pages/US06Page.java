package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06Page extends LoginPage{

    public US06Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]")
    public WebElement favoriteModule;

    @FindBy(xpath = "/html/body/div[6]/div/ul/li[1]/a/span[2]")
    public WebElement removeFav;

    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesbutton;

    @FindBy (xpath = "//*[@class='filename']//*[@class='innernametext']")
    public WebElement favFileName;


}
