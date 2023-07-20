package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EventsListPage {

    // locators to elements
    private SelenideElement eventTitle = $(".event-title");

    // actions
    public void checkEventTitle(String textTitle) { eventTitle.shouldHave(text(textTitle)); }
}
