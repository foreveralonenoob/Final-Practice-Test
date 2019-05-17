package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM extends BasePage{

    private static WebDriver driver;

    public RegisterPOM(WebDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1"));
    }

    @FindBy(xpath= "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"customer.firstName\"]")
    WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"customer.lastName\"]")
    WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"customer.address.street\"]")
    WebElement addressField;

    @FindBy(xpath = "//*[@id=\"customer.address.city\"]")
    WebElement cityField;

    @FindBy(xpath = "//*[@id=\"customer.address.state\"]")
    WebElement stateField;

    @FindBy(xpath = "//*[@id=\"customer.address.zipCode\"]")
    WebElement zipCodeField;

    @FindBy(xpath = "//*[@id=\"customer.phoneNumber\"]")
    WebElement phoneNumberField;

    @FindBy(xpath = "//*[@id=\"customer.ssn\"]")
    WebElement SSNField;

    @FindBy(xpath = "//*[@id=\"customer.username\"]")
    WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"customer.password\"]")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"repeatedPassword\"]")
    WebElement confirmPasswordField;

    public void sendIt(){

        registerButton.click();
    }

    public void setFirstNameField(String firstName){

        firstNameField.click();
        firstNameField.sendKeys(firstName);
    }

    public void setLastNameField(String lastName){

        lastNameField.click();
        lastNameField.sendKeys(lastName);
    }

    public void setAddressField(String address){

        addressField.click();
        addressField.sendKeys(address);
    }

    public void  setCityField(String city){

        cityField.click();
        cityField.sendKeys(city);
    }

    public void setStateField(String state){

        stateField.click();
        stateField.sendKeys(state);
    }

    public void setZipCodeField(String zipCode){

        zipCodeField.click();
        zipCodeField.sendKeys(zipCode);
    }

    public void setPhoneNumberField(String phoneNumber){

        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void setSSNField(String SSN){

        SSNField.click();
        SSNField.sendKeys(SSN);
    }

    public void setUsernameField(String username){

        usernameField.click();
        usernameField.sendKeys(username);
    }

    public void setPasswordField(String password){

        passwordField.click();
        passwordField.sendKeys(password);
    }

    public void setConfirmPasswordField(String confirmPassword){

        confirmPasswordField.click();
        confirmPasswordField.sendKeys(confirmPassword);
    }
}
