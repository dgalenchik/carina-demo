package com.solvd.laba.carina.demo.gui.web.pages.footer;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class VacanciesPage extends AbstractPage {

    @FindBy(xpath = "")
    private ExtendedWebElement title;

    public VacanciesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

}

