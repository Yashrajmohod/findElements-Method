package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElementDemoFlipkart {
	WebDriver driver;
	@BeforeMethod
	public void Testcase() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	void toLink() throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/");

//		WebElement btnClick = driver.findElement(By.xpath("body > div.mcO4kT.RFBkxv > div > span"));
//		btnClick.click();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//List<WebElement> allFooterLinks = driver.findElements(By.xpath("//div[@class='x3q9HG']//a"));
		
		
		List<WebElement> allFooterLinks = driver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility']"));
		for (WebElement links : allFooterLinks) {
			System.out.println(links.getText());
			
			if(links.getText().equals("Facebook"));{
				links.click();
			}
		}
	}

}
