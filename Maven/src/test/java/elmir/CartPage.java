package elmir;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    WebDriver driver;
    WebDriverWait vait;

    @FindBy(xpath = "//tr[@ga-position='0']//*[@class='counts']//span[@class='count count-plus']")
    WebElement increaseValueIcon;

    @FindBy(xpath = "//tr[@ga-position='0']//td[@class='names']/span[1]")
    WebElement wishListIcon;

    @FindBy(xpath = "//tr[@ga-position='0']//td[@class='deletes']/a")
    WebElement deleteProductIcon;

    @FindBy(xpath = "//td[@class='summary-value']/span[contains(text(),'0')]")
    WebElement cartSum;


    public CartPage(WebDriver driver, WebDriverWait vait) {
        this.driver = driver;
        this.vait = vait;
        PageFactory.initElements(driver, this);
    }

    public void increaseProductQuantityByOne() {
        increaseValueIcon = vait.until(ExpectedConditions.elementToBeClickable(increaseValueIcon));
        increaseValueIcon.click();
    }
    public void addProductToWishList() {
    wishListIcon = vait.until(ExpectedConditions.elementToBeClickable(wishListIcon));
    wishListIcon.click();
    }
    public void deleteProduct() {
        deleteProductIcon = vait.until(ExpectedConditions.elementToBeClickable(deleteProductIcon));
        deleteProductIcon.click();
    }

}
