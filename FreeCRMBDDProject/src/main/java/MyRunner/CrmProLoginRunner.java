package MyRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions
	(features ="D:\\eclipse-workspace\\FreeCRMBDDProject\\src\\main\\java\\Feature",
	glue = "StepDefination",
	format = { "pretty","html:target/cucumber-reports/cucmber-pretty","jason:target/cucmber-reports/CucmberTestReport.jason",
	"rerun:target/cucmber-reports/cucmber-pretty/return.txt"},
	strict = false,
	monochrome = true,
	dryRun = true,
	plugin = {"json:/target/cucumber-reports/CucumberTestReport.json"}
	)
public class CrmProLoginRunner {
//
//private TestNGCucumberRunner testNGCucumberRunner;
//	
//	@BeforeClass(alwaysRun = true)
//	public void setUpClass() throws Exception{
//		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//		}
//	
//	@Test(groups = "cucumber", description = "Runs Cucumber Feature" , dataProvider = "feature")
//	public void feature(CucumberFeatureWrapper cucumberFeature) {
//		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//	}
//	
//	@DataProvider
//	public Object[][] feature(){
//		return testNGCucumberRunner.provideFeatures();
//			}
//
//	@AfterClass(alwaysRun = true)
//	public void tearDownClass() throws Exception{
//		testNGCucumberRunner.finish();
//	}
	
	private TestNGCucumberRunner testNGCucumberRunner;
	 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }

}
