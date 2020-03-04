import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import LoginPage; 
 
public class VerifyLoginPage {
 
  @Test
  public void verifyLoginPage() {
  
    WebDriver driver = new FirefoxDriver();
    
    driver.manage().window().maximize(); //maximize the browser's window to view all the web application's elements during testing
    
    driver.get("http://localhost/login");
    
    LoginPage login = new LoginPage(driver); //consctructor to create new instance of imported LoginPage class
    
    login.loginToPanel('admin', 'qwerty1234'); //here we can use different test data
    
    driver.quit();
  
  }
 
}
