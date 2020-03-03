import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import LoginPage;
 
public class VerifyLoginPage {
 
  @Test
  public void verifyLoginPage() {
  
    WebDriver driver = new FirefoxDriver();
    
    driver.manage().window().maximize();
    
    driver.get("http://localhost/login");
    
    LoginPage login = new LoginPage(driver);
    
    login.clickOnLoginButton();
    
    driver.quit();
  
  }
 
}