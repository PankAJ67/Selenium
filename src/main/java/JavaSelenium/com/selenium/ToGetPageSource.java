package JavaSelenium.com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	
	// to get html code of page 
	String pagesource = driver.getPageSource();
	
   System.out.println(pagesource);


}


}

