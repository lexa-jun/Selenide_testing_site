package org.example;

import org.example.dataBaseXpath.BaseXpath;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BaseXpath{
//        BaseXpath bx = new BaseXpath();

    @Test
    public void test(){

        open("https://vatutinki.ru/flats");
        $(byXpath(showApartments)).click();
    }


   /* @Test
    public void testClick() throws InterruptedException {

        
        open("https://vatutinki.ru/flats"); // Открытие страницы
        $(byXpath("//span[contains(text(), \"Машиноместа\")]/..")).click(); // Поиск кнопки по xpath и нажатие
        $(byXpath(bx.showParking)).shouldHave(text("ПОКАЗАТЬ КВАРТИРЫ")); // Проверка отображение текста
        $(byXpath(bx.showApartments)).isDisplayed(); // Проверка что текст с предыдущей страницы не отображается
        System.out.println($(byXpath(bx.showApartments)).isDisplayed()); // Отображение состаяния isDisplayed
        Thread.sleep(3000); // Таймер ожидания
    }
}*/
//        $("#submit").click();
//        $(".loading_progress").should(disappear); // Waits until element disappears
//        $("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text

}