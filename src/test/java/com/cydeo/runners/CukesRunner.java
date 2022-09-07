package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.lang.annotation.Retention;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumba.html",
                "rerun:target/failReport.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = true,

        publish = false,
        tags = "@ali and @be"

)
public class CukesRunner {


}
