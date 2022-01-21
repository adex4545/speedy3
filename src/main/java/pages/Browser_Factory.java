package pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Factory {
     Load_Property load_property=new Load_Property();
     String browserName =load_property.getProperty("browser");

     public void openBrowser(){
         if (browserName.equalsIgnoreCase("chrome")) {
             WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();
         }
         else if (browserName.equalsIgnoreCase("firefox")) {
             WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
         }
         else if (browserName.equalsIgnoreCase("edge")) {
             WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();
         }
         else if (browserName.equalsIgnoreCase("IE")) {
             WebDriverManager.iedriver().setup();
             driver = new InternetExplorerDriver();
         }
         else {
             System.out.println("Incorrect browser or name or empty" + browserName);
         }
     }





}
