package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//select the browser
		WebElement radioButton = driver.findElement(By.xpath("(//label[text()='Safari'])[1]"));
		radioButton.click();
		if(radioButton.isSelected()) {
			System.out.println("button is selected");
		}else {
			System.out.println("button is unselected");
		}
		radioButton.click();
		
	}
		
	

}
