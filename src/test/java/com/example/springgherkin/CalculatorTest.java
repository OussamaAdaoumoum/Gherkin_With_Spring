package com.example.springgherkin;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/*
* specifies that the test suite has to be run with Cucumber runner
* and Cucumber has to identify the feature file under the parent directory
* specified with features options. Cucumber looks for a features folder under
* the directory for the presence of .feature files
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class CalculatorTest {
}
