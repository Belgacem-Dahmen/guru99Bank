package guru99Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr438072");
		driver.findElement(By.name("password")).sendKeys("tUqUgUz");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
		

}
}
