package vicroad_solution.vicroad_solution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Features"},
glue={"helpers","vicroad_solution.vicroad_solution"},
monochrome=true,
plugin= {"pretty","html:target/HTMLReports.html"}
)
public class runner 
{
	
    public static void main(String[] args )
    {
    	
	}
}
    

