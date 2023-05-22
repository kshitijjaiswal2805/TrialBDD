package Pages;

import org.openqa.selenium.By;

import BindingsAndhooks.Hooks;

public class Page1 {
	
	
	public static  void SearchText() throws InterruptedException
	{
		Hooks.driver.get("https://www.google.com");
		Hooks.driver.findElement(By.id("APjFqb")).sendKeys("dsfgj");
		Thread.sleep(10000);
	}

}
