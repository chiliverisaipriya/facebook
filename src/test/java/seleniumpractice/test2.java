package seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class test2 {

	@Test(priority=2)
	public void add() {
		System.out.println("hellow1");
	
	}
	@Test(priority=1)
	public void sub() {
		System.out.println("hellow2");
	}
	
	@Test(enabled=false)
	public void mul() {
		System.out.println("hellow3");
	}
	
	@Test(priority=4)
	public void div() {
		System.out.println("hellow4");
	}
	@Test
	public void avt() {
		System.out.println("hellow5");
	}
	
	
}
