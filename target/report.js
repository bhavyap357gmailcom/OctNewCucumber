$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/Adactin.feature");
formatter.feature({
  "name": "Book the hotel using Adactic hotel application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@page1"
    }
  ]
});
formatter.scenario({
  "name": "To login using valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@page1"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinLoginPage1.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To send the valaid user name",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinLoginPage1.to_send_the_valaid_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To send the valaid password",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.to_send_the_valaid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the adactic login button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.to_click_the_adactic_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To search the location and select rooms for hotel booking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@page1"
    },
    {
      "name": "@page2"
    }
  ]
});
formatter.step({
  "name": "Select location",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinLoginPage1.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select rooms",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.select_rooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the adactic search button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.to_click_the_adactic_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Select the hotel and continue",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@page1"
    },
    {
      "name": "@page3"
    }
  ]
});
formatter.step({
  "name": "Select the hotel using radio button",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinLoginPage1.select_the_hotel_using_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.to_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Fill the form detail to book the hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@page1"
    },
    {
      "name": "@page4"
    }
  ]
});
formatter.step({
  "name": "Enter first name",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinLoginPage1.enter_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter last name",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.enter_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter billing address",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.enter_billing_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter credit card number",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.enter_credit_card_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select credit card type",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.select_credit_card_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select expiry month",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.select_expiry_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select expiry year",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.select_expiry_year()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Cvv number",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.enter_Cvv_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinLoginPage1.to_click_the_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "View the booking deatil",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@page1"
    },
    {
      "name": "@page5"
    }
  ]
});
formatter.step({
  "name": "Click My itinerary",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinLoginPage1.click_My_itinerary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To print  search information in console",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinLoginPage1.to_print_search_information_in_console()"
});
formatter.result({
  "status": "passed"
});
});