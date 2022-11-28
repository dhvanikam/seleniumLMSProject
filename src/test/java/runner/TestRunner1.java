package runner;



	import org.testng.annotations.DataProvider;

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(plugin = { "pretty", "html:target/lms.html" }, // reporting purpose
			monochrome = false, // console output
			tags = " @user",// tags from feature file
			features = { "src/test/resources/feature/Registration.feature","src/test/resources/feature/Attendance.feature",}, // location of feature files
			glue = {"stepDefinition"}) // location of step definition files

	public class TestRunner1 extends AbstractTestNGCucumberTests {

		@DataProvider(parallel = false)
		public Object[][] scenarios() {

			return super.scenarios();
		}
	}


