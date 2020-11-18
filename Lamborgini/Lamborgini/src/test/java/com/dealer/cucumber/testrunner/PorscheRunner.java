package com.dealer.cucumber.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/features/lambo.feature"},
        glue = {"com.dealer.cucumber.steps_definitions"},
        tags = {"@car"},
        dryRun = false
)




public class PorscheRunner {

}
