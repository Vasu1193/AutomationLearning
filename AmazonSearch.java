package Amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearch {
	WebDriver driver;
	public AmazonSearch(WebDriver driver) {
		this.driver=driver;
	}
	public void search() {
		WebElement searchbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchbox.clear();
		searchbox.sendKeys("AC");
		WebElement clicksearch = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		clicksearch.click();
	}
}
