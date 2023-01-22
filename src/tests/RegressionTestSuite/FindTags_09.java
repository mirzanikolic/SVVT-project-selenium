package tests.RegressionTestSuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.NewArticlesPage;
import pages.ShopPage;

import static org.junit.Assert.assertEquals;

public class FindTags_09 {

    WebDriver driver;
    HomePage homePage;
    NewArticlesPage newArticlesPage;

    public FindTags_09() {

    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/mirzanikolic/Documents/chromedriver/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        newArticlesPage = new NewArticlesPage(driver);
    }

    @Test
    public void Run() {
        driver.get("https://genelec.ba/");
        try {
            Thread.sleep(1000);
            driver.manage().window().maximize();
            homePage.clickOnNewArticlesButton();
            Thread.sleep(2000);
            newArticlesPage.clickOnViewAll();
            Thread.sleep(1000);
            assertEquals("https://genelec.ba/producttag/all", driver.getCurrentUrl());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

