package org.exampl.pageobjects;

import org.exampl.drivers.DriversFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.fail;

public class HomePage extends DriversFactory {
    @FindBy(css = "a[aria-label=\"Make a Booking\"]")
    WebElement makeBooking;

    public void book() {
        makeBooking.click();
    }

    //    @FindBy(css = "input[data-gtm-eventlabel=\"Return\"]")
//    WebElement returnButton;
//
//    public void clickReturn() {
//        returnButton.click();
//    }
    @FindBy(css = "div[data-gtm-eventlabel=\"One way\"]")
    WebElement oneWay;

    public void clickOneWay() {
        oneWay.click();
    }

    @FindBy(css = "#airport-origin")
    WebElement destination;

    public void enterCity(String city) {
//        destination.click();
        destination.sendKeys(city);
        destination.sendKeys(Keys.ENTER);

    }
    @FindBy(css="#airport-destination")
    WebElement arriving;
    public void enterCurrent(String city1) {
//        arriving.click();
        arriving.sendKeys(city1);
        arriving.sendKeys(Keys.ENTER);
    }

    @FindBy(css = "div[class=\"booking-date-selected align-left\"]")
    WebElement selectCalander;

    public void calander() {
        selectCalander.click();
    }

    @FindBy(css = "select[class=\"lightpick__select lightpick__select-months\"]")
    WebElement selectMonth;

    public void month1(String month) {
        Select sel = new Select(selectMonth);
        sel.selectByVisibleText(month);
    }

    @FindBy(css = "div[class=\"lightpick__day is-available\"]")
    List<WebElement> calendardates;

    public void selectDate(String date) {
        if (calendardates.size() == 0) {
            fail("No price ranges found");
        }
        for (WebElement dates : calendardates) {
            String availableDates = dates.getText();
            if (availableDates.contains(date)) {
                dates.click();
                break;
            }
        }
    }
}




