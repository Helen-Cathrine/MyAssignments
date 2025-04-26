package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignment4InterationsWithCheckBoxes {

	public static void main(String[] args) throws InterruptedException
	{
		// HomeAssignment 4 - Interactions with check boxes
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement  basic = driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]"));
		if (basic.isEnabled())
			{
			basic.click();
			Thread.sleep(2000);
			boolean BasicCheckBox = driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).isSelected();
			System.out.println("The Basic checkbox is selected: "+BasicCheckBox);
			}
		 WebElement Notification = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]"));
		if(Notification.isEnabled())
		{
			Notification.click();
			Thread.sleep(2000);
			boolean NotificationCheckBox = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).isSelected();
			System.out.println("The NotificationCheckBox is selected: "+NotificationCheckBox);
		}
		
	    WebElement language = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]"));
	    if(language.isEnabled())
	    {
	    	language.click();
	    	Thread.sleep(2000);
	    	boolean LanguageCheckBox = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).isSelected();
	    	System.out.println("The Language Check Box is selected: "+LanguageCheckBox);
	    }
		
	    WebElement tristate = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]"));
	    if(tristate.isEnabled())
	    {
	    tristate.click();
	    Boolean TristateCheckBox = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[8]")).isSelected();
	    System.out.println("Tristate Check Box is selecte: "+TristateCheckBox);
	    }
	    Thread.sleep(1000);
	    WebElement Toggle = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
	    Thread.sleep(2000);
	    Toggle.click();
	    
	    boolean CheckBox = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox ui-widget')])[3]")).isEnabled();
	    System.out.println("Checkbox is Disabled: "+CheckBox);
	    
	    driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//li[contains(@class,'ui-selectcheckboxmenu-item')])[4]")).click();
	   
 	}

}
