package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Helen");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Cathrine");
		WebElement  SelectDropDown=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options=new Select(SelectDropDown);
		options.selectByIndex(3);
		Thread.sleep(2000);
		WebElement  SelectDropDown1= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select options1 = new Select(SelectDropDown1);
		Thread.sleep(2000);
		options1.selectByVisibleText("Automobile");
		WebElement SelectDropDown3 = driver.findElement(By.name("ownershipEnumId"));
		Select options2 = new Select(SelectDropDown3);
		options2.selectByValue("OWN_CCORP");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		driver.close();
		
		
	}

}
