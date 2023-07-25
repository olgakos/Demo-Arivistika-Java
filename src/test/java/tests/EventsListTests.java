package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.EventsListPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@DisplayName("Проверки для страницы \"Расписание\"")
public class EventsListTests extends TestBase {

    EventsListPage events = new EventsListPage();

    @Test
    @Owner("Olga Kos")
    @Tag("eventsTests")
    @DisplayName("Проверка заголовка на странице \"Расписание\"")
    void searchEvents() {

        String textTitle = "Что нужно хранить и держать в порядке на случай таможенной проверки";

        step("Открыть страницу \"Расписание\"", () -> {
            open("events-list/");
        });

        step("Проверить заголовок", () -> {
            events.checkEventTitle(textTitle);
        });
    }
}
