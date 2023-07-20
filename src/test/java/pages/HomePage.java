package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    // locators to elements
    private final SelenideElement textSchoolName = $(".site-branding");
    private final SelenideElement textThatProfessional = $(".test-banner");
    private final SelenideElement titleSubscribeForm = $(".email-form");
    private final SelenideElement textEmailLink2 = $("a.footer-email");
    private final SelenideElement textAdress = $(".footer-address");

    private final SelenideElement nameInput = $("input[placeholder='Ваше имя']");
    private final SelenideElement positionInput = $("input[placeholder='Должность']");
    private final SelenideElement telInput = $("input[placeholder='Контактный телефон']");
    private final SelenideElement emailInput = $("input[placeholder='Ваш email']");
    private final SelenideElement companyInput = $("input[placeholder='Название компании']");
    private final SelenideElement infoInput = $("input[placeholder='Откуда узнали']");
    private final SelenideElement goalInput = $("textarea[placeholder='Опишите цель обучения']");
    private final SelenideElement buttonReg = $("input[value='Зарегистрироваться']");
    private final ElementsCollection textAlertHomePage = $$(".wpcf7-response-output");

    // actions
    public void checkThatSchoolNameVisible(String schoolName) {
        textSchoolName.shouldHave(text(schoolName));
    }

    public void checkThatProfessionalTestVisible(String profTitle) {
        textThatProfessional.shouldHave(text(profTitle));
    }

    public void checkSubscribeForm(String subscribeTitle) {
        titleSubscribeForm.shouldHave(text(subscribeTitle));
    }

    public void checkEmailLinkTextTestVisible2(String emailOffice) {

        textEmailLink2.shouldHave(text(emailOffice));
    }

    public void checkAddressTestVisible(String adressOffice) {
        textAdress.shouldHave(text(adressOffice));
    }


    public void setNameInput(String username) {

        nameInput.setValue(username);
    }

    public void setPositionInput(String position1) {

        positionInput.setValue(position1);
    }

    public void setTelInput(String tel1) {

        telInput.setValue(tel1);
    }

    public void setEmailInput(String email1) {

        emailInput.setValue(email1);
    }

    public void setCompanyInput(String company1) {

        companyInput.setValue(company1);
    }

    public void setInfoInput(String info1) {

        infoInput.setValue(info1);
    }

    public void setGoalInput(String goal1) {
        goalInput.setValue(goal1);
    }

    public void buttonToRegister() {

        buttonReg.click();
    }

    public void checkAlertRegForm(String alertRegForm) {
        textAlertHomePage.find(text(alertRegForm)).shouldBe(visible, Duration.ofSeconds(10));
    }
}
