package io.github.jditesting.pages;

import com.epam.jdi.light.elements.pageobjects.annotations.locators.*;
import com.epam.jdi.light.elements.composite.*;
import com.epam.jdi.light.elements.complex.*;
import com.epam.jdi.light.elements.common.*;
import com.epam.jdi.light.elements.complex.dropdown.*;
import com.epam.jdi.light.elements.complex.table.*;
import com.epam.jdi.light.ui.html.elements.complex.*;
import com.epam.jdi.light.ui.html.elements.common.*;
import io.github.jditesting.sections.*;

public class MetalAndColorsPage extends WebPage {
    @UI("header") public Header header;
    @UI("footer") public Footer footer;
    @JDropdown(root = "div[ui=combobox]",
		value = "input",
		list = "li",
		expand = ".caret"
	) 
	public Combobox metals;
    @UI(".//button[@type='submit' and contains(.,'Calculate')]") public Button calculate;
    @UI(".//button[@type='submit' and contains(.,'Submit')]") public Button submit;
    @UI(".sidebar-menu") public Menu sidebarMenu;
	
}