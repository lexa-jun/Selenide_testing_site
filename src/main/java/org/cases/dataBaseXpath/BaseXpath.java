package org.cases.dataBaseXpath;

public class BaseXpath  {
    //  Стартовая страница
    public static final String LINK_TO_SITE = "https://vatutinki.ru";
    // Кнопка вверху сайта для перехода к предложению
    public static final String HEADER_LINK_BUTTON = "//h2[contains(text(), \"Выберите квартиру\")]/../../../../header/a";
    // Текст на кнопке вверху сайта
    public static final String HEADER_LINK_TEXT = "//h2[contains(text(), \"Выберите квартиру\")]/../../../../header/a/p";
    // Отображение теста баннера "Старт продаж"
    public static final String SALES_START_BANNER = "//h2[contains(text(), \"Выберите квартиру\")]/../../div/div[contains(@class, \"image-lazy is-absolute is-center img_Z6SKV\")]/img";

    public static final String TITLE_BANNER = "//h2[contains(text(), \"Выберите квартиру\")]/../../div/div[contains(@class, \"content_WPLni\")]/h2";

    public static final String SUBTITLE_BANNER = "//h2[contains(text(), \"Выберите квартиру\")]/../../div/div[contains(@class, \"content_WPLni\")]/div/p/span";


}




//    // Текст "ПОКАЗАТЬ МАШИНОМЕСТА" на странице машиноместа
//    String showParking = "//h2[contains(text(), \"Выберите по параметрам\")]/../../../div[@id=\"filters-body\"]/div/div/div/div/div[contains(@class, \"layout_r2wFH\")]/span";
//    // Текст "ПОКАЗАТЬ КВАРТИРЫ" на странице квартир
//    public String showApartments = "//h2[contains(text(), \"Выберите по параметрам\")]/../../../div[contains(@class, \"body_poTFs\")]/div/div/div[contains(@class, \"FiltersGenplan_Wvn7F\")]/div[contains(@class, \"filters-genplan__view view_5Rzl5\")]/span";



//
