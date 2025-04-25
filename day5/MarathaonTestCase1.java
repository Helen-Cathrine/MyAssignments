package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarathaonTestCase1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Marathan - Test Case1
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.className("cinemas-inactive")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		//span[text()='Learn More'] 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		//span[text()='INOX National,Virugambakkam Chennai
		//Select Date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		//tagname[contains(text(),'partial text')] 
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='SUMO'])[2]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='12:50 PM']")).click();
		//driver.findElement(By.xpath("(//span[@class='mx-2'])")).click();
		//mx-2
		//07:20 PM
		//(//span[@class=' label bBody'])[3]
		WebElement button=driver.findElement(By.xpath(("(//span[text()='Book'])[5]")));
		button.click();
		//driver.findElement(By.className("sc-kfeOyU hsmcHs reject-terms"));
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("(//span[text()='7'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String seatno;
		seatno = driver.findElement(By.xpath("//p[text()='C7']")).getText();
		System.out.println("Seat Number is: "+seatno);
		String grandtotal;
		grandtotal = driver.findElement(By.xpath("//span[text()='221.27']")).getText();
		System.out.println("Grand Total is: "+grandtotal);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String pagetitle;
		pagetitle = driver.getTitle();
		System.out.println("PageTitle is:" +pagetitle);
		
		//(//span[@class='pi pi-times'])[3] 
		
	}

}
