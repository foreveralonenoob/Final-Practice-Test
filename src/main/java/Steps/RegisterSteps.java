package Steps;

import POM.BasePage;
import POM.RegisterPOM;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class RegisterSteps {

    Hook thisIsTheHook;
    RegisterPOM registerOBJ;

    public RegisterSteps(Hook thisIsTheHook){
        this.thisIsTheHook = thisIsTheHook;
    }

    public RegisterPOM getRegisterOBJ(){
        if(registerOBJ == null){
            registerOBJ = new RegisterPOM(thisIsTheHook.getTheDriver());
        }
        return registerOBJ;
    }

    @Given("I enter the website")
    public void iEnterTheWebsite() {

        thisIsTheHook.getTheDriver().navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("I launch the application")
    public void iLaunchTheApplication() {
        BasePage basePGOBJ = new BasePage(thisIsTheHook.getTheDriver());
        basePGOBJ.setRegisterFeatureLink();
        getRegisterOBJ();
    }

    @And("Enter the first name")
    public void enterTheFirstName() {
        registerOBJ.setFirstNameField("Test");
    }

    @And("Enter the last name")
    public void enterTheLastName() {
        registerOBJ.setLastNameField("User");
    }

    @And("Enter the address")
    public void enterTheAddress() {
        registerOBJ.setAddressField("Random Main Street");
    }

    @And("Enter the city")
    public void enterTheCity() {
        registerOBJ.setCityField("NoOnesCity");
    }

    @And("Enter the state")
    public void enterTheState() {
        registerOBJ.setStateField("NoSuchState");
    }

    @And("Enter the zip code")
    public void enterTheZipCode() {
        registerOBJ.setZipCodeField("123456");
    }

    @And("Enter the phone number")
    public void enterThePhoneNumber() {
        registerOBJ.setPhoneNumberField("4021992127");
    }

    @And("Enter the SSN")
    public void enterTheSSN() {
        registerOBJ.setSSNField("87654");
    }

    @And("Enter the username")
    public void enterTheUsername() {
        registerOBJ.setUsernameField("testuser123");
    }

    @And("Enter the password")
    public void enterThePassword() {
        registerOBJ.setPasswordField("somepassword");
    }

    @And("Enter the confirmation password")
    public void enterTheConfirmationPassword() {
        registerOBJ.setConfirmPasswordField("somepassword");
    }

    @And("Enter click the register button")
    public void enterClickTheRegisterButton() {
        registerOBJ.sendIt();
    }

    @Then("I should see the account created")
    public void iShouldSeeTheAccountCreated() {
        thisIsTheHook.getTheDriver().findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
    }

    @And("Enter the first name with numbers")
    public void enterTheFirstNameWithNumbers() {
        registerOBJ.setFirstNameField("45214");
    }

    @And("Enter the last name with numbers")
    public void enterTheLastNameWithNumbers() {
        registerOBJ.setLastNameField("685412");
    }

    @And("Enter the city with numbers")
    public void enterTheCityWithNumbers() {
        registerOBJ.setCityField("98678");
    }

    @And("Enter the state with numbers")
    public void enterTheStateWithNumbers() {
        registerOBJ.setStateField("9854336");
    }

    @And("Enter the username with an excessive number of characters")
    public void enterTheUsernameWithAnExcessiveNumberOfCharacters() {
        registerOBJ.setUsernameField("ds5qcqqfyc2v35ys9l00s3tdmgxgbi7b6ffatawobgsak1bclf4uamcyndqgpgz8v1xzosbvr9hj0ruiunpf0r");
    }
}
