package com.solvd.laba.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class NewsPage extends AbstractPage {
    @FindBy(xpath = "//*[@class=\"g-middle-i\"]")
    private ExtendedWebElement title;

    @FindBy(xpath = "(//div[@class=\"widget-item\"]/*[@class=\"b-tile-main\"])[3]")
    private ExtendedWebElement fanCatalogLink;

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public FanPage clickFanCatalogLink(){
        fanCatalogLink.click();
        return new FanPage(getDriver());
    }

}
