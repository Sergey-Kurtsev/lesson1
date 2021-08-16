package elmir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class Tests {

    WebDriver driver = new ChromeDriver();
    WebDriverWait vait = new WebDriverWait(driver, 10);
    MainPage mainPage = new MainPage(driver, vait);
    SearchResultPage searchResultPage = new SearchResultPage(driver, vait);
    CartPage cartPage = new CartPage(driver, vait);
    Actions actions = new Actions(driver);

    @BeforeSuite
    public void preparations() {
        System.out.println("Let's start suite");
        driver.get("https://elmir.ua/ua/");
    }

    @BeforeTest
    public void startTesting() {
        mainPage.logIn("elmir@yopmail.com", "123qwe456");
    }

    @Test
    public void testMethod() {
        Assert.assertTrue(mainPage.userNameValue.getText().equalsIgnoreCase("User_131524"));
        mainPage.findProduct("iPhone");
        searchResultPage.changeSearchResultPageView();
        searchResultPage.addFirstProductToCart();
        searchResultPage.openCart();
        cartPage.increaseProductQuantityByOne();
        cartPage.addProductToWishList();

    }

    @AfterTest
    public void finishTesting() {
        cartPage.deleteProduct();
        mainPage.logOut(actions);
    }

    @AfterSuite
    public void clearData() {
        driver.manage().deleteAllCookies();
        driver.close();
        System.out.println("Testing is finished");
    }

}
