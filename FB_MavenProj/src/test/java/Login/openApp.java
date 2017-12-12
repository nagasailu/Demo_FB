package Login;

import java.util.logging.Logger;

//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.log4testng.Logger;


// Includes reporting using Logger class uses log4j files

public class openApp {

	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		Logger log= Logger.getLogger("devpinoyLogger");
		
				
		
		driver.get("https://www.facebook.com");
		
		log.config("FB is open");
		
		System.out.println(driver.getTitle());
	
}
}
