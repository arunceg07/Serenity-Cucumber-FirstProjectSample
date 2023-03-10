###########################################################################################################################################################
#
@RegressionRSM
Feature: Home Function-Testing RSM Website Features
  AS a RSM Test User
  I WANT TO Test the Home Page, Email Reference Page

  #
###########################################################################################################################################################

  @RSM-101
  Scenario: S1- RSM Login Function
    #Login in to RSM Portal
    Given User logs in to RSM UK Portal
    #User verifies the RSM Home Page Details
    And User verifies the RSM Home Page Details

  @RSM-102
  Scenario: S1- RSM Email Page Function
    #Login in to RSM Portal
    Given User logs in to RSM UK Portal
     #User verifies the RSM Home Page Details
    And User verifies the RSM Home Page Details
     #User verifies the RSM Home Page Details
    And User verifies the RSM email preference page details
         #User verifies the RSM Home Page Details
    And User verifies the print statement
             #User verifies the RSM Home Page Details
    And User verifies the print statement in new stepfile