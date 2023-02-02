package Amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignOut {
	WebDriver driver;
	public AmazonSignOut(WebDriver driver) {
		this.driver=driver;
	}
	public void signout() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement hoveraction = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		action.moveToElement(hoveraction).perform();
		Actions action1 = new Actions(driver);
		WebElement movetosignout = driver.findElement(By.xpath("//a[@id='nav-item-signout']"));
		action1.moveToElement(movetosignout).click().build().perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
