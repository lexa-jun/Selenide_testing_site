package org.example;

public class BaseXpath {

    // Текст "ПОКАЗАТЬ МАШИНОМЕСТА" на странице маашиноместа
    String showParking = "//h2[contains(text(), \"Выберите по параметрам\")]/../../../div[@id=\"filters-body\"]/div/div/div/div/div[contains(@class, \"layout_r2wFH\")]/span";
    // Текст "ПОКАЗАТЬ КВАРТИРЫ" на странице квартир
    String showApartments = "//h2[contains(text(), \"Выберите по параметрам\")]/../../../div[contains(@class, \"body_poTFs\")]/div/div/div[contains(@class, \"FiltersGenplan_Wvn7F\")]/div[contains(@class, \"filters-genplan__view view_5Rzl5\")]/span";
}
