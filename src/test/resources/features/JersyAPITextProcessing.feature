###########################################################################################################################################################
#
@RegressionDBTest
Feature: Home Function-Testing TestLeaf Website Features
  AS a TestLeaf User
  I WANT TO pass Text in REST Webservice (Active MQ)
  #
###########################################################################################################################################################

  @TLTextBoxDB-101
  Scenario: S1- Test Leaf TableDB
    #Testing an DB Test automation
    Then the user drop the Text message through REST API


