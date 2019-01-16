package io.github.epam.tests.example;

import org.testng.annotations.Test;

import static io.github.epam.EpamGithubSite.*;
import static io.github.epam.tests.example.data.TestData.*;

public class SimpleTest extends SimpleTestsInit {

    @Test
    public void loginTest() {
        homePage.open();
        homePage.header.userIcon.click();
        homePage.header.loginForm.loginAs(DEFAULT_USER);
        homePage.checkOpened();
        homePage.navigationSidebar.contactForm.click();
        contactFormPage.checkOpened();
        contactFormPage.main.contactForm.submit(DEFAULT_CONTACTS);
        contactFormPage.main.contactForm.check(DEFAULT_CONTACTS);
    }
}
