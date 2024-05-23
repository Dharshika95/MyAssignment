package week3.day2assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioProgram {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//search box
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
	
		//enter the male gender
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(3000);
		// enter the fashion bags
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement
				(By.xpath("//div[contains(@class,'filter-container')]/div[contains(@class,'filter')]//div[contains(@class,'length')]"));
		System.out.println(element.getText());
		List<WebElement> bagsname= driver.findElements(By.className("brand"));
		for (WebElement ele : bagsname) {
			System.out.println(ele.getText());
		}
		
		
	}

}  

