$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSky.feature");
formatter.feature({
  "line": 2,
  "name": "Verify darksky",
  "description": "",
  "id": "verify-darksky",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 4150290024,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSD.verifyHomePage()"
});
formatter.result({
  "duration": 1309851558,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "verify-darksky;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@temptimeline-1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I entered Fillmore Street, San Francisco, CA in search Box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.iEnteredCityInSearchBox()"
});
formatter.result({
  "duration": 7350047867,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyTimelineFormat()"
});
formatter.result({
  "duration": 1572028244,
  "status": "passed"
});
formatter.after({
  "duration": 133534343,
  "status": "passed"
});
formatter.before({
  "duration": 2263336896,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSD.verifyHomePage()"
});
formatter.result({
  "duration": 1012937185,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "verify-darksky;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@temptimeline-2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I expand todays\u0027 timeline",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I verify lowest and highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSD.expandToday()"
});
formatter.result({
  "duration": 45737432,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSD.verifyTempValues()"
});
formatter.result({
  "duration": 101979144,
  "status": "passed"
});
formatter.after({
  "duration": 103363558,
  "status": "passed"
});
});