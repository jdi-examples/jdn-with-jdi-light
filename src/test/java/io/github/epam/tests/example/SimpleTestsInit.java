package io.github.epam.tests.example;

import io.github.epam.EpamGithubSite;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.*;
import static com.epam.jdi.light.ui.html.PageFactory.initElements;


public class SimpleTestsInit {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        logger.setLogLevel(STEP);
        initElements(EpamGithubSite.class);
        logger.info("Run Tests");
    }
}
