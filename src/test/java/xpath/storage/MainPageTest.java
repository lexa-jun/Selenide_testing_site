package xpath.storage;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends BaseXpath {

    @Test
    public void clickHeaderLinkButtonTest(){
        /*TODO
           Указать полную проверку в том числе на ховер,
           скрол странице, отображение объектов мешающих на странице.*/

        // Проверка кнопки в хедере на переходы и отображение
        open(LINK_TO_SITE);
        $(byXpath(BUTTON_TEXT_OFFER_SITE_HEADER)).shouldHave(text("Заселение корпуса 2/2"));
        $(byXpath(BUTTON_OFFER_IN_SITE_HEADER))
                .shouldBe(visible)
                .click();
        boolean buildingPageTransitionCheck = $(byXpath(BUILDING_PAGE_DESCRIPTION)).isDisplayed();
        Assertions.assertTrue(buildingPageTransitionCheck,"Проверка перехода на страницу застройки при нажатии кнопки в хедере сайта");

    }

    @Test
    public void showBannerTest() {
        // Проверка баннера
        open(LINK_TO_SITE);
        $(byXpath(BANNER_START_SALES_ZARECHNY))
                .shouldBe(visible)
                .shouldHave(text("СТАРТ ПРОДАЖ"))
                .scrollIntoView(false);
        $(byXpath(BANNER_DESCRIPTION_START_SALES_ZARECHNY))
                .shouldBe(visible)
                .shouldHave(text("Микрорайон Заречный"));

    }

    @Test
    public void showingOfferSlider(){
        // TODO Найти реализацию способа проверки перелистывания слайдера

        // Проверка отображения слайдера с предложениями
        open(LINK_TO_SITE);
        $(byXpath(Test)).scrollTo();
        SelenideElement element = $(byXpath(Test));
        actions().dragAndDropBy(element, -250, 0).perform();

        sleep(4000);

    }

}