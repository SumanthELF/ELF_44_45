package functional;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_Test {

	@Test
	public void runrun() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
}
