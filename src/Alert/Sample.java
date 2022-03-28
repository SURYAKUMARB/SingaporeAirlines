package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {

	String Chromekey="webdriver.chrome.driver";
	String Chromepath="C:\\Users\\User\\eclipse-workspace\\Selenium10mar2022\\Driver\\chromedriver.exe";
	System.setProperty(Chromekey, Chromepath);
	WebDriver driver =new ChromeDriver();
// String url = "https://demo.guru99.com/test/delete_customer.php";
	String url ="http://demo.automationtesting.in/Alerts.html";
	driver.get(url);
	driver.manage().window().maximize();
	
////                                                            1.Confirm alert
	
//	WebElement id = driver.findElement(By.name("cusid"));
//	id.sendKeys("SURYA2908",Keys.ENTER);
//	
//	Thread.sleep(3000);
//	
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
//	
//  get text
//	
//	String txt = alert.getText();
//	System.out.println(txt);
//	
////                                                             2. Simple alert
//	
//	Thread.sleep(3000);
//	
//	Alert alert2 = driver.switchTo().alert();
//  alert.accept();

	
////                                                              3. Prompt alert
	
	
	
	driver.findElement(By.xpath("(//a[contains(@data-toggle,'tab')])[3]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	
	Thread.sleep(3000);
	
	Alert al = driver.switchTo().alert();
	al.sendKeys("SURYAKUMAR");
	
	Thread.sleep(3000);
	
	
	al.accept();
	}
}
