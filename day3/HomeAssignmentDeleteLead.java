package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeAssignmentDeleteLead {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// Home Assignment - Delete Lead
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		String LeadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		Thread.sleep(2000);
		System.out.println("Lead ID is:"+LeadID);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field'])[24]")).sendKeys(LeadID);
		Thread.sleep(2000);
		driver.findElement(By.id("ext-gen334")).click();
		String  ErrorMessage = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println("Error Message is displayed: "+ErrorMessage);
		driver.close();
		

	}

}
