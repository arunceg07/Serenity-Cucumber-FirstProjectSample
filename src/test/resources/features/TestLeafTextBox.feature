###########################################################################################################################################################
#
@RegressionTestleaf
Feature: Home Function-Testing TestLeaf Website Features
  AS a TestLeaf User
  I WANT TO Test the Home Page and Text Box Function
  #
###########################################################################################################################################################

  @TLTextBox-101
  Scenario: S1- Test Leaf Text Box
    #Login in to Test Leaf Portal
    Given User launch the TestLeaf Portal
   #User verifies the Test Leaf Login Successfull
    And User verifies the HomePage of TestLeaf Portal
     #User verifies navigates to Text Box Page
    And User verifies the TextBox Functions of TestLeaf Portal
       #User verifies navigates to Text Box Page
    Then User verifies the Calendar in the TextBox Page
