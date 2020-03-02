package com.stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Yuvaraj\\workspace\\CucumberFirst\\src\\test\\resources\\FeatureFiles\\Login.feature",
glue="com.stepdef",dryRun=false,monochrome=true,strict=false,plugin={"html:cReport\\webreport"})
public class RunnerClass {

}
