package tests.RegressionTestSuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class SubscribeToNewsletter_07 {

  WebDriver driver;
  HomePage homePage;

  public SubscribeToNewsletter_07() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/Users/mirzanikolic/Documents/chromedriver/chromedriver");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      homePage.setNewsletterEmail("random.email@stu.ibu.edu.ba");
      homePage.clickOnSubscribeButton();
      Thread.sleep(1000);
      assertTrue(homePage.isSubscriptionFailed());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

}