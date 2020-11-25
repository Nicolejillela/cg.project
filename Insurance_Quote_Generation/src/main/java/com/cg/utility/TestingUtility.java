package com.cg.utility;

 

import org.junit.Before;
import org.junit.Test;

 

import net.sourceforge.jwebunit.util.TestingEngineRegistry;

 

import static net.sourceforge.jwebunit.junit.JWebUnit.assertLinkPresent;
import static net.sourceforge.jwebunit.junit.JWebUnit.assertTitleEquals;
import static net.sourceforge.jwebunit.junit.JWebUnit.beginAt;
import static net.sourceforge.jwebunit.junit.JWebUnit.clickLink;
import static net.sourceforge.jwebunit.junit.JWebUnit.setBaseUrl;
import static net.sourceforge.jwebunit.junit.JWebUnit.setTestingEngineKey;

 

public class TestingUtility {
    @Before
    public void prepare() {
        setTestingEngineKey(TestingEngineRegistry.TESTING_ENGINE_HTMLUNIT); 
        setBaseUrl("http://localhost:8090/InsuranceQuoteProject");
    }
 
    @Test
    public void testLoginPage() {
        beginAt("login.html"); 
        assertTitleEquals("Login");
        //assertLinkPresent("home");
        //clickLink("home");
        //assertTitleEquals("Home");
    }
     
   /* @Test
    public void testHomePage() {
        beginAt("home.jsp"); 
        assertTitleEquals("Home");
        assertLinkPresent("login");
        clickLink("login");
        assertTitleEquals("Login");
    }*/
}