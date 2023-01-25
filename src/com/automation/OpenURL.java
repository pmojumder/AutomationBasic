package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenURL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Plabani\\eclipse-workspace\\AutomationBasic\\src\\Driver\\chromedriver.exe");
       WebDriver ref =new ChromeDriver();
       //ref.findElement(By.name("username")).sendKeys("Plabani");
       /*ref.get("https://demowebshop.tricentis.com/login");
      // ref.get("file:///C:/Users/Plabani/OneDrive/Documents/sample1.html");
       /*ref.navigate().to("https://www.amazon.in/");
       ref.navigate().back();
       ref.navigate().forward();
       ref.navigate().refresh();*/
       
      ref.manage().window().maximize();
    /* String str=  ref.getCurrentUrl();
     System.out.println(str);
       System.out.println(ref.getTitle());
       System.out.println(ref.getPageSource());
       ref.close();*/
     Thread.sleep(10000);
      /*ref.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
      ref.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
      ref.findElement(By.xpath("//button[@type='submit']")).click();*/
    // ref.findElement(By.xpath("//span[text()='Shopping cart']")).click();
      
       //ref.findElement(By.linkText("Forgot Password?")).click();
     // ref.findElement(By.partialLinkText("Inbox")).click();
       ref.get("file:///C:/Users/Plabani/OneDrive/Documents/prac.html");
     WebElement element=  ref.findElement(By.xpath("//select[@id='slv']"));
     
     Select sel=new Select(element);
     sel.selectByIndex(1);
     sel.selectByValue("k");
     
     List<WebElement> li= sel.getOptions();
  int n=   li.size();
   System.out.println(n);
   for(int i=0;i<n;i++)
   {
	WebElement element1=   li.get(i);
	System.out.println(element1.getText());
   }
	}

}
