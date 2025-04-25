package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MarathaonTestCase2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Marathaon - TestCase2
		//01) Launch Edge  
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//02) Load https://www.amazon.in/ add  implicitlyWait
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//03) Type "Bags for boys" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bag for boys");
		//(By.xpath("//span[text()='Select Date']")).click();
		driver.findElement(By.xpath("//div[text()='bag for boys']")).click();
		//tagname[contains(@attributeName,'partial attribute value')] 
		String result;
		result = driver.findElement(By.xpath("//h2[contains(@class,'a-size-base a-spacing-small')]")).getText();
		System.out.println("Total number of results: "+result );
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("s-result-sort-select_4")).click();
		String brandname;
		brandname = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']")).getText();
		System.out.println("Brand Name is: "+brandname);
		String discountPrice;
		discountPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("Discount Price is: "+discountPrice);
		driver.getTitle();
		driver.close();
	}

}
