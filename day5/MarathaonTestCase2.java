package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MarathaonTestCase2 {

	public static void main(String[] args) 
	{
		// Marathaon - TestCase2
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bag for boys");
		//(By.xpath("//span[text()='Select Date']")).click();
		driver.findElement(By.xpath("//div[text()='bag for boys']")).click();
		//WebElement result=driver.findElement(By.xpath("//span[text]()='1-48 of over 30,000 results for'"));
		//tagname[contains(@attributeName,'partial attribute value')] 
		String result;
		result = driver.findElement(By.xpath("//h2[contains(@class,'a-size-base a-spacing-small')]")).getText();
		System.out.println("Total number of results" +result);
			
	}

}
