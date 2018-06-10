package guru99_sessions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_1 {
	@Test
	public void setup() throws Exception{
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		File f= new File("E:\\New folder\\guru99_tests\\Test.properties");
		FileInputStream fileInput = null;
		fileInput = new FileInputStream(f);
		Properties test = new Properties();
		test.load(fileInput);
			
	
driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(test.getProperty("username"));
driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(test.getProperty("password"));
driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	}	
}
