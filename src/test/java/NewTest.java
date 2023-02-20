import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeSuite
	public void a() {
		System.out.println("before suite");
	}

	@BeforeClass
	public void ab() {
		System.out.println("before class");
	}

	@BeforeTest
	public void abc() {
		System.out.println("before Test");

	}

	@BeforeMethod
	public void abcd() {
		System.out.println("before Method");
	}

	@Test
	public void abcde() {
		System.out.println("Test");
	}

	@AfterMethod
	public void fundit() {
		System.out.println("After Method");
	}

	@AfterTest
	public void abcddeex() {
		System.out.println("After Test");

	}

	@AfterClass
	public void funcidnj() {
		System.out.println("After class");
	}

	@AfterSuite
	public void funjiui() {
		System.out.println("After suite");
	}

}
