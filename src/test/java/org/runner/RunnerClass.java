package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utility.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources",glue="org.stepdefinition",

plugin= {"html:target","junit:JunitF//junitfile.xml","json:JsonF//jsonfile.json"})


public class RunnerClass {

	@AfterClass
	public static void afterClass() {

		JvmReport.generateJvmReport("C:\\Users\\BHAVYA P\\Desktop\\Mini Project Bhavya\\MiniProject\\AdactinMiniProject\\JsonF\\jsonfile.json");
	}
}
