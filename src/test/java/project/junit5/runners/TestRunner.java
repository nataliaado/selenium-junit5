package project.junit5.runners;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Facebook and Google test suite")
@SelectPackages({"project.junit5.tests.facebook", "project.junit5.tests.google"})
//@ExcludePackages("project.junit5.tests.facebook")
public class TestRunner {

}
