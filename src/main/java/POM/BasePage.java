package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
        public WebDriver driver;

        public BasePage(WebDriver driver) {

            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
    WebElement registerFeatureLink;

    public void setRegisterFeatureLink(){

        registerFeatureLink.click();
    }
}
