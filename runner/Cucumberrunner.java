package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/feature/loginvani.feature",
                  glue="stepdefinition1") 
                  //monochrome= true,dryRun=true,plugin= {"pretty","html:test-output/test.html"})
public class Cucumberrunner extends AbstractTestNGCucumberTests{
	
	

}


