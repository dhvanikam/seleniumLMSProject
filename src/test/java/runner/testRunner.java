package runner;

	import org.testng.annotations.DataProvider;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

public class testRunner {
	@CucumberOptions(plugin = { "pretty" }, // reporting purpose
			monochrome = false, // console output
			//tags = "@TS_001_TC_001", // tags from feature file
			features = { "src/test/resources/feature" }, // location of feature files
			glue = {"stepDefinition"}) // location of step definition files

	public class TestRunner extends AbstractTestNGCucumberTests {

		@DataProvider(parallel = false)
		public Object[][] scenarios() {

			return super.scenarios();
		}

	}
}
