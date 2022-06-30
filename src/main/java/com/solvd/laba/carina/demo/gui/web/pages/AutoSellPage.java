package com.solvd.laba.carina.demo.gui.web.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.laba.carina.demo.gui.web.pages.auto.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoSellPage extends AbstractPage {
    public static final Logger LOGGER = LogManager.getLogger(AutoSellPage.class);
    @FindBy(css = "//*[@class=\"vehicle-form__title vehicle-form__title_big-alter\"]")
    private ExtendedWebElement title;

    public AutoSellPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return title.isElementPresent();
    }

    public AudiPage getAudiSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Audi");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new AudiPage(getDriver());
    }

    public BmwPage getBMWSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("BMW");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new BmwPage(getDriver());
    }

    public VolkswagenPage getVolkswagenSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Volkswagen");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new VolkswagenPage(getDriver());
    }

    public NissanPage getNissanSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Nissan");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new NissanPage(getDriver());
    }

    public VolvoPage getVolvoSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Volvo");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new VolvoPage(getDriver());
    }

    public AcuraPage getAcuraSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Acura");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new AcuraPage(getDriver());
    }

    public AlfaRomeoPage getAlfaRomeoSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Alfa Romeo");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new AlfaRomeoPage(getDriver());
    }

    public BentleyPage getBentleySearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Bentley");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new BentleyPage(getDriver());
    }

    public BuickPage getBuickSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Buick");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new BuickPage(getDriver());
    }

    public CadillacPage getCadillacSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Cadillac");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new CadillacPage(getDriver());
    }

    public CheryPage getCherySearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Chery");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new CheryPage(getDriver());
    }

    public ChevroletPage getChevroletSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Chevrolet");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new ChevroletPage(getDriver());
    }

    public ChryslerPage getChryslerSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Chrysler");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new ChryslerPage(getDriver());
    }

    public CitroenPage getCitroenSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Citroen");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new CitroenPage(getDriver());
    }

    public DaciaPage getDaciaSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Dacia");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new DaciaPage(getDriver());
    }

    public DaewooPage getDaewooSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Daewoo");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new DaewooPage(getDriver());
    }

    public DaihatsunPage getDaihatsunSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Daihatsu");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new DaihatsunPage(getDriver());
    }

    public DodgePage getDodgeSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Dodge");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new DodgePage(getDriver());
    }

    public FiatPage getFiatSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Fiat");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new FiatPage(getDriver());
    }

    public FordPage getFordSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Ford");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new FordPage(getDriver());
    }

    public GeelyPage getGeelySearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Geely");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new GeelyPage(getDriver());
    }

    public GreatWallPage getGreatWallSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Great Wall");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new GreatWallPage(getDriver());
    }

    public HondaPage getHondaSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Honda");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new HondaPage(getDriver());
    }

    public HyundaiPage getHyundaiSearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Hyundai");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new HyundaiPage(getDriver());
    }

    public InfinityPage getInfinitySearch(long delay) {
        WebElement element = driver.findElement(By.xpath("(//*[@class=\"input-style__real\"])[4]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        WebElement el = driver.findElement(By.xpath("(//*[@class=\"input-style input-style_primary input-style_small dropdown-style__input dropdown-style__input_width_full\"])[4]"));
        executor.executeScript("arguments[0].click();", el);
        el.sendKeys("Infinity");
        WebElement ele = driver.findElement(By.xpath("(//*[@class=\"dropdown-style__checkbox-sign\"])[24]"));
        executor.executeScript("arguments[0].click();", ele);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            LOGGER.error(e);
        }
        return new InfinityPage(getDriver());
    }
}
