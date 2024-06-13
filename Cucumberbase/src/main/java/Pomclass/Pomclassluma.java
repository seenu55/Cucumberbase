package Pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;

import Baseclass.BaseclassLuma;

public class Pomclassluma extends BaseclassLuma {


	//WebDriver driver = new ChromeDriver();
		//sign in page
		public By signin = By.xpath("(//li[@class=\"authorization-link\"])[1]");
		public By email = By.id("email");
		public By password = By.id("pass");
		public By sumbit = By.id("send2");
		//click women options and select jackets and to add to cart 
		public By women = By.id("ui-id-4");
		public By tops = By.id("ui-id-9");
		public By jackets = By.id("ui-id-11");
		public By selectjacket = By.xpath("(//img[@class=\"product-image-photo\"])[2]");
		public By selectsize = By.id("option-label-size-143-item-168");
		public By selectcolor = By.id("option-label-color-93-item-49");
		public By jacketadd = By.id("product-addtocart-button");
		//Click men option and select pant to add to cart 
		public By menoptions = By.id("ui-id-5");
		public By bottomsoptions = By.id("ui-id-18");
		public By pants = By.id("ui-id-23");
		public By selectpants = By.xpath("(//img[@class=\"product-image-photo\"])[2]");
		public By selectpantsize = By.id("option-label-size-143-item-177");
		public By selectpantcolor = By.id("option-label-color-93-item-49");
		public By addtopant = By.id("product-addtocart-button");
		// checkout page
		public By shippingcart = By.xpath("//a[text()='shopping cart']");
		public By checkout = By.xpath("(//button[@type=\"button\"])[5]");
		public By shippingmethods = By.xpath("(//input[@class=\"radio\"])[1]");
		public By Next = By.xpath("(//button[@type=\"submit\"])[2]");
		public By placeorder = By.xpath("(//button[@type=\"submit\"])[3]");
		public By print = By.xpath("//a[@class=\"action print\"]");
		
		
		
		

	
				
		

	

}
