package io.github.epam.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.ui.html.complex.*;
import com.epam.jdi.light.ui.html.common.*;

public class Main extends Section {
    @UI("form#contact-form") public ContactForm contactForm;
    @UI(".//button[@type='submit']") public Button calculate;
	
}