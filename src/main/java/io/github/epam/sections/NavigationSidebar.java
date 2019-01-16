package io.github.epam.sections;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.ui.html.complex.*;
import com.epam.jdi.light.ui.html.common.*;

public class NavigationSidebar extends Section {
    @UI(".//*[@ui='label' and contains(.,'Home')]") public Title home;
    @UI(".//*[@ui='label' and contains(.,'Contact form')]") public Title contactForm;
    @UI(".//*[@ui='label' and contains(.,'Service')]") public Title service;
    @UI(".//*[@ui='label' and contains(.,'Support')]") public Title support;
    @UI(".//*[@ui='label' and contains(.,'Dates')]") public Title dates;
    @UI(".//*[@ui='label' and contains(.,'Complex Table')]") public Title complexTable;
    @UI(".//*[@ui='label' and contains(.,'Simple Table')]") public Title simpleTable;
    @UI(".//*[@ui='label' and contains(.,'User Table')]") public Title userTable;
    @UI(".//*[@ui='label' and contains(.,'Table with pages')]") public Title tableWithPages;
    @UI(".//*[@ui='label' and contains(.,'Different elements')]") public Title differentElements;
    @UI(".//*[@ui='label' and contains(.,'Performance')]") public Title performance;
    @UI(".//*[@ui='label' and contains(.,'Metals & Colors')]") public Title metalsColors;
    @UI(".//*[@ui='label' and contains(.,'HTML 5')]") public Title hTML5;
    @UI(".//*[@ui='label' and contains(.,'Bootstrap')]") public Title bootstrap;
	
}