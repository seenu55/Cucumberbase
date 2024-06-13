package Stepdef;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.AttributeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Baseclass.BaseclassLuma;
import Pomclass.Pomclassluma;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefluma extends BaseclassLuma {
	 Pomclassluma path = new Pomclassluma();
		@Given("User Launch URL")
		public void user_launch_url() {
			getURL("https://magento.softwaretestingboard.com/"); 
		}
		@When("User Sing in the account Valid Email and Password")
		public void user_sing_in_the_account_valid_email_and_password() throws InterruptedException {
		    driver.findElement(path.signin).click();
		    Thread.sleep(3000);
		    driver.findElement(path.email).sendKeys("seenuvasang00@gmail.com");
		    driver.findElement(path.password).sendKeys("Seenu@vasan55");  
		}
		@Then("User Click the Sign in Button")
		public void user_click_the_sign_in_button() throws Throwable {
			driver.findElement(path.sumbit).click(); 
			Thread.sleep(2000);
			TakesScreenshot st = (TakesScreenshot) driver;
			File source = st.getScreenshotAs(OutputType.FILE);
			File destination  = new File("C:\\Users\\seenu\\eclipse-workspace\\Cucumberbase\\screenshorty\\Homepage.png");
			FileUtils.copyFile(source, destination);
		}
		@Then("User click on Women dress and select the tops option and select the jackets option")
		public void user_click_on_women_dress_and_select_the_tops_option_and_select_the_jackets_option() throws InterruptedException {
		   WebElement womenoption=driver.findElement(path.women);
		   Actions action=new Actions(driver);
		   action.moveToElement(womenoption).perform();
		   WebElement topsoption=driver.findElement(path.tops);
		   Actions action1=new Actions(driver);
		   action1.moveToElement(topsoption).perform();
		   driver.findElement(path.jackets).click();
		   Thread.sleep(3000);
		}
		@Then("User Click first jackets to add to cart")
		public void user_click_first_jackets_to_add_to_wish_list() {
			driver.findElement(path.selectjacket).click();
			driver.findElement(path.selectsize).click();
			driver.findElement(path.selectcolor).click();
			driver.findElement(path.jacketadd).click();  
		}
		@Then("User Click Men dress and select the Bottom option and select the pants to add to cart")
		public void user_click_men_dress_and_select_the_bottom_option_and_select_the_shorts_option() {
			WebElement men = driver.findElement(path.menoptions);
			Actions action = new Actions(driver);
			action.moveToElement(men).perform();
			WebElement bottoms = driver.findElement(path.bottomsoptions);
			Actions action1 = new Actions(driver);
			action.moveToElement(bottoms).perform();
			driver.findElement(path.pants).click();	    
		}
		@Then("User click first pants to add to cart")
		public void user_click_first_shorts_to_add_to_wish_list() {
			driver.findElement(path.selectpants).click();
			driver.findElement(path.selectpantsize).click();
			driver.findElement(path.selectpantcolor).click();
			driver.findElement(path.addtopant).click();  
		}
		@Then("User Click Shopping cart and edit jackets quantity then checkout")
		public void user_click_shopping_cart_and_edit_jackets_quantity_then_checkout() {
		    driver.findElement(path.shippingcart).click();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,400)");
		    driver.findElement(path.checkout).click();   
		}
		@Then("User Click Shipping methods and click next and place order")
		public void user_click_shipping_methods_and_click_next_and_place_order() throws Throwable {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)");
			driver.findElement(path.shippingmethods).click();
			driver.findElement(path.Next).click();
			driver.findElement(path.placeorder).click();
			TakesScreenshot st =  (TakesScreenshot) driver;
			File source = st.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\seenu\\eclipse-workspace\\Cucumberbase\\screenshorty\\Thankyoupage.png");
			FileUtils.copyFile(source, destination);    
		}
		@Then("User Click Print Option")
		public void user_click_print_option() throws AWTException, Exception {
			driver.findElement(path.print).click();
			Set<String> window = driver.getWindowHandles();
			List<String> WindowHandles = new ArrayList(window);
			driver.switchTo().window(WindowHandles.get(1));
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
		    Thread.sleep(2000);
	        robot.keyPress(KeyEvent.VK_A);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        driver.close();
	           
	        driver.switchTo().window(WindowHandles.get(0));
            Thread.sleep(2000);
            driver.quit();		
		}
	}


