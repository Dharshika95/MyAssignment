package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		//click the findleads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//click the phone
		driver.findElement(By.linkText("Phone")).click();
		//send the phone-number
		driver.findElement(By.xpath("//input[@name='phoneNumber']"))
		 .sendKeys("980765438");
		//click the find-leads
		driver.findElement(By.linkText("Find Leads")).click();
		//capture the lead id
		WebElement id =driver.findElement(By.xpath("//a[text()='10221']"));
		System.out.println(id.getText());
    	id.click();
//		//click the delete button
//		driver.findElement(By.xpath("//a[text()='Delete']")).click();
//		//click the find-leads
//		driver.findElement(By.linkText("Find Leads")).click();
//		//enter the id
//		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("10225");
//		//click the find-leads
//        driver.findElement(By.linkText("Find Leads")).click();
//        Thread.sleep(3000);
//        //display the error msg
//		WebElement msg = driver.findElement(By.xpath("//div[text()='No records to display']"));
//		System.out.println(driver.getTitle());
		
	
		
		
		
		
		
		
	}

}
