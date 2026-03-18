package FindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateDemo {
	@Test
	void TestNavigate() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Navigation nvn = driver.navigate();
		nvn.to("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement Pagelink = driver.findElement(By.linkText("WebTable"));
		Pagelink.click();

		Thread.sleep(3000);
		nvn.back();

		Thread.sleep(3000);
		nvn.forward();

		Thread.sleep(3000);
		nvn.refresh();

	}

}
