package elmir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;
    WebDriverWait vait;

    @FindBy(xpath = "//div[@id='autho']/span")
    WebElement loginIcon;


    @FindBy(xpath = "//input[@name='login']")
    WebElement loginField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @FindBy(xpath = "//form/button[@class='lf-i lf-b']")
    WebElement confirmLoginButton;

    @FindBy(xpath = "//div[@id='autho']//a[contains(text(), 'User')]")
    WebElement userNameValue;

    @FindBy(xpath = "//div[@id='header-content']//input[@type='search']")
    WebElement searchBox;

    @FindBy(xpath = "//div[@id='header-content']//span[@id='find']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@id='subscribe-close']")
    WebElement pushCloseButton;

    @FindBy(xpath = "//a[@id='basket-small']")
    WebElement cartIcon;

    @FindBy(xpath = "//div[@id='autho']/ul[@class='menulist']")
    WebElement logOutIcon;

    @FindBy(xpath = "//div[@id='autho']//button[@name='logout']")
    WebElement logOutConfirmButton;

    public MainPage(WebDriver driver, WebDriverWait vait) {
        this.driver = driver;
        this.vait = vait;
        PageFactory.initElements(driver, this);
    }

    public void logIn(String login, String password) {
        loginIcon = vait.until(ExpectedConditions.elementToBeClickable(loginIcon));
        loginIcon.click();
        pushCloseButton = vait.until(ExpectedConditions.elementToBeClickable(pushCloseButton));
        pushCloseButton.click();
        loginField = vait.until(ExpectedConditions.elementToBeClickable(loginField));
        loginField.sendKeys(login);
        passwordField = vait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.sendKeys(password);
        confirmLoginButton = vait.until(ExpectedConditions.elementToBeClickable(confirmLoginButton));
        confirmLoginButton.click();
    }

    public void findProduct(String productName) {
        searchBox = vait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchBox.sendKeys(productName);
        searchButton.click();
    }

    public void logOut(Actions actions) {
        logOutIcon.click();
        logOutConfirmButton = vait.until(ExpectedConditions.elementToBeClickable(logOutConfirmButton));
        actions.moveToElement(logOutConfirmButton);
        logOutConfirmButton.click();
    }
}
