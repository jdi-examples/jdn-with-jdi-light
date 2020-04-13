package io.github.jditesting.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.*;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.elements.complex.*;
import com.epam.jdi.light.elements.common.*;
import com.epam.jdi.light.elements.complex.dropdown.*;
import com.epam.jdi.light.elements.complex.table.*;
import com.epam.jdi.light.ui.html.elements.complex.*;
import com.epam.jdi.light.ui.html.elements.common.*;
import io.github.jditesting.entities.*;

public class ContactForm extends Form<Contacts> {
    @UI(".//button[@type='submit']") public Button submit;
    @UI("[name='passport']") public Checkbox passport;
    @UI("[name='accept-conditions']") public Checkbox acceptConditions;
    public TextField name;
    public TextField lastName;
    public TextField position;
    public TextField passportNumber;
    public TextField passportSeria;
    public TextArea description;
    public Dropdown gender;
	
}