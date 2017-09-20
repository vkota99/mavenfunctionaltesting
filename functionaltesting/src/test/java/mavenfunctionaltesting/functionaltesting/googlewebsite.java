package mavenfunctionaltesting.functionaltesting;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class googlewebsite {
	// public String baseUrl = "http://localhost:8080/javawebappselinum/status.jsp";
    public String baseUrl = "https://www.google.com/";
//public String baseUrl = "http://192.168.56.135:8080/javawebappselinum-0.0.1-SNAPSHOT/admin.jsp";
// String driverPath = "/home/baseuser/Downloads/geckodriver";
    String driverPath = "/src/test/resources/geckodriver";
   // File driverPath = new File("/src/test/resources/geckodriver");
    public WebDriver driver ; 

@BeforeTest
public void launchBrowser() {
System.out.println("launching firefox browser"); 
System.setProperty("webdriver.firefox.marionette", driverPath);
driver = new FirefoxDriver();
driver.get(baseUrl);
}
@Test
public void connectglobewebapptest() {
 //Google

 verifyTitle("Google");


// verify title of index page
// verifyTitle("Welcome to Connect Globe Admin Page");


//verify header of index page
//  verifyHeaderMessage("USEFUL RESOURCES");


}


private void verifyTitle(String expectedTitle) {      
  String actualTitle = driver.getTitle();
//  System.out.println(actualTitle);
  AssertJUnit.assertEquals(actualTitle, expectedTitle);
}

@SuppressWarnings("unused")
private void verifyHeaderMessage(String expectedHeaderMessage) {
  // find header element
  WebElement element = driver.findElement(By.tagName("h2"));
   
  String actualHeaderMessage = element.getText();
  AssertJUnit.assertEquals(actualHeaderMessage, expectedHeaderMessage);
            
}


@AfterTest
public void terminateBrowser(){
driver.close();
}
}
