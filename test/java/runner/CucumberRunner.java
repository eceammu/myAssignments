package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features={"src/test/java/feature"},
glue={"steps","hooks"},
monochrome=true,
publish=true
//,tags="@smoke"
)
//public class CucumberRunner extends AbstractTestNGCucumberTests
public class CucumberRunner extends BaseClass
{

}
