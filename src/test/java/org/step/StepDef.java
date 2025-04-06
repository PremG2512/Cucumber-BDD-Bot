package org.step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;

public class StepDef {

	@When("User launch the facebook application")
	public void user_launch_the_facebook_application() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("prem@gmail.com");
		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();
		
	}

	@When("User launch the amazon application")
	public void user_launch_the_amazon_application() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();

		
	}

}
