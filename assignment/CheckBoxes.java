package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//click on the basic checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//click on the notification checkbox
	    WebElement e = driver.findElement(By.xpath("//span[text()='Ajax']"));
	    e.click();
	    System.out.println(e.getText());
	    //click on the fav languague
	    driver.findElement(By.xpath("//label[text()='Java']")).click();
	    
	    //click on the tri-state
	    driver.findElement(By.xpath
	    		("(//div[@class='col-12'])[4]")).click();
	    
	    
	    
	    
	    
	    
	   
		
		
	}

}
