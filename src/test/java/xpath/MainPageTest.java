package xpath;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends Base {

    /*TODO Указать полную проверку в том числе на ховер,
           скрол странице, отображение объектов мешающих на странице.*/

    // Проверка кнопки в хедере на переходы и отображение
    @Test
    public void clickHeaderLinkButtonTest(){


        open(LINK_TO_SITE);
        $(byXpath(BUTTON_TEXT_OFFER_SITE_HEADER)).shouldNotBe(empty);
        $(byXpath(BUTTON_OFFER_IN_SITE_HEADER))
                .shouldBe(visible)
                .click();
        Assertions.assertTrue($(byXpath(BUILDING_PAGE_DESCRIPTION)).isDisplayed());
        closeWebDriver();

    }

    // Проверка баннера
    @Test
    public void showBannerTest() {

        open(LINK_TO_SITE);
        $(byXpath(BANNER_START_SALES_ZARECHNY))
                .shouldBe(visible)
                .shouldNotBe(empty)
                .scrollIntoView(false);
        $(byXpath(BANNER_DESCRIPTION_START_SALES_ZARECHNY))
                .shouldBe(visible)
                .shouldNotBe(empty);
        Assertions.assertTrue($(byXpath(BANNER_START_SALES_ZARECHNY)).isDisplayed());
        closeWebDriver();

    }

    // TODO Найти реализацию способа проверки перелистывания слайдера
    // Проверка отображения слайдера с предложениями
    @Test
    public void showingOfferSlider(){

        open(LINK_TO_SITE);
        $(byXpath(Test)).scrollTo();
        SelenideElement element = $(byXpath(Test));
        actions().dragAndDropBy(element, -250, 0).perform();
        sleep(4000);
        closeWebDriver();

    }

}