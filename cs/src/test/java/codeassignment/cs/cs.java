package codeassignment.cs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cs {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		driver.get("https://www.imdb.com/title/tt9389998/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.linkText("December 17, 2021 (United States)"));
		js.executeScript("arguments[0].scrollIntoView();",date);
		System.out.println(date);
		WebElement country = driver.findElement(By.linkText("India"));
		System.out.println(country);
		Thread.sleep(3000);
		
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		WebElement date1 = driver.findElement(By.xpath("//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/td[1]/div[1]/ul[1]/li[1]"));
		js.executeScript("arguments[0].scrollIntoView();",date1);
		System.out.println(date1);
		WebElement country1 = driver.findElement(By.xpath("//td[normalize-space()='India']"));
		System.out.println(country1);
		
		if (date==date1 && country==country1){
			System.out.println("test is passed");}
			else{
				System.out.println("test is failed");
			}
		}
	}


