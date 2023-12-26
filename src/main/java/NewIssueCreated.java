import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NewIssueCreated extends BasePage{
    private By newIssueCreatedConfirmation = By.xpath("//*[@id=\"partial-discussion-header\"]//span[contains(text(), \"Edit\")]");
    private final static String TITLE = "New issue created page";

    public NewIssueCreated(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement getNewIssueCreatedConfirmation() {
        Assert.assertTrue(driver.findElement(newIssueCreatedConfirmation).isDisplayed());
        return driver.findElement(newIssueCreatedConfirmation);
    }
}
