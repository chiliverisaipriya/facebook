package seleniumpractice;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class practicepage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saipr_l5ll2zx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://qaclickacademy.com/practice.php");
		//WebElement h= d.findElement(By.xpath("//div[@id='gf-BIG']"));
		//System.out.println(h.findElements(By.tagName("a")).size());
		WebElement y=d.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		System.out.println(y.findElements(By.tagName("a")).size());
		int ct = y.findElements(By.tagName("a")).size();
		List<WebElement> lst = y.findElements(By.tagName("a"));
		for(int i=1;i<ct;i++) {
			String gy = Keys.chord(Keys.CONTROL,Keys.ENTER);
			lst.get(i).sendKeys(gy);
			
		}
		
		Set<String> wndws = d.getWindowHandles();
		Iterator<String> itr = wndws.iterator();
		//String Parentwndw = itr.next();
		//String childwndw = itr.next();
		while(itr.hasNext()) {
			d.switchTo().window(itr.next());
			System.out.println(d.getTitle());
		}
		
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(""));
		
		
		
		/*
		 * Set<String> wndws = d.getWindowHandles(); Iterator<String> itr =
		 * wndws.iterator(); String Parentwndw = itr.next(); String childwndw =
		 * itr.next(); System.out.println(d.getTitle());
		 */
		
		//System.out.println(d.findElements(By.tagName("a")).size());
		
		/*
		 * d.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * System.out.println(d.getTitle()); System.out.println(d.getCurrentUrl()); //
		 * System.out.println(d.getPageSource());
		 * d.findElement(By.xpath("//input[@value='radio1']")).click();
		 * d.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("india");
		 */
		// d.findElements(By.xpath(""))
		/*
		 * WebElement a = d.findElement(By.id("dropdown-class-example")); // Select
		 * drpdwn = new Select(a); // drpdwn.selectByVisibleText("Option1"); //
		 * drpdwn.selectByValue(null) d.close(); //
		 * d.findElement(By.xpath("//input[@id='autocomplete']")).
		 * //d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // WebDriverWait
		 * x=new WebDriverWait(d,5); //x.until(ExpectedConditions.visibilityOf(a)); //
		 * Assert.assertTrue(); Actions a1=new Actions(d);
		 * a1.moveToElement(null).build().perform();
		 * 
		 * Set<String> h=d.getWindowHandles(); Iterator<String> itr = h.iterator();
		 * String parent=itr.next(); String child=itr.next();
		 * d.switchTo().window(child);
		 */
		//System.out.println();
		/*
		 * System.out.println(d.findElements(By.tagName("a")).size()); WebElement
		 * rt=d.findElement(By.xpath("//div[@id=\"gf-BIG\"]"));
		 * System.out.println(rt.findElements(By.tagName("a")).size());
		 * 
		 * WebElement rt1=d.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		 * System.out.println(rt1.findElements(By.tagName("a")).size()); int
		 * aw=rt1.findElements(By.tagName("a")).size(); for(int i=0;i<aw;i++) { String
		 * h1=Keys.chord(Keys.CONTROL,Keys.ENTER);
		 * rt1.findElements(By.tagName("a")).get(i).sendKeys(h1);
		 * 
		 * }
		 */	
		
		
		

		

			
		
		
		
		
		
		
	}

	
}
