package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		//1.define Des Cap:
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		//2.Chrome Options definition:
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://192.168.137.1:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		

	}

}
