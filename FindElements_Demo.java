package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElements_Demo {
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		List<WebElement> allchecks = driver.findElements(By.id("//input[@type='checkbox']"));

		for (WebElement check : allchecks) {
			if (check.getDomAttribute("value").contains("Cricket")
					|| check.getDomAttribute("value").contains("Hockey")) {
				check.click();
			}
		}
		driver.quit();
	}

}
