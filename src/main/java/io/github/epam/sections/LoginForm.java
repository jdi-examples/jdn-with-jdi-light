package io.github.epam.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.ui.html.complex.*;
import com.epam.jdi.light.ui.html.common.*;
import io.github.epam.entities.*;

public class LoginForm extends Form<Logins> {
    @UI(".//button[@type='submit']") public Button enter;
    @UI("input[type=text]") public TextField name;
    @UI("input[type=password]") public TextField password;
	
}