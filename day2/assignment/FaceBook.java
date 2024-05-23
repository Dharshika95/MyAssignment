package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("Create new account")).click();
        //first name
		driver.findElement(By.xpath("//input[@name='firstname']"))
		             .sendKeys("dharshi");
		// last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("D");
		//email or mob num
		driver.findElement(By.xpath("//input[@name='reg_email__']"))
		             .sendKeys("9876543210");
		//password
		driver.findElement(By.id("password_step_input")).sendKeys("Durai");
		//select the date
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("8");
		//select the month
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Aug");
		//select the year
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1996");
		//select the gender
		WebElement genderRatio = driver.findElement(By.xpath("//label[text()='Female']"));
		genderRatio.click();
		//click the signup button
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println(driver.getTitle());
		
		
       
	}

}
