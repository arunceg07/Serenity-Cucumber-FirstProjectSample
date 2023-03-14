###########################################################################################################################################################
#
@RegressionAPITest
Feature: Home Function-Testing TestLeaf Website Features
  AS a TestLeaf User
  I WANT TO Test the API Regres.in
  #
###########################################################################################################################################################

  @TLTextBox-101
  Scenario: S1- Test Leaf Text Box
    #Testing Non BDD style API Method
    Given User launch the API and verifies the GET method
    #Testing BDD style API Method
    Given User launch the API and verifies the BDD GET method
