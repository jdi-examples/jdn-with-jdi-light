package io.github.epam.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.ui.html.complex.*;
import com.epam.jdi.light.ui.html.common.*;
import io.github.epam.sections.*;

public class HomePage extends WebPage {
    @UI("header") public Header header;
    @UI("footer") public Footer footer;
    @UI(".uui-side-bar") public NavigationSidebar navigationSidebar;
    @UI("h3[name='main-title']") public Title mainTitle;
    @UI(".main-txt") public Text jdiText;
	
}