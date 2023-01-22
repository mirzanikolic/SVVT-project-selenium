package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  private final WebDriver driver;

  private final By HeaderLinksWrapper = By.className("header-links-wrapper");
  private final By LoginNav = By.className("ico-login");
  private final By EmailInput = By.id("Email");
  private final By PasswordInput = By.id("Password");
  private final By RememberMe = By.id("RememberMe");
  private final By LoginSubmit = By.className("login-button");

  public LoginPage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnHeaderLinksWrapper() {
    driver.findElement(HeaderLinksWrapper).click();
  }

  public void clickOnLoginLink() {
    driver.findElement(LoginNav).click();
  }

  public void setEmail(String email) {
    driver.findElement(EmailInput).sendKeys(email);
  }

  public void setPassword(String password) {
    driver.findElement(PasswordInput).sendKeys(password);
  }

  public void clickOnRememberMe() {
    driver.findElement(RememberMe).click();
  }

  public void loginSubmit() {
    driver.findElement(LoginSubmit).click();
  }

  public void login() {
    clickOnHeaderLinksWrapper();
    clickOnLoginLink();
    setEmail("mirza.nikolic@stu.ibu.edu.ba");
    setPassword("mirzastudent123");
    clickOnRememberMe();
    loginSubmit();
  }
}