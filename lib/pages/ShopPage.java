package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.xpath.XPathResult;

public class ShopPage {
  WebDriver driver;

  private final By SortInput = By.id("products-orderby");
  private final By ProductCartButton = By.className("product-box-add-to-cart-button");
  private final By NoResultMsg = By.className("no-result");

  public ShopPage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnSortInput() {
    driver.findElement(SortInput).click();
  }

  public void sortByDescendingNameOrder() {
    Select select = new Select(driver.findElement(SortInput));
    select.selectByValue("6");
  }

  public void clickOnAddToCartButton() {
    driver.findElement(ProductCartButton).click();
  }

  public void inputMinPrice(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("document.getElementById('slider').setAttribute('data-selectedminvalue', 500)");
  }

    public void inputMaxPrice(){
     JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("document.getElementById('slider').setAttribute('data-selectedmaxvalue', '1000')");
  }

  public Boolean noResults() {
    return driver.findElement(NoResultMsg).getText().trim().equals("No products were found that matched your criteria.");
  }
}