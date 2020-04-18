package org.exampl.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.exampl.pageobjects.HomePage;


public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() {
    }

    @When("^I click on make booking$")
    public void i_click_on_make_booking() {
        homePage.book();
//        homePage.clickReturn();
    }

    @Then("^I click on one way booking button$")
    public void i_click_on_one_way_booking_button() {
        homePage.clickOneWay();
    }


    @Then("^I entered city name \"([^\"]*)\"$")
    public void i_entered_city_name(String arg1) {

        homePage.enterCity(arg1);
        homePage.calander();
    }
    @Then("^I entered city arival name \"([^\"]*)\"$")
    public void i_entered_city_arival_name(String arg1) {
        homePage.enterCurrent(arg1);
    }

    @Then("^I click on month option \"([^\"]*)\"$")
    public void i_click_on_month_option(String arg1) {
        homePage.month1(arg1);
    }
    @Then("^I select the date \"([^\"]*)\"$")
    public void i_select_the_date(String arg1){
        homePage.selectDate(arg1);
    }


}








