$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "from flight menu insert some values",
  "description": "",
  "id": "from-flight-menu-insert-some-values",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "click on flight menu and insert options to search",
  "description": "",
  "id": "from-flight-menu-insert-some-values;click-on-flight-menu-and-insert-options-to-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@done3"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of page find flight",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on oneway",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on businessclass",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_on_home_page()"
});
formatter.result({
  "duration": 19246034472,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_page_find_flight()"
});
formatter.result({
  "duration": 326694386,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.click_on_oneway()"
});
formatter.result({
  "duration": 431066262,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.click_on_businessclass()"
});
formatter.result({
  "duration": 341950340,
  "status": "passed"
});
});