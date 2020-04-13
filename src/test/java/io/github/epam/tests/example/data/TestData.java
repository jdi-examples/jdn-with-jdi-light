package io.github.epam.tests.example.data;

import io.github.jditesting.entities.Contacts;
import io.github.jditesting.entities.Logins;

public class TestData {
    public static Logins DEFAULT_USER = new Logins().set(u -> {
        u.name = "Roman";
        u.password = "Jdi1234";
    } );

    public static Contacts DEFAULT_CONTACTS = new Contacts().set(c -> {
        c.gender = "Male";
        //c.religion = "Other";
        //c.weather = "Sun, Snow";
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
