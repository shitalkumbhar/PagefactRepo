package commonTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	public WebDriver driver = null;
	public WebDriverWait wait= null;
	
	@BeforeSuite
	public void loginToApp(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://online.actitime.com/chevron/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait= new WebDriverWait(driver, 20);
		driver.findElement(By.name("username")).sendKeys("shitalkumbhar9665@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("123456");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
	}

	@AfterSuite
	public void logOut() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
