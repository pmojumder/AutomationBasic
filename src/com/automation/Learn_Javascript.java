package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learn_Javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Plabani\\eclipse-workspace\\AutomationBasic\\src\\Driver\\chromedriver.exe");
	       WebDriver ref =new ChromeDriver();
	       ref.get("https://www.amazon.in/");
	       System.out.println(ref.getTitle());
	       
	       WebDriverWait wait=new WebDriverWait(ref, 10);
	       try
	       {
	       wait.until(ExpectedConditions.titleContains("Online Shopping site in India"));
	       
	       System.out.println("Amazon page loaded");
	       }
	       catch(Exception E)
	       {
	    	   System.out.println("Not Loaded");
	       }
	       
	       
	    /*   ref.get("https://demo.guru99.com/test/drag_drop.html");
	       ref.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     //  ref.get("https://nxtgenaiacademy.com/alertandpopup/");
	      // ref.findElement(By.xpath("//button[text()='Click Me!']")).click();
	      /* JavascriptExecutor j=(JavascriptExecutor)ref;
	       String Scrolldown="window.scrollBy(0,1000)";
	       j.executeScript(Scrolldown);
	       Thread.sleep(10000);
	       String ScrollUP="window.scrollBy(0,-1000)";
	       j.executeScript(ScrollUP);
	       Thread.sleep(10000);
	   // String str= "document.getElementById('n').value='Plabani'";
	  // j.executeScript(str);*/
	 //  Alert a=ref.switchTo().alert();//Switch to the alert
	 //System.out.println(a.getText());
	 //a.accept();
	       
	   //    Actions act=new Actions(ref);
	 // WebElement element=ref.findElement(By.xpath("(//a[@class='menu-link'])[3]"));
	//  act.moveToElement(element).perform();
	       
	    // act.doubleClick(element).perform();
	    // Actions act=new Actions(ref);
	     /*WebElement element=ref.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

	     act.doubleClick(element).perform();
	     Alert a=ref.switchTo().alert();
	     Thread.sleep(3000);
	     System.out.println(a.getText());
	     a.accept();*/
/*	     
WebElement src=ref.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement target=ref.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

act.dragAndDrop(src, target).perform();
*/
	}

}
