package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486457318205&hvpos=&hvnetw=g&hvrand=5033153987334375188&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300465&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=EAIaIQobChMIqrbBk7rr-gIVVZNmAh1IOQPYEAAYASAAEgIt7_D_BwE");
	Thread.sleep(5000);
	driver.manage().window().maximize();
//	AmazonRegister register = new AmazonRegister(driver);
//	register.navigatetourl();
//	register.registration("ManojVasudev", "Scarlet@9637", "9545468802");
	AmazonLogin login = new AmazonLogin(driver);
	login.login();
	AmazonSearch search = new AmazonSearch(driver);
	search.search();
	AmazonMultiTabs multi = new AmazonMultiTabs(driver);
	multi.tabs();
//	AmazonSignOut logout = new AmazonSignOut(driver);
//	logout.signout();
}
}
