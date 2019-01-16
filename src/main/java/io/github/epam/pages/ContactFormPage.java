package io.github.epam.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.ui.html.complex.*;
import com.epam.jdi.light.ui.html.common.*;
import io.github.epam.sections.*;

public class ContactFormPage extends WebPage {
    @UI("header") public Header header;
    @UI("footer") public Footer footer;
    @UI(".uui-side-bar[name='navigation-sidebar']") public NavigationSidebar navigationSidebar;
    @UI(".uui-side-bar[name='log-sidebar']") public LogSidebar logSidebar;
    @UI(".main-form") public Main main;
	
}