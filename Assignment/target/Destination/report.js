$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Create.feature");
formatter.feature({
  "line": 1,
  "name": "Application is able to add and cancel  in computer database",
  "description": "",
  "id": "application-is-able-to-add-and-cancel--in-computer-database",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6118950198,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User is able to add new computer in computer database",
  "description": "",
  "id": "application-is-able-to-add-and-cancel--in-computer-database;user-is-able-to-add-new-computer-in-computer-database",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is able to launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on add button and fill computer details and click create button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Computer is added in database",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerTest.user_is_able_to_launch_the_application()"
});
formatter.result({
  "duration": 291014127,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.user_click_on_add_button_and_fill_computer_details_and_click_create_button()"
});
formatter.result({
  "duration": 1382324240,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.computer_is_added_in_database()"
});
formatter.result({
  "duration": 705035685,
  "status": "passed"
});
formatter.after({
  "duration": 86532484,
  "status": "passed"
});
formatter.before({
  "duration": 4036775965,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User is able to click cancel button and computer is not created",
  "description": "",
  "id": "application-is-able-to-add-and-cancel--in-computer-database;user-is-able-to-click-cancel-button-and-computer-is-not-created",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User is able to launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User click on add button and fill computer details and click cancel button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Computer is not added in database",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerTest.user_is_able_to_launch_the_application()"
});
formatter.result({
  "duration": 98630,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.user_click_on_add_button_and_fill_computer_details_and_click_cancel_button()"
});
formatter.result({
  "duration": 1284585687,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.computer_is_not_added_in_database()"
});
formatter.result({
  "duration": 533255917,
  "status": "passed"
});
formatter.after({
  "duration": 77571400,
  "status": "passed"
});
formatter.uri("Delete.feature");
formatter.feature({
  "line": 1,
  "name": "Computers data can be deleted.",
  "description": "",
  "id": "computers-data-can-be-deleted.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2780581904,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Delete the computer from computer database list",
  "description": "",
  "id": "computers-data-can-be-deleted.;delete-the-computer-from-computer-database-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Computer is present in computer database list",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on delete button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User get deleted from computer list",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerTest.computer_is_present_in_computer_database_list()"
});
formatter.result({
  "duration": 1280085303,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.user_click_on_delete_button()"
});
formatter.result({
  "duration": 1091635005,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.user_get_deleted_from_computer_list()"
});
formatter.result({
  "duration": 401764571,
  "status": "passed"
});
formatter.after({
  "duration": 79668400,
  "status": "passed"
});
formatter.uri("Edit.feature");
formatter.feature({
  "line": 1,
  "name": "User is able to edit the details of Computer in computer database",
  "description": "",
  "id": "user-is-able-to-edit-the-details-of-computer-in-computer-database",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2845777523,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User is able to edit details of Computer",
  "description": "",
  "id": "user-is-able-to-edit-the-details-of-computer-in-computer-database;user-is-able-to-edit-details-of-computer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Computer is present in computer database",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User edit the details of computer",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "New details should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerTest.computer_is_present_in_computer_database()"
});
formatter.result({
  "duration": 1218353415,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.user_edit_the_details_of_computer()"
});
formatter.result({
  "duration": 1631099033,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.new_details_should_be_added()"
});
formatter.result({
  "duration": 813141153,
  "status": "passed"
});
formatter.after({
  "duration": 91826655,
  "status": "passed"
});
formatter.uri("Read.feature");
formatter.feature({
  "line": 1,
  "name": "User is able to view data by click on computer in computer database.",
  "description": "",
  "id": "user-is-able-to-view-data-by-click-on-computer-in-computer-database.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3235795240,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User able to view details of computer",
  "description": "",
  "id": "user-is-able-to-view-data-by-click-on-computer-in-computer-database.;user-able-to-view-details-of-computer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Computer is in database",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on computer in computer database list",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is able to see the details of computer",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerTest.computer_is_in_database()"
});
formatter.result({
  "duration": 1260984097,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.user_click_on_computer_in_computer_database_list()"
});
formatter.result({
  "duration": 1149653944,
  "status": "passed"
});
formatter.match({
  "location": "ComputerTest.user_is_able_to_see_the_details_of_computer()"
});
formatter.result({
  "duration": 230901543,
  "status": "passed"
});
formatter.after({
  "duration": 82996758,
  "status": "passed"
});
});