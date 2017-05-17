package com.ebank.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basicscript {

	
	public static void main(String[] args) 
	{
		//launch firefox
		
		WebDriver driver=new FirefoxDriver();
		
		//to maximize
		
		driver.manage().window().maximize();
		
		//To pass URL
		
		driver.get("http://192.168.1.200/ranford2/home.aspx");
		//username
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath(".//*[@id='Table_01']//tbody//tr[2]//td//table//tbody//tr[2]//td//a//img")).click();
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys("xyzabc");
		driver.findElement(By.id("lst_counrtyU")).click();
		driver.findElement(By.id("lst_counrtyU")).sendKeys("INDIA");
		driver.findElement(By.id("lst_stateI")).click();
		driver.findElement(By.id("lst_stateI")).sendKeys("GOA");
		driver.findElement(By.id("btn_insert")).click();
	}

}
