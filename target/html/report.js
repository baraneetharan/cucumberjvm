$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bingsearch.feature");
formatter.feature({
  "line": 1,
  "name": "When I go to the Google search page, and search for an item,",
  "description": "I expect to see some reference to that item in the result summary.\u0027",
  "id": "when-i-go-to-the-google-search-page,-and-search-for-an-item,",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "when-i-go-to-the-google-search-page,-and-search-for-an-item,;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "that I have gone to the Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I add \"cats\" to the search box",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click the Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "\"cats\" should be mentioned in the results",
  "keyword": "Then "
});
formatter.match({
  "location": "search.that_i_have_gone_to_the_google_page()"
});
formatter.result({
  "duration": 62673697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cats",
      "offset": 7
    }
  ],
  "location": "search.i_add_something_to_the_search_box(String)"
});
formatter.result({
  "duration": 1487649,
  "status": "passed"
});
formatter.match({
  "location": "search.click_the_search_button()"
});
formatter.result({
  "duration": 42195,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cats",
      "offset": 1
    }
  ],
  "location": "search.something_should_be_mentioned_in_the_results(String)"
});
formatter.result({
  "duration": 84674,
  "status": "passed"
});
});