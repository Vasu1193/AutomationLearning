package Amazon;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonMultiTabs {
	WebDriver driver;
	public AmazonMultiTabs(WebDriver driver) {
		this.driver=driver;
	}
	public void tabs() throws InterruptedException {
		//WebElement clicksearch = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		//clicksearch.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(5000);
		String oldTab = driver.getWindowHandle();
		WebElement selectproduct = driver.findElement(By.xpath("//span[contains(text(),'Blue Star 1.5 Ton 3 Star Inverter Split AC (Copper, Convertible 4-in-1 Cooling Mode, 2022 Model, IA318FNU, White)')]"));
		selectproduct.click();
		Thread.sleep(5000);
		driver.switchTo().window(oldTab);
		Thread.sleep(5000);
		WebElement selectproduct1 = driver.findElement(By.xpath("//span[contains(text(),'Panasonic 1.5 Ton 3 Star Wi-Fi Twin-Cool Inverter Split Air Conditioner (Copper, Auto Convertible, Shield Blu Anti-Corrosion Technology, 2022 Model, CS/CU-SU18XKYTA, White)')]"));
		selectproduct1.click();
		ArrayList<String> AllTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(oldTab);
		//AllTabs.add(oldTab);
		Thread.sleep(5000);
		//driver.switchTo().window(oldTab);
		driver.switchTo().window(AllTabs.get(1));
		Thread.sleep(5000);
		
//		Thread.sleep(5000);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollBy(0,450)", "");
//		Thread.sleep(5000);
		
//		ArrayList<String> AllTabs = new ArrayList<String> (driver.getWindowHandles()); 
//		System.out.println(AllTabs.size());
//		driver.switchTo().window(AllTabs.get(2));
//		Thread.sleep(5000);
//		driver.close();
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		driver.switchTo().window(oldTab);
	}
}
