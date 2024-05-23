package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
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
		//click the leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//click on create lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"))
		   .sendKeys("Testleaf");
		//first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"))
		   .sendKeys("Dharshika");
		//last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"))
		    .sendKeys("Durai");
		//firstname-local
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"))
		    .sendKeys("dharshi");
		//department
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']"))
		     .sendKeys("Testing");
		//description
		driver.findElement(By.id("createLeadForm_description"))
		    .sendKeys("Selenium Automation Tester");
		//e-mail
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"))
		   .sendKeys("dharshika@gmail.com");
		//select the state
		WebElement state = driver.findElement(By.
				xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select s = new Select(state);
		s.selectByVisibleText("New York");
		//click on create button
		driver.findElement(By.name("submitButton")).click();
		//click on edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//clear the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//important note
		driver.findElement(By.id("updateLeadForm_importantNote"))
		   .sendKeys("Selenium Automation Tester");
		//click on update
		driver.findElement(By.name("submitButton")).click();
		//getTitle
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//close window
		driver.quit();
		
				
				
		
				
	}

}
