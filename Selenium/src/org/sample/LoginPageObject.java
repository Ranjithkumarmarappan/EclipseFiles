package org.sample;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
	WebDriver driver;
	@Test
	public void username() {
		driver.findElement(By.id("username"));
	}
	public void password() {
		driver.finddElement(By.id("password"));
	}
	public void submit() {
		driver.findElement(By.id("submit"));
	}

}
