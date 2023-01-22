package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewArticlesPage {
    WebDriver driver;

    private final By viewAllButton = By.linkText("Pogledaj sve");

    public NewArticlesPage(WebDriver _driver) {
        driver = _driver;
    }

    public void clickOnViewAll() {
        driver.findElement(viewAllButton).click();
    }

}