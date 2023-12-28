package functional;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_Test {

	@Test
	public static void maain() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
}
