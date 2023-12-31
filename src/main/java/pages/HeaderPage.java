package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends ActionPage {
    @FindBy(xpath="//a[@class='site-nav__title' and contains(@href,'/custom/')]")
    WebElement customMenuButton;
    @FindBy(xpath="//a[text()='My Location']")
    WebElement myLocationButton;
    @FindBy(xpath="//a[text()='My Units']")
    WebElement myUnitsButton;
    @FindBy(xpath="//a[text()='My Events']")
    WebElement myEventsButton;
    @FindBy(xpath="//a[text()='My World Clock']")
    WebElement myWorldClockButton;
    @FindBy(xpath="//li[@class='site-nav__item site-nav__item--divider']//a[@href='/custom/privacy.html']")
    WebElement myPrivacyButton;
    @FindBy(xpath="//a[text()='Paid Services']")
    WebElement paidServiceButton;
    @FindBy(xpath="//a[text()='Sign in']")
    WebElement singInButton;
    @FindBy(xpath="//a[@id='popreg']")
    WebElement registerButton;

    public HeaderPage(WebDriver driver){super(driver);}

    public void  clickCustomMenuButton(){
        waitForElementVisible(customMenuButton);
        clickElement(customMenuButton);
    }
    public void  clickMyLocationButton(){
        //waitForElementVisible(customMenuButton);
        hoverElement(customMenuButton);
        clickElement(myLocationButton);
    }
    public void  clickMyUnitsButton(){
        //waitForElementVisible(customMenuButton);
        hoverElement(customMenuButton);
        clickElement(myUnitsButton);
    }
    public void  clickMyEventsButton(){
        //waitForElementVisible(customMenuButton);
        hoverElement(customMenuButton);
        clickElement(myEventsButton);
    }
    public void  clickMyWorldClockButton(){
        //waitForElementVisible(customMenuButton);
        hoverElement(customMenuButton);
        clickElement(myWorldClockButton);
    }
    public void  clickMyPrivacyButton(){
        //waitForElementVisible(customMenuButton);
        hoverElement(customMenuButton);
        clickElement(myPrivacyButton);
    }
    public void  clickPaidServiceButton(){
        //waitForElementVisible(customMenuButton);
        hoverElement(customMenuButton);
        clickElement(paidServiceButton);
    }
    public void  clickSingInButton(){
        //waitForElementVisible(customMenuButton);
        hoverElement(customMenuButton);
        clickElement(singInButton);
    }
    public void  clickRegisterButton(){
        //waitForElementVisible(customMenuButton);
        hoverElement(customMenuButton);
        clickElement(registerButton);
    }
}
