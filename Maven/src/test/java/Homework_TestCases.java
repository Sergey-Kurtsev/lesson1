import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Homework_TestCases {
    @Test
    public void addProductToCart() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://www.rozetka.com.ua/");
        WebElement element = webDriver.findElement(By.partialLinkText("Ноутбуки и комп"));
        element.click();
        System.out.println(webDriver.getCurrentUrl());
//        webDriver.close();
//        webDriver.navigate().back();
        WebElement element1 = webDriver.findElement(By.xpath("//a[@title='Ноутбуки' and @href='https://rozetka.com.ua/notebooks/c80004/']"));
        element1.click();
        WebElement element2 = webDriver.findElement(By.xpath("//*[contains(@class,'goods-tile__title')][1]"));
        element2.click();
        WebElement element3 = webDriver.findElement(By.xpath("//rz-product/div/product-tab-main/div[1]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[1]/app-product-buy-btn/app-buy-button/button"));
        element3.click();
        WebElement element4 = webDriver.findElement(By.xpath("//app-root/single-modal-window/div[2]/div[2]/rz-shopping-cart/div/div[1]/a"));
        element4.click();
        webDriver.close();
    }

    @Test
    public void switchLanguage() {
        WebDriver webDriver2 = new ChromeDriver();
        webDriver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver2.get("https://rozetka.com.ua/");
        WebElement second = webDriver2.findElement(By.cssSelector("ul.lang-header > li.lang__item > a.lang__link[href='/ua/']"));
        second.click();
        WebElement third = webDriver2.findElement(By.xpath("//header/div[@class='layout']/div[@class='header-layout']//button[@aria-label='Відкрити меню' or @aria-label='Открыть меню']"));
        third.click();
        WebElement fourth = webDriver2.findElement(By.xpath("//div[3]/div[2]/div/nav/div/div[2]/ul[2]/li[2]/div[1]/rz-lang/ul/li[1]/a"));
        fourth.click();
        webDriver2.close();
    }

    @Test
    public void checkSideBar() {
        WebDriver webDriver3 = new ChromeDriver();
        webDriver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver3.get("https://rozetka.com.ua/");
        var sidebar1 = webDriver3.findElement(By.xpath("//header/div[@class='layout']/div[@class='header-layout']//button[@aria-label='Відкрити меню' or @aria-label='Открыть меню']"));
        sidebar1.click();
        var sidebar2 = webDriver3.findElement(By.cssSelector("div.side-menu__body.ng-tns-c5-0.ng-star-inserted > ul.side-menu__list > li.side-menu__item > button"));
        sidebar2.click();
        sidebar1.click();
        var sidebar3 = webDriver3.findElement(By.cssSelector("div.side-menu__body.ng-tns-c5-0.ng-star-inserted > ul.side-menu__list > li:nth-child(2) > button"));
        sidebar3.click();
        var sidebar4 = webDriver3.findElement(By.cssSelector("app-root > single-modal-window > div.modal__holder.modal__holder_show_animation.modal__holder--large > div.modal__header > button.modal__close"));
        sidebar4.click();
        sidebar1.click();
        var sidebar5 = webDriver3.findElement(By.cssSelector("div.side-menu__body.ng-tns-c5-0.ng-star-inserted > ul.ng-tns-c5-0 > li:nth-child(1) > a:nth-child(1)[href='https://help.rozetka.com.ua/hc/ru']"));
        sidebar5.click();
        webDriver3.navigate().back();
        webDriver3.close();
    }

    @Test
    public void checkHeader() {
        WebDriver webDriver4 = new ChromeDriver();
        webDriver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver4.get("https://rozetka.com.ua/");
        var header1 = webDriver4.findElement(By.xpath("//header/div[@class='layout']/div[@class='header-layout']//button[@aria-label='Відкрити меню' or @aria-label='Открыть меню']"));
        header1.click();
        var header2 = webDriver4.findElement(By.xpath("//div[@class='side-menu__header ng-tns-c5-0 ng-star-inserted']/button[@class='side-menu__close']"));
        header2.click();
        var header3 = webDriver4.findElement(By.xpath("//li[@class='header-actions__item header-actions__item--user']//button[@class='header__button ng-star-inserted']"));
        header3.click();
        var header4 = webDriver4.findElement(By.xpath("//div[@class='modal__holder modal__holder_show_animation modal__holder--medium']/div[@class='modal__header']/button[@class='modal__close ng-star-inserted']"));
        header4.click();
        var header5 = webDriver4.findElement(By.xpath("//li[@class='header-actions__item header-actions__item--cart']//button[@class='header__button ng-star-inserted']"));
        header5.click();
        var header6 = webDriver4.findElement(By.xpath("//div[@class='modal__holder modal__holder_show_animation modal__holder--large']//button[@class='modal__close ng-star-inserted']"));
        header6.click();
        webDriver4.close();
    }

    @Test
    public void checkProductPage() {
    WebDriver webDriver5 = new ChromeDriver();
        webDriver5.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver5.get("https://rozetka.com.ua/");
    var productPage = webDriver5.findElement(By.xpath("//div[@class='tile']/div[1]"));
    productPage.click();
    var productPage2 = webDriver5.findElement(By.xpath("//li[@class='tabs__item ng-star-inserted']/a[text()=' Характеристики ']"));
        productPage2.click();
        var productPage3 = webDriver5.findElement(By.xpath("//li[@class='tabs__item ng-star-inserted'][3]/a"));
        productPage3.click();
        var productPage4 = webDriver5.findElement(By.xpath("//li[@class='tabs__item ng-star-inserted'][4]/a"));
        productPage4.click();
        var productPage5 = webDriver5.findElement(By.xpath("//li[@class='tabs__item ng-star-inserted'][5]/a"));
        productPage5.click();
        webDriver5.close();
    }
}
