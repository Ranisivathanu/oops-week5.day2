package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailsort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	    
	    WebElement fromstation = driver.findElement(By.id("txtStationFrom"));
	    fromstation.clear();
	    fromstation.sendKeys("MDU",Keys.TAB);
	    
	    WebElement tostation = driver.findElement(By.id("txtStationTo"));
	    tostation.clear();
	    tostation.sendKeys("MS",Keys.TAB);
	
	    WebElement checkbox = driver.findElement(By.id("chkSelectDateOnly"));
	    if(checkbox.isSelected()) {
	    	checkbox.click();
	    }else
	    {
	    	System.out.println("Element is not selected");
	    	
	    }
	    
	//store the trainname in list
	      List<String> Trainname=new ArrayList<String>();
	      List<WebElement> table = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]"));
	for (WebElement column : table) {
		String text = column.getText();
		System.out.println(text);
		Trainname.add(text);
	}	    
      Collections.sort(Trainname);
      System.out.println(Trainname);
      
	}

}
