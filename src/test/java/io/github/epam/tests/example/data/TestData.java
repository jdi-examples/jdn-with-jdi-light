package io.github.epam.tests.example.data;

import io.github.epam.entities.Contacts;
import io.github.epam.entities.Logins;

public class TestData {
    public static Logins DEFAULT_USER = new Logins().set(u -> {
        u.name = "epam";
        u.password = "1234";
    } );

    public static Contacts DEFAULT_CONTACTS = new Contacts().set(c -> {
        c.passport = "true";
        c.acceptConditions = null;
        c.name = "Roman";
        c.lastName = "Iovlev";
        c.position = "QA Automation";
        c.passportNumber = "4321";
        c.passportSeria = "123456";
        c.description = "JDI awesome";
    } );
}
