package runner;

	import org.testng.annotations.DataProvider;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(plugin = { "pretty", "html:target/lms.html" }, // reporting purpose
			monochrome = false, // console output
			tags = "@admin or @logout",// tags from feature file
			features = { "src/test/resources/feature"}, // location of feature files
			glue = {"stepDefinition"}) // location of step definition files

	public class runner_Admin extends AbstractTestNGCucumberTests {

		@DataProvider(parallel = false)
		public Object[][] scenarios() {

			return super.scenarios();
		}
}
