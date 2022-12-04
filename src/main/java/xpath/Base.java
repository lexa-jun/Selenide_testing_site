package xpath;

public class Base {

    //  Стартовая страница
    public static final String LINK_TO_SITE =
            "https://vatutinki.ru";

    // Кнопка вверху сайта для перехода к предложению
    public static final String BUTTON_OFFER_IN_SITE_HEADER =
            "//h2[contains(text(), \"Выберите квартиру\")]/../ancestor-or-self::div/header/a";

    // Текст на кнопке вверху сайта
    public static final String BUTTON_TEXT_OFFER_SITE_HEADER =
            "//h2[contains(text(), \"Выберите квартиру\")]/../ancestor-or-self::div/header/a/p";

    // Заголовок банера
    public static final String BANNER_START_SALES_ZARECHNY =
            "//h2[contains(text(), \"Выберите квартиру\")]/../../div/div[contains(@class, \"content_WPLni\")]/h2";

    // Текст описания баннера
    public static final String BANNER_DESCRIPTION_START_SALES_ZARECHNY =
            "//h2[contains(text(),\"Выберите квартиру\")]" +
                    "/../../div/div[contains(@class, \"content_WPLni\")]/div/p/span";

    // Текст описания страницы застройки
    public static final String BUILDING_PAGE_DESCRIPTION =
            "//h2[contains(text(), \"Заселение корпуса 2/2\")]";

    public static final String Test =
            "//h2[contains(text(), \"Выберите квартиру\")]/../../div[contains(@class, \"BannersSlider_dTmLr\")]/div";

}
