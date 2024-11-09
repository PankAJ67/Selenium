package JavaSelenium.com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuit {

	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
driver.findElement(By.linkText("Facebook")).click();
		
Thread.sleep(5000);
driver.quit();

       
   
     

	}

}
