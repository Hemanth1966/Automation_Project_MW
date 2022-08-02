package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mobileworld_Contactus {
	@Test()
	public void contact() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemanth.kc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net");
		driver.findElement(By.xpath("(//a[@id='navbarDropdown'])")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("hemanth kc");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("hemanthkcnairnda@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("6362245981");
		driver.findElement(By.name("message")).sendKeys("hello world");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit()
	}
}