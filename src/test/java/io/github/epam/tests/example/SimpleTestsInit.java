package io.github.epam.tests.example;

import io.github.jditesting.JdiTestingGithubSite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.driver.WebDriverUtils.*;
import static com.epam.jdi.light.elements.init.PageFactory.*;
import static com.epam.jdi.light.logger.LogLevels.*;
import static com.epam.jdi.light.settings.WebSettings.*;


public class SimpleTestsInit {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        logger.setLogLevel(STEP);
        initSite(JdiTestingGithubSite.class);
        logger.info("Run Tests");
    }

    @AfterSuite(alwaysRun = true)
    public static void tearDown() {
        killAllSeleniumDrivers();
    }
}
