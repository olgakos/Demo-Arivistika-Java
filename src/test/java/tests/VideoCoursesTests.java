package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.VideoCoursesPage;
import pages.PaymentPage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@DisplayName("Проверки для страницы \"Видеоуроки\"")
public class VideoCoursesTests extends TestBase {

    VideoCoursesPage videoPage = new VideoCoursesPage();
    PaymentPage paymentPage = new PaymentPage();

    @Test
    @Tag("coursesTests")
    @DisplayName("Проверка оплаты видеоурока \"Курс PRO Декларирование\" (Robokassa)")
    void openCoursePayTest() {
        step("Открыть страницу", () -> {
            open("cources-list/");
        });

        step("Выбрать Курс PRO Декларирование", () -> {
            videoPage.courseHeaderDeclarantVisible();
        });

        step("Нажать кнопку \"Подробнее\"", () -> {
            videoPage.setButtonMoreAboutDeclarant();
        });

        step("Нажать кнопку \"Купить этот курс\"", () -> {
            videoPage.setButtonBay();
        });
//Expect:
        step("Проверить, что на странице есть название продавца", () -> {
            paymentPage.checkPaymentFormTitle();
        });

        step("Проверить, что платежная форма доступна", () -> {
            paymentPage.checkPaymentIsAviable();
        });
    }

}