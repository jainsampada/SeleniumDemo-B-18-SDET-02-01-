package com.facebook.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Qa.TestBaseDemo.TestBase;

public class SignUpPageTest extends TestBase {
@Test
public void signup()
{
	driver.findElement(By.id("u_0_j")).sendKeys("sam");
}
}
