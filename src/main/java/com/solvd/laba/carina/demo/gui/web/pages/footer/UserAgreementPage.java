package com.solvd.laba.carina.demo.gui.web.pages.footer;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UserAgreementPage extends AbstractPage {

    @FindBy(xpath = "//*[@class=\"news-header__title\"]")
    private ExtendedWebElement title;

    public UserAgreementPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

}

