package org.cases;

import org.cases.dataBaseXpath.BaseXpath;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BaseXpath{

    @Test
    public void HeaderLinkButton(){
        open(LINK_TO_SITE);
        $(byXpath(HEADER_LINK_BUTTON)).shouldBe(visible);
        $(byXpath(HEADER_LINK_TEXT)).shouldHave(text("Заселение корпуса 2/2"));
        $(byXpath(HEADER_LINK_BUTTON)).click();
        $(byXpath(HEADER_LINK_TEXT)).isDisplayed();
    }


   /* @Test
    public void testClick() throws InterruptedException {

        
        open("https://vatutinki.ru/flats"); // Открытие страницы
        $(byXpath("//span[contains(text(), \"Машиноместа\")]/..")).click(); // Поиск кнопки по xpath и нажатие
        $(byXpath(bx.showParking)).shouldHave(text("ПОКАЗАТЬ КВАРТИРЫ")); // Проверка отображение текста
        $(byXpath(bx.showApartments)).isDisplayed(); // Проверка что текст с предыдущей страницы не отображается
        System.out.println($(byXpath(bx.showApartments)).isDisplayed()); // Отображение состояния isDisplayed
        Thread.sleep(3000); // Таймер ожидания
    }
}*/
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Waits until element disappears
//        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text

}