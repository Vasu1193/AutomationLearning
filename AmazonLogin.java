package Amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLogin {
	WebDriver driver;
	public AmazonLogin(WebDriver driver) {
		this.driver=driver;
	}
	public void login() throws InterruptedException {
		WebElement accountsandsignin = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		accountsandsignin.click();
		Thread.sleep(5000);
		WebElement username1 = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		username1.clear();
		username1.sendKeys("9545468802");
		Thread.sleep(5000);
		WebElement next = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		next.click();
		WebElement password1 = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		password1.sendKeys("Scarlet@9637");
		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		signin.click();
}
}