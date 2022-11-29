package runner;


	import org.testng.annotations.DataProvider;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(plugin = { "pretty", "html:target/lms.html" }, // reporting purpose
			monochrome = false, // console output
			tags = "@staff",// tags from feature file
			features = { "src/test/resources/feature"}, // location of feature files
			glue = {"stepDefinition"}) // location of step definition files

	public class Runner_Staff extends AbstractTestNGCucumberTests {

		@DataProvider(parallel = false)
		public Object[][] scenarios() {

			return super.scenarios();
		}
}
