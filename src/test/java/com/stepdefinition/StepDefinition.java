package com.stepdefinition;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.POM.PageObjectTarriff;
import com.commonaction.CommonAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends CommonAction{
  PageObjectTarriff pg=new PageObjectTarriff();

	@Given("User clicks add tariff plan")
	public void user_clicks_add_tariff_plan() throws Exception {
	handleFrame();
	click(pg.getAddtariff());
}

	@When("user fills the details")
	public void user_fills_the_details() throws Exception {
	    handleFrame();
	    fill(pg.getRental(),"500");
	    fill(pg.getLocalmin(),"60");
	    fill(pg.getIntermin(),"10");
	    fill(pg.getSmspack(),"30");
	    fill(pg.getMincharge(),"10");
	    fill(pg.getIntercharge(),"50");
	    fill(pg.getSmscharge(),"3");
	    
	}

	@When("user clicks submit")
	public void user_clicks_submit() {
		click(pg.getSubmit());
	    
	}

	@Then("user validates the result")
	public void user_validates_the_result() throws Exception {
		handleFrame();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		String text = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText();
		System.out.println(text);
	    
	}
	
	public void handleFrame() throws Exception {
		Thread.sleep(5000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		
	}


}
