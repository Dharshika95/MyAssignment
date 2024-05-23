package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//username:
		driver.findElement(By.xpath("//input[@id='username']")).
		        sendKeys("demosalesmanager");
		//password:
	    driver.findElement(By.xpath("//input[@id='password']")).
	            sendKeys("crmsfa");
	    //submit button:
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//select the text crm:
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//click the leads:
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//click the create leads:
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		//Company Name:
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).
		sendKeys("Testleaf");
		//first Name:
		driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).
		sendKeys("Dharshi");
		
		
		
		
		
		}

}
