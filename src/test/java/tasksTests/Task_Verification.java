package tasksTests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import commonTests.BaseTest;

public class Task_Verification extends BaseTest {
	@Test
	public void CreateTasks() {
		
		driver.findElement(By.xpath("//a[div[text()='Tasks']]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Add New']")));
		driver.findElement(By.xpath("//div[text()='Add New']")).click();	
	}

}
