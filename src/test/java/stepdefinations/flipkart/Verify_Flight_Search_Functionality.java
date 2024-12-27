package stepdefinations.flipkart;

import Utils.WaitUtils;
import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.flipKart.FlightSearchPage;
import pages.flipKart.LandingPage;
import pages.flipKart.SearchPage;

public class Verify_Flight_Search_Functionality extends BaseTest {


    LandingPage landingPage;
    FlightSearchPage  flightSearchPage;
//    SearchPage searchPage;

    @Before
    public void prepareed(){
        setUp();

    }

    @When("I click on Flights bookings")
    public void i_click_on_flights_bookings() {
        this.landingPage=new LandingPage(driver);
        WaitUtils.applyGlobalWait();
        landingPage.clickOnFlightButton();



    }
    @Then("I should be navigated to flight search page")
    public void i_should_be_navigated_to_flight_search_page() {
        WaitUtils.applyGlobalWait();

    }
    @And("I select the departure city {string}")
    public void i_select_the_departure_city(String departure_city) {
        this.flightSearchPage=new FlightSearchPage(driver);
        flightSearchPage.departureCity(departure_city);


    }
    @And("I select the destination city {string}")
    public void i_select_the_destination_city(String destination_city) {
        WaitUtils.applyGlobalWait();
        flightSearchPage.destinationCity(destination_city);

    }
    @And("I select departure date {string}")
    public void i_select_departure_date(String departure_date) {

    }
    @And("I select return date {string}")
    public void i_select_return_date(String return_date) {

    }
    @Then("I click the Search button.")
    public void i_click_the_button(String string) {

    }
    @Then("the system should display available flights matching the departure {string}")
    public void the_system_should_display_available_flights_matching_the_departure(String departure_city) {

    }
    @And("the system should display available flights matching the destination {string}")
    public void the_system_should_display_available_flights_matching_the_destination(String destination_cityg) {

    }




    @After
    public void tear(){
        tearDown();
    }

}
