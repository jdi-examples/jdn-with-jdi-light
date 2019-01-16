package io.github.epam.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.ui.html.complex.*;
import com.epam.jdi.light.ui.html.common.*;

public class Header extends Section {
    @UI("form") public LoginForm loginForm;
    @UI(".//button[@type='submit']") public Button logout;
    @UI("img#epam_logo") public Image epamLogo;
    @UI("img#user-icon") public Image userIcon;
    @UI(".//*[@ui='label']") public Title piterChailovskii;
    @UI("input[type=text]") public TextField textField71610;
	
}