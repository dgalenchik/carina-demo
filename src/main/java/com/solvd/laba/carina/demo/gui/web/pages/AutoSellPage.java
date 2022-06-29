package com.solvd.laba.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AutoSellPage extends AbstractPage {

    @FindBy(xpath = "//*[@class=\"vehicle-form__title vehicle-form__title_big-alter\"]")
    private ExtendedWebElement title;

    public AutoSellPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

}

