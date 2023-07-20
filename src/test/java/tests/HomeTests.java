package tests;

import io.qameta.allure.Issue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@DisplayName("Проверки для главной страницы")
public class HomeTests extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    @Tag("siteTests")
    @DisplayName("Соответствие текстов на главной странице")
    void searshTextElement() {
        String schoolName = "ШКОЛА [ВЭД] АРИВИСТИКИ";
        String profTitle = "Узнайте какая профессия подходит вам больше всего";
        String subscribeTitle = "Подпишитесь на рассылку Школы Аривистики";
        String emailOffice = "info@arivistika.ru";
        String adressOffice = "Санкт-Петербург, ул. Гапсальская, д. 5, БЦ «Балтика», офис 801";

        step("Открыть страницу", () -> {
            open("");
        });

        step("Название Школы", () -> {
            homePage.checkThatSchoolNameVisible(schoolName);
        });

        step("Тест на профориентацию", () -> {
            homePage.checkThatProfessionalTestVisible(profTitle);
        });

        step("Рассылка", () -> {
            homePage.checkSubscribeForm(subscribeTitle);

        });

        step("Email Школы", () -> {
            homePage.checkEmailLinkTextTestVisible2(emailOffice);
        });

        step("Адрес Школы", () -> {
            homePage.checkAddressTestVisible(adressOffice);
        });

    }

    @Test
    @Tag("siteTests")
    @Issue("Bug ##: Отсутствует всплывающее окно (Chrome)")
    @DisplayName("Заполнение и отправки формы регистрации")
    void fillFormTest() {
        step("Открыть страницу", () -> {
            open("");
        });

        step("Введите: Ваше имя", () -> {
            homePage.setNameInput("Olga");
        });

        step("Введите: Должность", () -> {
            homePage.setPositionInput("QA engineer");
        });

        step("Введите: Контактный телефон (не введен)", () -> {
            //homePage.setTelInput("+7921781хххх");
        });

        step("Введите: Ваш email", () -> {
            homePage.setEmailInput("test@test.test");
        });

        step("Введите: Название компании", () -> {
            homePage.setCompanyInput("Test Company");
        });


        step("Введите: Откуда узнали", () -> {
            homePage.setInfoInput("Test source of information");
        });

        step("Введите текстовое сообщение", () -> {
            homePage.setGoalInput("Test Text Text");
        });

        step("Нажать кнопку \"Зарегистрироваться\"", () -> {
           // homePage.buttonToRegister();
        });

        //Expect:
        step("Текст предупреждения об ошибке соостветсвует ожидаемому", () -> {
           //homePage.checkAlertRegForm("Одно или несколько полей содержат ошибочные данные. Пожалуйста, проверьте их и попробуйте ещё раз.");
        });

    }

}

