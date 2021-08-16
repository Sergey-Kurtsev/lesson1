package elmir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchResultPage {
    WebDriver driver;
    WebDriverWait vait;
    public SearchResultPage(WebDriver driver, WebDriverWait vait) {
        this.driver = driver;
        this.vait = vait;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='vit-buy']//div[@class='no-print ready btn']")
    WebElement firstProductOnResultPageToCart;

    @FindBy(xpath = "//span[@class='current']/span[contains(text(),'релевант')]")
    WebElement sorting;

    @FindBy(xpath = "//a[contains(text(), 'дорог')]")
    WebElement fromExpensiveIcon;

    @FindBy(xpath = "//span[@class='current']/span[contains(text(),'36')]")
    WebElement productsQuantityOnPage36;

    @FindBy(xpath = "//div[@class='selector']//a[contains(text(),'72')]")
    WebElement getProductsQuantityOnPage72;

    @FindBy(xpath = "//a[@id='basket-small']")
    WebElement cartIcon;

    public void addFirstProductToCart() {
        firstProductOnResultPageToCart = vait.until(ExpectedConditions.elementToBeClickable(firstProductOnResultPageToCart));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstProductOnResultPageToCart);
        Assert.assertTrue(driver.getTitle().contains("iPhone"));
        firstProductOnResultPageToCart.click();
    }
    public void changeSearchResultPageView() {
    sorting = vait.until(ExpectedConditions.elementToBeClickable(sorting));
    sorting.click();
    fromExpensiveIcon = vait.until(ExpectedConditions.elementToBeClickable(fromExpensiveIcon));
    fromExpensiveIcon.click();
    productsQuantityOnPage36 = vait.until(ExpectedConditions.elementToBeClickable(productsQuantityOnPage36));
    productsQuantityOnPage36.click();
    getProductsQuantityOnPage72 = vait.until(ExpectedConditions.elementToBeClickable(getProductsQuantityOnPage72));
    getProductsQuantityOnPage72.click();
    }
    public void openCart() {
        cartIcon = vait.until(ExpectedConditions.elementToBeClickable(cartIcon));
        cartIcon.click();
    }
}
