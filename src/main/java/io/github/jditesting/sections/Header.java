package io.github.jditesting.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.*;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.elements.complex.*;
import com.epam.jdi.light.elements.common.*;
import com.epam.jdi.light.elements.complex.dropdown.*;
import com.epam.jdi.light.elements.complex.table.*;
import com.epam.jdi.light.ui.html.elements.complex.*;
import com.epam.jdi.light.ui.html.elements.common.*;

public class Header extends Section {
    @UI("form") public LoginForm loginForm;
    @UI(".//button[@type='submit']") public Button logout;
    public Image epamLogo;
    public Image userIcon;
    public TextField textField927323;
	
}