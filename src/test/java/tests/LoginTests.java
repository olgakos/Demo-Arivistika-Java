package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@DisplayName("Проверки для страницы \"Вход\"")
public class LoginTests extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    @Tag("loginTests")
    @DisplayName("Проверка уведомления об ошибке залогина")
    void loginTestFail() {

        String login = "test@test.test";
        String password = "123";
        String errorText = "Неверный адрес e-mail";

        step("Открыть страницу", () -> {
            open("my-account/");
        });

        step("Ввести email", () -> {
            loginPage.setNameInput(login);
        });

        step("Ввести пароль", () -> {
            loginPage.setPasswordInput(password);
        });

        step("Нажать кнопку", () -> {
            loginPage.buttonSignInPress();
        });
//Expect:
        step("Проверить сообщение о причинах ошибки (Неверный адрес e-mail)", () -> {
            loginPage.checkErrorAlert(errorText);
        });
    }
}