package hooks;

import java.io.File;
import java.io.FileReader;
import java.time.Duration;

import io.cucumber.java.After;
 
import io.cucumber.java.Before;
 

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
 
 

public class Hooks {
	

      static WebDriver driver;

    @Before
    public void setUp() {
 
    	Properties prop = new Properties();
		try {
			File propFile = new File(System.getProperty("user.dir") + "/src/main/java/utils/data.properties");
			FileReader fr = new FileReader(propFile);
			prop.load(fr);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    	
    	
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
 


}



