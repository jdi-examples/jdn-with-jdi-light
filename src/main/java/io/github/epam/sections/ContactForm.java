package io.github.epam.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.ui.html.complex.*;
import com.epam.jdi.light.ui.html.common.*;
import io.github.epam.entities.*;

public class ContactForm extends Form<Contacts> {
    @UI(".//button[@type='submit']") public Button submit;
    @UI("input[type=checkbox][name='passport']") public Checkbox passport;
    @UI("input[type=checkbox][name='accept-conditions']") public Checkbox acceptConditions;
    @UI("input[type=text]#name") public TextField name;
    @UI("input[type=text]#last-name") public TextField lastName;
    @UI("input[type=text]#position") public TextField position;
    @UI("input[type=text]#passport-number") public TextField passportNumber;
    @UI("input[type=text]#passport-seria") public TextField passportSeria;
    @UI("textarea") public TextArea description;
	
}