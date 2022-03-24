package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailset {

	public static void main(String[] args) throws InterruptedException {
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
	    driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();
	    driver.findElement(By.id("buttonFromTo")).click();
	    Thread.sleep(1000);
	    
	  //store the train name in list
	    
	    List<String> name=new ArrayList<String>();
	    List<WebElement> Trainname = driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']/tbody/tr/td[2]"));
	    for (WebElement Train :Trainname) {
		   
		   String text1 = Train.getText();
		   System.out.println(text1);
		   name.add(text1);
		 }
	
         System.out.println(name);
        int size1 = name.size();
        System.out.println(size1);
        
        //convert list into new set
        Set<String> Trainnameset=new HashSet<String>();
        int size2 = Trainnameset.size();
        System.out.println(size2);
	
	}

}
