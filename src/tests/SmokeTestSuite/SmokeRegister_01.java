package tests.SmokeTestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.RegisterPage;

public class SmokeRegister_01 {

  private WebDriver driver;
  private RegisterPage registerPage;

  public SmokeRegister_01() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/Users/mirzanikolic/Documents/chromedriver/chromedriver");
    driver = new ChromeDriver();
    registerPage = new RegisterPage(driver);
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
      registerPage.clickOnHeaderLinksWrapper();
      registerPage.clickOnRegisterLink();
      registerPage.clickOnGenderMale();
      registerPage.setFirstName("Selenium");
      registerPage.setLastName("Project");
      registerPage.setEmail("mirza.nikolic@stu.ibu.edu.ba");
      registerPage.setCompany("Burch");
      registerPage.setStreetAddress("Kosevo 24");
      registerPage.setZipPostalCode("71000");
      registerPage.setCity("Sarajevo");
      registerPage.setPhone("062 786-574");
      registerPage.clickOnNewsletter();
      registerPage.setPassword("mirzastudent123");
      registerPage.setConfirmPassword("mirzastudent123");
      registerPage.clickConfirmButton();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}