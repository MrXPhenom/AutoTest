import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SideMenu extends BasePage{
    private final static String TITLE = "Side menu";

    public SideMenu(WebDriver driver) {
        super(driver, TITLE);
    }

    private By repositoryLocator = By.xpath("(//li//ul/li/a/span[2])[1]");

    public IssuesTab goToRepositoryTab() {
        Assert.assertTrue(driver.findElement(repositoryLocator).isDisplayed());
        driver.findElement(repositoryLocator).click();
        return new IssuesTab(driver);
    }
}
