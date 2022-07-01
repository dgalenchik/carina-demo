package com.solvd.laba.carina.demo.gui.web.pages.auto;

import com.solvd.laba.carina.demo.gui.web.pages.AutoSellPage;

public enum Cars {
    ACURA("Acura"),
    ALFA_ROMEO("Alfa Romeo"),
    AUDI("Audi"),
    BENTLEY("Bentley"),
    BMW("Bmw"),
    BUICK("Buick"),
    CADILLAC("Cadillac"),
    CHERY("Chery"),
    CHEVROLET("Chevrolet"),
    CHRYSLER("Chrysler"),
    CITROEN("Citroen"),
    DACIA("Dacia"),
    DAEWOO("Daewoo"),
    DAIHATSU("Daihatsu"),
    DODGE("Dodge"),
    FIAT("Fiat"),
    FORD("Ford"),
    GEELY("Geely"),
    GREAT_WALL("Great wall"),
    HONDA("Honda"),
    HYUNDAI("Hyundai"),
    INFINITI("Infinity"),
    NISSAN("Nissan"),
    VOLKSWAGEN("Volkswagen"),
    VOLVO("Volvo");

    private final String value;

    Cars(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public IRating getPage(Cars car, AutoSellPage autoSellPage) {
        autoSellPage.waitForJSToLoad();
        autoSellPage.getModelField().clickByJs();
        autoSellPage.getSearchField().clickByJs();
        autoSellPage.getSearchField().type(car.getValue());
        autoSellPage.waitForJSToLoad();
        autoSellPage.getSearchResult().clickByJs();
        IRating iRating = null;
        switch (car) {
            case ACURA:
                iRating = new AcuraPage(autoSellPage.getDriver());
                break;
            case ALFA_ROMEO:
                iRating = new AlfaRomeoPage(autoSellPage.getDriver());
                break;
            case AUDI:
                iRating = new AudiPage(autoSellPage.getDriver());
                break;
            case BENTLEY:
                iRating = new BentleyPage(autoSellPage.getDriver());
                break;
            case BMW:
                iRating = new BmwPage(autoSellPage.getDriver());
                break;
            case BUICK:
                iRating = new BuickPage(autoSellPage.getDriver());
                break;
            case CADILLAC:
                iRating = new CadillacPage(autoSellPage.getDriver());
                break;
            case CHERY:
                iRating = new CheryPage(autoSellPage.getDriver());
                break;
            case CHEVROLET:
                iRating = new ChevroletPage(autoSellPage.getDriver());
                break;
            case CHRYSLER:
                iRating = new ChryslerPage(autoSellPage.getDriver());
                break;
            case CITROEN:
                iRating = new CitroenPage(autoSellPage.getDriver());
                break;
            case DACIA:
                iRating = new DaciaPage(autoSellPage.getDriver());
                break;
            case DAEWOO:
                iRating = new DaewooPage(autoSellPage.getDriver());
                break;
            case DAIHATSU:
                iRating = new DaihatsunPage(autoSellPage.getDriver());
                break;
            case DODGE:
                iRating = new DodgePage(autoSellPage.getDriver());
                break;
            case FIAT:
                iRating = new FiatPage(autoSellPage.getDriver());
                break;
            case FORD:
                iRating = new FordPage(autoSellPage.getDriver());
                break;
            case GEELY:
                iRating = new GeelyPage(autoSellPage.getDriver());
                break;
            case GREAT_WALL:
                iRating = new GreatWallPage(autoSellPage.getDriver());
                break;
            case HONDA:
                iRating = new HondaPage(autoSellPage.getDriver());
                break;
            case HYUNDAI:
                iRating = new HyundaiPage(autoSellPage.getDriver());
                break;
            case INFINITI:
                iRating = new InfinityPage(autoSellPage.getDriver());
                break;
            case NISSAN:
                iRating = new NissanPage(autoSellPage.getDriver());
                break;
            case VOLKSWAGEN:
                iRating = new VolkswagenPage(autoSellPage.getDriver());
                break;
            case VOLVO:
                iRating = new VolvoPage(autoSellPage.getDriver());
                break;
        }
        return iRating;
    }
}

