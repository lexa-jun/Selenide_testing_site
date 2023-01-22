package ru.vatutinki;

public class Base {

    //  Стартовая страница
    public static final String LINK_TO_SITE =
            "https://vatutinki.ru";

    // Кнопка вверху сайта для перехода к предложению
    public static final String BUTTON_OFFER_IN_SITE_HEADER =
            "//h2[contains(text(), \"Выберите квартиру\")]/ancestor-or-self::div/header/a";

    // Текст на кнопке вверху сайта
    public static final String BUTTON_TEXT_OFFER_SITE_HEADER =
            "//h2[contains(text(), \"Выберите квартиру\")]/ancestor-or-self::div/header/a/p";

    // Заголовок банера
    public static final String BANNER_START_SALES_ZARECHNY =
            "//h2[contains(text(), \"Выберите квартиру\")]/../../div/div[contains(@class, \"content_WPLni\")]/h2";

    // Текст описания баннера
    public static final String BANNER_DESCRIPTION_START_SALES_ZARECHNY =
            "//h2[contains(text(),\"Выберите квартиру\")]" +
                    "/../../div/div[contains(@class, \"content_WPLni\")]/div/p";

    // Текст описания страницы застройки
    public static final String BUILDING_PAGE_DESCRIPTION =
            "//h2[contains(text(), \"Заселение корпуса 2/2\")]";

    public static final String BANNER_BIG_WITH_BENEFITS =
            "//h2[contains(text(), \"Выберите квартиру\")]/../../div[contains(@class, \"BannersSlider_dTmLr\")]/div";

    // Текст о покупки квартиры
    public static final String BUY_APARTMENT =
            "//h2[contains(@class, \"h2 title_pl021\")]";

    // Кнопка переключения преимуществ района вперед
    public static final String SWITCHING_AREA_ADVANTAGES_FORWARD =
            "//h2[contains(text(), \"Выберите квартиру\")]/../../div[contains(@class, \"BannersSlider_dTmLr\")]" +
                    "/div/div[contains(@class, \"sliderButtons_JkA+F\")]" +
                    "/div/div[contains(@aria-label, \"Next slide\")]/div";

    // Кнопка переключения преимуществ района назад
    public static final String SWITCHING_AREA_ADVANTAGES_BACK =
            "//h2[contains(text(), \"Выберите квартиру\")]/../../div[contains(@class, \"BannersSlider_dTmLr\")]" +
                    "/div/div[contains(@class, \"sliderButtons_JkA+F\")]" +
                    "/div/div[contains(@aria-label, \"Previous slide\")]";

    // Кнопка вперед дополнительных предложений района
    public static final String BUTTON_FORWARD_ADDITIONAL_OFFERS =
            "//h2[contains(text(), \"Выберите квартиру\")]/../../div[contains(@class, \"sliderAdvantages_dqaME\")]" +
                    "/div[contains(@class, \"swiperNav_aCBzN\")]/div[contains(@class, \"controls_iw1yk\")]" +
                    "/div[contains(@class, \"_large btnNext_t2UE2\")]";

    // Кнопка вперед дополнительных предложений района
    public static final String BUTTON_BACK_ADDITIONAL_OFFERS =
            "//h2[contains(text(), \"Выберите квартиру\")]/../../div[contains(@class, \"sliderAdvantages_dqaME\")]" +
                    "/div[contains(@class, \"swiperNav_aCBzN\")]/div[contains(@class, \"controls_iw1yk\")]" +
                    "/div[contains(@class, \"btnPrev_1R-II\")]";

}
