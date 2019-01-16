package io.github.epam;
	
import com.epam.jdi.light.elements.pageobjects.annotations.*;
import io.github.epam.pages.*;

@JSite("https://epam.github.io")
public class EpamGithubSite {
    @Url("/JDI/index.html") @Title("Home Page") 
    public static HomePage homePage;
    @Url("/JDI/contacts.html") @Title("Contact Form") 
    public static ContactFormPage contactFormPage;
 	
}