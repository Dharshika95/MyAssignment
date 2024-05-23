package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {
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
		//select the account
		driver.findElement(By.linkText("Accounts")).click();
		//click the create account
		driver.findElement(By.xpath("//a[text()='Create Account']"))
		      .click();
		//create a account name
		driver.findElement(By.xpath("//input[@id='accountName']"))
		         .sendKeys("Dharshika");
		//enter the text in description
		driver.findElement(By.name("description")).
		          sendKeys("Selenium Automation Tester");
		//select the industry
		Select indus =new Select(driver.findElement(By.name("industryEnumId")));
		indus.selectByVisibleText("Computer Software");
		//Select the ownership
		WebElement ownership =driver.findElement(By.name("ownershipEnumId"));
		Select s = new Select( ownership);
		s.selectByVisibleText("S-Corporation");
		//select the source
		WebElement source =driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select s1 = new Select(source);
		s1.selectByValue("LEAD_EMPLOYEE");
		//select the marketing campaign
		Select s2 = new Select(driver.findElement(By.id("marketingCampaignId")));
		s2.selectByIndex(3);
		//select the state
		Select s3 = new Select(driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")));
		s3.selectByValue("TX");
		//click the create account button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
		
		
		      
		
		
	}

}
