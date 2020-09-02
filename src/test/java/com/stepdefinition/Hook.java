package com.stepdefinition;

import com.commonaction.CommonAction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends CommonAction {
	
	@Before
          public void beforeScenario() {
		launch();
	}
	
	@After
	public void afterScenario(){
		driver.quit();
	}

}
