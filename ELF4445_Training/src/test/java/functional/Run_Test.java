package functional;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Run_Test {

	@Test
	public static void meen() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
}
