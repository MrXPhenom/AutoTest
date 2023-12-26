import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static helpers.ColorPrinter.printColorMessage;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class IssuesTab extends BasePage {

    private By newIssueButton = By.xpath("//*[contains(text(), 'New issue')]");

    private By issuesTab = By.id("issues-tab");

    private By issuesTabName = By.xpath("//*[contains(text(), 'Label issues')]");
    private final static String TITLE = "Issue Tab";

    public WebElement getIssuesTabName() {
        return driver.findElement(issuesTabName);
    }

    public IssuesTab(WebDriver driver) {
        super(driver, TITLE);
    }

    public MainPage openNewIssue() {
        Assert.assertTrue(driver.findElement(newIssueButton).isDisplayed());
        webDriverWait.until(elementToBeClickable(driver.findElement(newIssueButton)));
        driver.findElement(newIssueButton).click();
        return new MainPage(driver);
    }

    public IssuesTab goToIssuesTab() {
        Assert.assertTrue(driver.findElement(issuesTab).isDisplayed());
        webDriverWait.until(elementToBeClickable(driver.findElement(issuesTab)));
        driver.findElement(issuesTab).click();
        return new IssuesTab(driver);
    }
}