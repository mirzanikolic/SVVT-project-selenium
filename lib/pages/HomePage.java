package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private final WebDriver driver;

  private final By HeaderLinksWrapper = By.className("header-links-wrapper");
//  private final By NewArticlesNav = By.xpath("/html/body/div[8]/div[1]/div[2]/div/div[2]/div/ul[1]/li[2]/a/span");
    private final By NewArticlesNav = By.xpath("/html/body/div[8]/div[1]/div[2]/div/div[2]/div/ul[1]/li[2]/a/span");

  private final By LogoutNav = By.className("ico-logout");
  private final By WishListNav = By.className("ico-wishlist");
  private final By PhonesCategory = By.linkText("Mobilni telefoni");
  private final By Iphone11Card = By.linkText("Apple iPhone 11 64GB White");
  private final By SearchBar = By.id("small-searchterms");
  private final By SearchItem = By.className("instant-search-item");
  private final By MainCart = By.className("cart-trigger");
  private final By CartButton = By.className("add-to-cart-button");
  private final By CartContent = By.className("content");
  private final By NewsletterEmail = By.id("newsletter-email");
  private final By SubscribeButton = By.id("newsletter-subscribe-button");
  private final By SubscribeResultContent = By.id("newsletter-result-block");
  private final By SearchButton = By.className("search-box-button");

  public HomePage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnHeaderLinksWrapper() {
    driver.findElement(HeaderLinksWrapper).click();
  }

  public void clickOnNewArticlesButton() { driver.findElement(NewArticlesNav).click(); }

  public void clickOnLogout() {
    driver.findElement(LogoutNav).click();
  }

  public void clickOnPhonesCategory() {
    driver.findElement(PhonesCategory).click();
  }

  public void clickOnMobilePhone() {
    driver.findElement(Iphone11Card).click();
  }

  public void clickOnCartButton() {
    driver.findElement(CartButton).click();
  }

  public void clickOnSearchBar() {
    driver.findElement(SearchBar).click();
  }

  public void clickOnMainCart() {
    driver.findElement(MainCart).click();
  }

  public void setSearchText(String searchText) {
    driver.findElement(SearchBar).sendKeys(searchText);
  }

  public void clickOnSearchItem() {
    driver.findElement(SearchItem).click();
  }

  public void clickOnWishList() {
    driver.findElement(WishListNav).click();
  }

  public Boolean isItemAddedToCart() {
    String text = driver.findElement(CartContent).getText();
    return text.length() > 0;
  }

  public void setNewsletterEmail(String newsletterEmail) {
    driver.findElement(NewsletterEmail).sendKeys(newsletterEmail);
  }

  public void clickOnSubscribeButton() {
    driver.findElement(SubscribeButton).click();
  }

  public Boolean isSubscriptionFailed() {
    return driver.findElement(SubscribeResultContent).getText().trim().equals("Enter valid email");
  }

  public void clickOnSearchButton() {
    driver.findElement(SearchButton).click();
  }


}