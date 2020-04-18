package org.exampl;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.exampl.drivers.DriversFactory;

public class Hooks {
    DriversFactory driversFactory=new DriversFactory();
@Before
    public void openBrowser(){
    driversFactory.setUp();
    driversFactory.navigate("https://www.flydubai.com/en/");
    driversFactory.manage();
    driversFactory.putWait();
}
//@After
//    public void closeBrowser(){
//    driversFactory.close();
//}
}
