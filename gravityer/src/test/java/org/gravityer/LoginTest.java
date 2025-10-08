package org.gravityer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest 
{
	   WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.demoblaze.com/");
	    }

	    @Test(priority=1)
	    public void loginTest() throws InterruptedException {
	        driver.findElement(By.id("login2")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("loginusername")).sendKeys("rasmi@25");
	        driver.findElement(By.id("loginpassword")).sendKeys("12345");
	        driver.findElement(By.xpath("//button[text()='Log in']")).click();

	        Thread.sleep(3000);
	    }

	    @Test(priority=2)
	    public void selectProduct() throws InterruptedException {
	        WebElement product = driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']"));
	        product.click();
	        Thread.sleep(2000);
	    }

	    @Test(priority=3)
	    public void logoutTest() throws InterruptedException {
	        driver.findElement(By.id("logout2")).click();
	        Thread.sleep(2000);
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.close();
	    }
	
}
