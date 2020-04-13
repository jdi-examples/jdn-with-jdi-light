package io.github.jditesting;
	
import com.epam.jdi.light.elements.pageobjects.annotations.*;
import io.github.jditesting.pages.*;

@JSite("https://jdi-testing.github.io")
public class JdiTestingGithubSite {
    @Url("/jdi-light/index.html") @Title("Home Page") 
    public static HomePage homePage;
    @Url("/jdi-light/contacts.html") @Title("Contact Form") 
    public static ContactFormPage contactFormPage;
    @Url("/jdi-light/metals-colors.html") @Title("Metal and Colors") 
    public static MetalAndColorsPage metalAndColorsPage;
 	
}