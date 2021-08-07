import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Homework_TestCases {
    @Test
    public void addProductToCart() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.rozetka.com.ua/");
        WebElement chooseCatalogPage = (new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Ноутбуки и комп"))));
        chooseCatalogPage.click();
        System.out.println(webDriver.getCurrentUrl());
        WebElement chooseSubCategory = (new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Ноутбуки' and @href='https://rozetka.com.ua/notebooks/c80004/']"))));
        chooseSubCategory.click();
        WebElement chooseLaptop = (new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-goods-id='245161909']"))));
        chooseLaptop.click();
        WebElement addToCart = (new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-product/div/product-tab-main/div[1]/div[1]/div[2]/rz-product-main-info/div/div/ul/li[1]/app-product-buy-btn/app-buy-button/button"))));
        addToCart.click();
        WebElement openShoppingCart = (new WebDriverWait(webDriver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//app-root/single-modal-window/div[2]/div[2]/rz-shopping-cart/div/div[1]/a"))));
        openShoppingCart.click();
        webDriver.close();

    }

    @Test
    public void switchLanguage() {
        WebDriver webDriver2 = new ChromeDriver();
        webDriver2.get("https://rozetka.com.ua/");
        WebElement dynamicElement = (new WebDriverWait(webDriver2, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.lang-header > li.lang__item > a.lang__link[href='/ua/']")));
        dynamicElement.click();
        dynamicElement = (new WebDriverWait(webDriver2, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/div[@class='layout']/div[@class='header-layout']//button[@aria-label='Відкрити меню' or @aria-label='Открыть меню']")));
        dynamicElement.click();
        dynamicElement = new WebDriverWait(webDriver2, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='side-menu__switch ng-tns-c5-0 ng-star-inserted']//a[1]")));
        dynamicElement.click();
        webDriver2.close();
    }

    @Test
    public void checkSideBar() {
        WebDriver webDriver3 = new ChromeDriver();
        webDriver3.manage().window().maximize();
        webDriver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver3.get("https://rozetka.com.ua/");
        WebElement dynamicElement = new WebDriverWait(webDriver3, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/div[@class='layout']/div[@class='header-layout']//button[@aria-label='Відкрити меню' or @aria-label='Открыть меню']")));
        dynamicElement.click();
        dynamicElement = new WebDriverWait(webDriver3, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='side-menu__item'][1]/child::button[1]")));
        dynamicElement.click();
        dynamicElement = new WebDriverWait(webDriver3, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/div[@class='layout']/div[@class='header-layout']//button[@aria-label='Відкрити меню' or @aria-label='Открыть меню']")));
        dynamicElement.click();
        dynamicElement = new WebDriverWait(webDriver3, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='side-links__item ng-star-inserted']/a[@href='https://rozetka.com.ua/pages/about/']")));
        dynamicElement.click();
        dynamicElement = new WebDriverWait(webDriver3, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/div[@class='layout']/div[@class='header-layout']//button[@aria-label='Відкрити меню' or @aria-label='Открыть меню']")));
        dynamicElement.click();
        dynamicElement = new WebDriverWait(webDriver3, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='side-menu__item side-menu__item--bordered-bottom'][1]/child::a[1]")));
        dynamicElement.click();
        webDriver3.navigate().back();
        webDriver3.close();
    }

    @Test
    public void checkHeader() {
        WebDriver webDriver4 = new ChromeDriver();
        webDriver4.get("https://rozetka.com.ua/");
        var header1 = webDriver4.findElement(By.xpath("//header/div[@class='layout']/div[@class='header-layout']//button[@aria-label='Відкрити меню' or @aria-label='Открыть меню']"));
        header1.click();
        WebElement closeMenu = new WebDriverWait(webDriver4, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='side-menu__header ng-tns-c5-0 ng-star-inserted']/button[@class='side-menu__close']")));
        closeMenu.click();
        WebElement loginIcon = new WebDriverWait(webDriver4, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='header-actions__item header-actions__item--user']//button[@class='header__button ng-star-inserted']")));
        loginIcon.click();
        WebElement dynamicElement = new WebDriverWait(webDriver4, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal__holder modal__holder_show_animation modal__holder--medium']/div[@class='modal__header']/button[@class='modal__close ng-star-inserted']")));
        dynamicElement.click();
        WebElement cart = new WebDriverWait(webDriver4, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='header-actions__item header-actions__item--cart']//button[@class='header__button ng-star-inserted']")));
        cart.click();
        WebElement closeCart = new WebDriverWait(webDriver4, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal__holder modal__holder_show_animation modal__holder--large']//button[@class='modal__close ng-star-inserted']")));
        closeCart.click();
        WebDriverWait wait = new WebDriverWait(webDriver4, 10);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver6) {
                return !webDriver6.findElements(By.xpath("//rz-cart[@class='header-actions__component']")).isEmpty();
            }
        }); // Собственная реализация
        webDriver4.close();
    }

    @Test
    public void checkProductPage() {
        WebDriver webDriver5 = new ChromeDriver();
        webDriver5.get("https://rozetka.com.ua/");
        var productPage = webDriver5.findElement(By.xpath("//div[@class='tile']/div[1]"));
        productPage.click();
        WebElement dynamicElement = (new WebDriverWait(webDriver5, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='tabs__item ng-star-inserted']/a[text()=' Характеристики ']")));
        dynamicElement.click();
        dynamicElement = (new WebDriverWait(webDriver5, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='tabs__item ng-star-inserted'][3]/a")));
        dynamicElement.click();
        dynamicElement = (new WebDriverWait(webDriver5, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='tabs__item ng-star-inserted'][4]/a")));
        dynamicElement.click();
        dynamicElement = (new WebDriverWait(webDriver5, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='tabs__item ng-star-inserted'][5]/a")));
        dynamicElement.click();
        webDriver5.get("https://rozetka.com.ua/");
        WebDriverWait wait = new WebDriverWait(webDriver5, 10);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver5) {
                WebElement element = webDriver5.findElement(By.xpath("//button[@aria-label='Каталог']"));
                return element.getText().equals("Каталог");
            }
        });
        webDriver5.close();
    }
}