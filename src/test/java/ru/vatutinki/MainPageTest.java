package ru.vatutinki;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends Base {

    // Проверка кнопки в хедере на переходы и отображение
    @Test
    public void clickHeaderLinkButtonTest() {

        open(LINK_TO_SITE);
        $(byXpath(BUTTON_TEXT_OFFER_SITE_HEADER)).shouldNotBe(empty);
        $(byXpath(BUTTON_OFFER_IN_SITE_HEADER))
                .shouldBe(visible)
                .click();
        Assertions.assertFalse($(byXpath(BUY_APARTMENT)).isDisplayed());
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

    // Проверка отображения слайдера с предложениями
    @Test
    public void showingOfferSlider() {

        open(LINK_TO_SITE);
        $(byXpath(BANNER_BIG_WITH_BENEFITS))
                .scrollTo()
                .shouldBe(visible);
        SelenideElement element = $(byXpath(BANNER_BIG_WITH_BENEFITS));
        actions().dragAndDropBy(element, -250, 0).perform();
        sleep(4000);
        SelenideElement elementBack = $(byXpath(BANNER_BIG_WITH_BENEFITS));
        actions().dragAndDropBy(elementBack, 250, 0).perform();
        sleep(4000);
        Assertions.assertTrue($(byXpath(BANNER_BIG_WITH_BENEFITS)).isEnabled());
        closeWebDriver();

    }

    @Test
    public void toggleSuggestionSliderForward() {

        open(LINK_TO_SITE);
        $(byXpath(SWITCHING_AREA_ADVANTAGES_FORWARD))
                .scrollIntoView(false)
                .shouldBe(visible)
                .hover()
                .click();
        Assertions.assertTrue($(byXpath(SWITCHING_AREA_ADVANTAGES_FORWARD)).isDisplayed());
        closeWebDriver();

    }

    @Test
    public void toggleSuggestionSliderBack() {

        open(LINK_TO_SITE);
        $(byXpath(SWITCHING_AREA_ADVANTAGES_BACK))
                .scrollIntoView(false)
                .hover()
                .shouldBe(visible)
                .click();
        Assertions.assertTrue($(byXpath(SWITCHING_AREA_ADVANTAGES_BACK)).isDisplayed());
        closeWebDriver();

    }

    @Test
    public void togglingSliderAdditionalOffersForward() {

        open(LINK_TO_SITE);
        $(byXpath(SWITCHING_AREA_ADVANTAGES_BACK))
                .scrollIntoView(false)
                .shouldBe(visible)
                .hover()
                .click();
        Assertions.assertTrue($(byXpath(SWITCHING_AREA_ADVANTAGES_BACK)).isDisplayed());
        closeWebDriver();

    }

    @Test
    public void scrollingAdditionalOffersBlock() {

        open(LINK_TO_SITE);
        $(byXpath(BLOCK_OF_ADDITIONAL_OFFERS))
                .scrollTo()
                .shouldBe(visible);
        SelenideElement element = $(byXpath(BLOCK_OF_ADDITIONAL_OFFERS));
        actions().dragAndDropBy(element, -250, 0).perform();
        sleep(4000);
        SelenideElement elementBack = $(byXpath(BLOCK_OF_ADDITIONAL_OFFERS));
        actions().dragAndDropBy(elementBack, 250, 0).perform();
        sleep(4000);
        Assertions.assertTrue($(byXpath(BLOCK_OF_ADDITIONAL_OFFERS)).isEnabled());
        closeWebDriver();

    }

    @Test
    public void switchingAdditionalOffersForward() {

        open(LINK_TO_SITE);
        $(byXpath(BUTTON_FORWARD_ADDITIONAL_OFFERS))
                .scrollIntoView(false)
                .hover()
                .click();
        Assertions.assertTrue($(byXpath(BUTTON_FORWARD_ADDITIONAL_OFFERS)).isDisplayed());
        closeWebDriver();

    }

    @Test
    public void switchingAdditionalOffersBack() {

        open(LINK_TO_SITE);
        $(byXpath(BUTTON_FORWARD_ADDITIONAL_OFFERS))
                .scrollIntoView(false)
                .click();
        $(byXpath(BUTTON_BACK_ADDITIONAL_OFFERS))
                .hover()
                .shouldBe(visible)
                .click();
        Assertions.assertTrue($(byXpath(BUTTON_BACK_ADDITIONAL_OFFERS)).isDisplayed());
        closeWebDriver();

    }



}