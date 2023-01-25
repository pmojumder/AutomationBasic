package com.automation.practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenURL1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Plabani\\eclipse-workspace\\AutomationBasic\\src\\Driver\\driver1\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.get("https://nxtgenaiacademy.com/alertandpopup/");
//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
System.out.println(driver.getTitle());
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath("//button[contains(text(),'Confirm Alert Box')]")).click();
Alert a=driver.switchTo().alert();
System.out.println(a.getText());
a.accept();

//Actions act=new Actions(driver);

/*WebElement src_element=driver.findElement(By.xpath("//div[text()='Drag me']"));
WebElement target_element=driver.findElement(By.xpath("//p[text()='Drop here']"));
act.dragAndDrop(src_element, target_element).perform();
/*WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
act.contextClick(element).perform();
//double click
/*WebElement element=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
act.doubleClick(element).perform();




//Move to Element
/*WebElement element=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));

act.moveToElement(element).perform();*/








/*WebElement dropdown=driver.findElement(By.xpath("//select[@id='slv']"));

Select sel=new Select(dropdown);
sel.selectByIndex(2);
Thread.sleep(5000);
sel.selectByValue("j");

Thread.sleep(5000);
sel.deselectAll();


//Explicit wait we need webdriverwait class

/*WebDriverWait wait=new WebDriverWait(driver, 10);

try
{
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Login']"))));
	wait.until(ExpectedConditions.textToBe(By.xpath("//h1[text()='Find your dream job now']"),"Find your dream job now"));
			
	System.out.println("String Present");
}
catch(Exception E)
{
	System.out.println("String not present");

}
/*driver.findElement(By.xpath("//a[@title='Jobseeker Register']")).click();
driver.findElement(By.xpath("//a[text()='Login']")).click();
driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("Plabani");



TakesScreenshot t=(TakesScreenshot)driver;
File src=t.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Plabani\\OneDrive\\Desktop\\HTML\\CG1.png");
FileUtils.copyFile(src, dest);

*/


/*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
String str=driver.getTitle();
System.out.println(str);
System.out.println(driver.getCurrentUrl());
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='PIM']")).click();*/
//driver.get("https://www.selenium.dev/downloads/");
//driver.findElement(By.xpath("(//a[text()='API Docs'])[5]")).click();
	}

}
