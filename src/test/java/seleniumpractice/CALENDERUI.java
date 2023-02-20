package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CALENDERUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saipr_l5ll2zx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		d.findElement(By.xpath("//input[@id='second_date_picker']")).click();
	//	WebElement fg=d.findElement(By.xpath("//span(text()='Next'));
		JavascriptExecutor x=(JavascriptExecutor)d;
		x.executeScript("window.scrollBy(0,900)");
		
		

	}
	
			
			
			
	
		
	
	
}
	

