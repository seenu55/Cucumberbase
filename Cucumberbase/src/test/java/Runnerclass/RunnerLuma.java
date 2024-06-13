package Runnerclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Baseclass.BaseclassLuma;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\feaatureLuma\\luma.feature",glue = "Stepdef")

public class RunnerLuma extends BaseclassLuma{
	
	@BeforeClass
	public static void first() {
		BrowserLanuch();
		

	}



}
