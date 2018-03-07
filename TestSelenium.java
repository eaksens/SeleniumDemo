package test;


import static org.junit.Assert.*;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSelenium {
	
	public static WebDriver driver;
	//private static StringBuffer verificationErrors = new StringBuffer();
	//private String browser;
	


@BeforeClass
public static void setUp() throws Exception {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mai Eaksen\\workspace\\SeleniumPlugIn\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	 }
	


@Test
	public void loginTest() throws Exception {
		
		driver.get("https://mybb.gvsu.edu");
		
		
		WebElement username = driver.findElement(By.name("user_id"));
		username.sendKeys("eaksens");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("CIS2017m");
		
		
		//move the mouse to the menu
		
		
		Thread.sleep(3000); 
		WebElement logIn = driver.findElement(By.id("entry-login"));
		logIn.click();
		
	
	//Test the page title after login
		System.out.println(driver.getTitle());
		assertEquals("Welcome, Suphassorn – Blackboard Learn",driver.getTitle());
	

	//Test clicking on a selected course in the course list
		Thread.sleep(3000); //wait for page to load
		WebElement mycourses = driver.findElement(By.id("module:_4_1"));
		WebElement course = mycourses.findElement(By.linkText("CIS 613 01 - Software Testing"));
		//System.out.println(course.getText());
		course.click();

	//Test clicking on Syllabus whether it is exist
		WebElement syllabus = driver.findElement(By.id("paletteItem:_2458701_1"));
		syllabus.click();
		//validate that after click on Syllabus, then user is landed on Syllabus page
		WebElement syllabusTitle = driver.findElement(By.id("pageTitleHeader"));
		System.out.println(syllabusTitle);
		//assertEquals("");
		
	//Test 
	
	}










	


//	@AfterClass
//	public static void tearDown() throws Exception {
//		Thread.sleep(5000);
//		driver.quit();
//		
//	}

//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
//
//	private boolean isAlertPresent() {
//		try {
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}
//	}
}

