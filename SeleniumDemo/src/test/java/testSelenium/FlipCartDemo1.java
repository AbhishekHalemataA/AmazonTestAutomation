package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipCartDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).sendKeys("What is Postman");
		//driver.findElement(By.id("inputPassword")).sendKeys("Abhi1234@");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/yt-icon-shape/icon-shape/div")).click();
		

	}

}
