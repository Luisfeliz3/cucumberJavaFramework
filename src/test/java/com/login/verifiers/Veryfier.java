package com.login.verifiers;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

 

 
public class Veryfier{
	
	 
		
	 
		convertYaml selects = new convertYaml();
 
				
		public void click(WebDriver driver,String locatorName) {
			WebElement element = selects.locator(driver, locatorName );
			 highlightElement(driver, element);
			 element.click();
			 return;
		}

		
		
		public void sendKeys(WebDriver driver,String locatorName, String string) {
		
			 try {
					WebElement element = selects.locator(driver, locatorName );
		 
					 element.sendKeys(string);
			} catch (Exception e) {
				 assertEquals(null, false, "Element not found and unable to send keys!");
			}
			 
			 return;
		}
		

		
		public void isDiplayed(WebDriver driver,String locatorName) {
		     WebElement element = selects.locator(driver, locatorName );
		     highlightElement(driver, element);
		     element.isDisplayed();
		     assertEquals(true, element.isDisplayed());
		     
		}
 
		public void isEnanble(WebDriver driver,String locatorName) {
			  WebElement element = selects.locator(driver, locatorName );
			  highlightElement(driver, element);
			 element.isEnabled();
			 assertEquals(true, element.isEnabled());
			 return;
		}
	 
		public void isSelected(WebDriver driver,String locatorName) {
			 WebElement element = selects.locator(driver, locatorName );
			 highlightElement(driver, element);
			 element.isSelected();
			 assertEquals(true, element.isSelected());
			 return;
		}
		
		
		
		public void clear(WebDriver driver,String locatorName) {
			 WebElement element = selects.locator(driver, locatorName );	 
			 element.clear();		 
			 return;
		}
		
		
		
		public String getText(WebDriver driver,String locatorName) {
			WebElement element = selects.locator(driver, locatorName );
		    highlightElement(driver, element);
			String text  = element.getText();
			return text;
		}
		
		public void switchToAlertGetText(WebDriver driver,String actual) {
			 String expected =driver.switchTo().alert().getText();
			 assertEquals(actual, expected);
			 driver.switchTo().alert().accept();
		}
		
		@Given("user is in the login page")
		public void today_is_sunday() {
		    // Write code here that turns the phrase above into concrete actions
		}
		
		
		  public void getAllLinks(WebDriver driver){
			  //Get list of web-elements with tagName  - a
			  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			  
			  //Traversing through the list and printing its text along with link address
			  for(WebElement link:allLinks){
			  System.out.println(link.getText() + " - " + link.getAttribute("href"));
			  }
		  }
		
		
		   // Method to highlight an element
	    public static void highlightElement(WebDriver driver, WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Store the original style to reset later
	        String originalStyle = element.getAttribute("style");

	        // Change the element's style to add a red border and yellow background
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", 
	                element, "border: 2px solid red; background-color: yellow;");

	        // Optionally, pause to see the highlight effect
	        try {
	            Thread.sleep(500); // Highlight duration (milliseconds)
	        } catch (InterruptedException e) {
	            System.out.println("Highlight interrupted");
	        }

	        // Revert to the original style
	        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", 
	                element, originalStyle);
	    }
		

	}

