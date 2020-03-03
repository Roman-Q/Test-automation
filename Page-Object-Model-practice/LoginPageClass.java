import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
/*
 This class stores all the locators and methods 
 of login page
*/

public class LoginPage {
 
  WebDriver driver;
 
  By username = By.id("user_login");
  By password = By.xpath(".//*[@id='user_pass']");
  By loginButton = By.name("wp-submit");
 
  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }
  
  public void loginToPanel(String userid, String pass) { //parameters for different data testing
    driver.findElement(username).sendKeys(userid);
    driver.findElement(password).sendKeys(pass);
    driver.findElement(loginButton).click();
  }

  public void typeUserName(String uid) {
    driver.findElement(username).sendKeys(uid);
  }
 
  public void typePassword(String pass) {
    driver.findElement(password).sendKeys(pass);
  }
 
  public void clickOnLoginButton() {
    driver.findElement(loginButton).click(); 
  }

}
