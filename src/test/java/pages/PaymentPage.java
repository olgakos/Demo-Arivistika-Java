package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PaymentPage extends TestBase {

    // locators
    private SelenideElement textPaymentFormTitle = $(".shopTittle");
    private SelenideElement payment = $("#paymentComponent");

    // actions
    public void checkPaymentFormTitle() {
        textPaymentFormTitle.shouldBe(visible);
    }
    public void checkPaymentIsAviable() {
        payment.isDisplayed();
    }
}
