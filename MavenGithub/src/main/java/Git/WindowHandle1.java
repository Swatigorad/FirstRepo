package Git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();  	
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 String WindowId=driver.getWindowHandle();
		 
		 System.out.println(WindowId);
		 
		 driver.quit();
		 
		 


	}

}
