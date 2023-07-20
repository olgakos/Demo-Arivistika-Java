package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    // locators
    private SelenideElement nameInput = $("#username");
    private SelenideElement passwordInput = $("#password");
    private SelenideElement buttonLog = $(By.name("login"));
    private SelenideElement textError = $(".woocommerce-error");

    // actions
    public void setNameInput(String username) {
        nameInput.setValue(username);
    }
    public void setPasswordInput(String password) { passwordInput.setValue(password); }
    public void buttonSignInPress() {
        buttonLog.click();
    }
    public void checkErrorAlert(String errorText) {
        textError.shouldHave(text(errorText));
    }
}
