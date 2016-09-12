package br.com.zaraz.apptestesb;


import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@SpringApplicationConfiguration(classes = AppCucumberSeleniumApplication.class)
@WebAppConfiguration
@CucumberOptions (features = "classpath:features", glue={"br.com.zaraz.apptestesb","com.cdi.igs.adapter.cucumber", "cucumber.api.spring"}, plugin = {"pretty", "html:target/test-report"})
public class AppCucumberSeleniumApplicationTests {
}
