package tests.SmokeTestSuite;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;

public class SmokeLogin_02 {

  private WebDriver driver;
  private LoginPage loginPage;

  public SmokeLogin_02() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/Users/mirzanikolic/Documents/chromedriver/chromedriver");
    driver = new ChromeDriver();
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
  public void Run() throws InterruptedException {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
    driver.manage().window().maximize();
    loginPage.clickOnHeaderLinksWrapper();
    loginPage.clickOnLoginLink();
    loginPage.setEmail("mirza.nikolic@stu.ibu.edu.ba");
    loginPage.setPassword("mirzastudent123");
    loginPage.clickOnRememberMe();
    loginPage.loginSubmit();
    Thread.sleep(3000);
    assertNotEquals(driver.getCurrentUrl(), "https://genelec.ba/login?returnUrl=%2F");
  }
}