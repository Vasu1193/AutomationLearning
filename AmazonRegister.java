package Amazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonRegister {
	WebDriver driver;
	String url = "https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58490306106%26hvpone%3D%26hvptwo%3D%26hvadid%3D486457318205%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5033153987334375188%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9300465%26hvtargid%3Dkwd-298187295805%26hydadcr%3D5657_2175734%26gclid%3DEAIaIQobChMIqrbBk7rr-gIVVZNmAh1IOQPYEAAYASAAEgIt7_D_BwE&prevRID=24XH822NEFKZYB1Z98NR&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";
	String last_generated_username = " ";
	String expmessage = " You indicated you are a new customer, but an account already exists with the mobile phone number ";
	public AmazonRegister(WebDriver driver) {
		this.driver=driver;
	}
	public void navigatetourl() {
		if (!driver.getCurrentUrl().equals(this.url)) {
			driver.get(this.url);
		}
	}
	public void registration(String username, String password, String mobile) throws InterruptedException {
		WebElement userName = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		userName.sendKeys(username);
		WebElement number = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		number.sendKeys(mobile);
		WebElement passWord = driver.findElement(By.xpath("//input[@id='ap_password']"));
		passWord.sendKeys(password);
		WebElement proceed = driver.findElement(By.xpath("//input[@id='continue']"));
		proceed.click();
		Thread.sleep(15000);
		WebElement txt = driver.findElement(By.xpath("//span[contains(text(),' You indicated you are a new customer, but an account already exists with the mobile phone number ')]"));
		if(!txt.getText().equals(this.expmessage)) {
			System.out.println("User Already Registered");
			}
		else {
			System.out.println("User Registered");
		}
		} 
	}

