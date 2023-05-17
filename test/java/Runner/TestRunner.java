package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


features = "C:\\Users\\ptpat\\IdeaProjects\\SimpleBDDFramework\\src\\test\\resources\\feature",
 //features = "C:\\Users\\ptpat\\IdeaProjects\\SimpleBDDFramework\\src\\test\\resources\\feature\\B_login.feature",
glue = {"StepDefinitions"}


)



public class TestRunner {

}
