package MyRunner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.*;


@CucumberOptions
(features = "D:\\eclipse-workspace\\FreeCRMBDDProject\\src\\main\\java\\Feature",// path of feature file
glue = {"StepDefination"},// path of the glue 
format = {"pretty","html:target/cucumber-reports/cucumber-pretty", //path of the reports generated
		"json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/return.txt"},
strict = true, // fails the execution if the mapping of feature file and step definitions are missing
dryRun = false, // checks for the correct mapping between step definition and feature file.
monochrome = true, // display the console output in proper readable format.
plugin = "json:/target/cucumber-reports/CucumberTestReport.json" // to generate the reports
//tags={"~@SmokeTest","~@RegressionTest"}
)
public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}
	
	@Test(groups = "cucumber", description = "Runs Cucumber Feature" , dataProvider = "feature")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] feature(){
		return testNGCucumberRunner.provideFeatures();
			}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception{
		testNGCucumberRunner.finish();
	}
}
