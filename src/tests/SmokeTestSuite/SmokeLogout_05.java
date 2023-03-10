package tests.SmokeTestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class SmokeLogout_05 {
  private WebDriver driver;
  private HomePage homePage;
  private LoginPage loginPage;

  public SmokeLogout_05() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/Users/mirzanikolic/Documents/chromedriver/chromedriver");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
    loginPage = new LoginPage(driver);
  }

  @After
  public void clear() {
    try {
      Thread.sleep(2000);
      driver.quit();
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

  @Test
  public void Run() {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      homePage.clickOnHeaderLinksWrapper();
      loginPage.login();
      Thread.sleep(5000);
      homePage.clickOnHeaderLinksWrapper();
      homePage.clickOnLogout();
      Thread.sleep(2000);
      assertEquals("https://genelec.ba/", driver.getCurrentUrl());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }
}