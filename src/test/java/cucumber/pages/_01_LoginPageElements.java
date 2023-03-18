package cucumber.pages;

import cucumber.utilities.Driver_Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _01_LoginPageElements {


    public _01_LoginPageElements() {
        PageFactory.initElements(Driver_Base.getDriver(), this);

    }

    @FindBy(id = "input#user_login")
    private WebElement usernameInput;
    @FindBy(id = "input#user_password")
    private WebElement passwordInput;

    @FindBy(id = "//input[@value='Sign in']")
    private WebElement signInButton;

    public WebElement getUsernameInput() {
        return usernameInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
}
