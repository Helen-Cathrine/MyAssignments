package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookRegistration {

	public static void main(String[] args) throws InterruptedException 
	{
		//Facebook Registration process
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Helen");
		driver.findElement(By.name("lastname")).sendKeys("Pathinathan");
	   //Day Drop DOwn Declaration and Initialization
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select dropdown1 = new Select(dayDropDown);
		dropdown1.selectByIndex(23);
		//Month Drop DOwn Declaration and Initialization
		WebElement monthDropDown = driver.findElement(By.name("birthday_month"));
		Select dropdown2 = new Select(monthDropDown);
		dropdown2.selectByVisibleText("Apr");
		//Year Drop DOwn Declaration and Initialization
		WebElement yearDropDown = driver.findElement(By.name("birthday_year"));
		Select dropdown3 = new Select(yearDropDown);
		dropdown3.selectByValue("1994");
		//Adding Gender
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("helencathrine@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Virginia124$");
		driver.findElement(By.name("websubmit")).click();
		
		
		
		

	}

}
