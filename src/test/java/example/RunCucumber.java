package example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:src/test/resources")
public class RunCucumber {}
