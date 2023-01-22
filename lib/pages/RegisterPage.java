package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
  private WebDriver driver;

  private final By HeaderLinksWrapper = By.className("header-links-wrapper");
  private final By RegisterNav = By.className("ico-register");
  private final By GenderMale = By.id("gender-male");
  private final By FirstName = By.id("FirstName");
  private final By LastName = By.id("LastName");
  private final By Email = By.id("Email");
  private final By Company = By.id("Company");
  private final By StreetAddress = By.id("StreetAddress");
  private final By ZipPostalCode = By.id("ZipPostalCode");
  private final By City = By.id("City");
  private final By Phone = By.id("Phone");
  private final By Newsletter = By.id("Newsletter");
  private final By Password = By.id("Password");
  private final By ConfirmPassword = By.id("ConfirmPassword");
  private final By ConfirmButton = By.id("register-button");

  public RegisterPage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnHeaderLinksWrapper() {
    driver.findElement(HeaderLinksWrapper).click();
  }

  public void clickOnRegisterLink() {
    driver.findElement(RegisterNav).click();
  }

  public void clickOnGenderMale() {
    driver.findElement(GenderMale).click();
  }

  public void setFirstName(String firstName) {
    driver.findElement(FirstName).sendKeys(firstName);
  }

  public void setLastName(String lastName) {
    driver.findElement(LastName).sendKeys(lastName);
  }

  public void setEmail(String email) {
    driver.findElement(Email).sendKeys(email);
  }

  public void setCompany(String company) {
    driver.findElement(Company).sendKeys(company);
  }

  public void setStreetAddress(String streetAddress) {
    driver.findElement(StreetAddress).sendKeys(streetAddress);
  }

  public void setZipPostalCode(String zipPostalCode) {
    driver.findElement(ZipPostalCode).sendKeys(zipPostalCode);
  }

  public void setCity(String city) {
    driver.findElement(City).sendKeys(city);
  }

  public void setPhone(String phone) {
    driver.findElement(Phone).sendKeys(phone);
  }

  public void clickOnNewsletter() {
    driver.findElement(Newsletter).click();
  }

  public void setPassword(String password) {
    driver.findElement(Password).sendKeys(password);
  }

  public void setConfirmPassword(String confirmPassword) {
    driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
  }

  public void clickConfirmButton() {
    driver.findElement(ConfirmButton).click();
  }
}