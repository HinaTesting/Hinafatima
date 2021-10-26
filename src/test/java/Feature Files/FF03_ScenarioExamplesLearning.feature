Feature: Registration Screen
 # @SmokeTest
  Scenario Outline: Create multiple accounts for registration
    Given Navigate to registration screen on HN website
    Then customer enter firstname as "<FirstName>"
    Then customer enter lastname as "<LastName>"
    Then customer enter email_address as "<EmailAdd>"
    Then customer enter password as "<password>"
    Then customer enter confirmation as "<Repassword>"



    Examples:
      |FirstName|LastName|EmailAdd|password|Repassword|
      |FirstName01|LastName01|EmailAdd01|password01|Repassword01|
      |FirstName02|LastName02|EmailAdd02|password02|Repassword02|
      |FirstName03|LastName03|EmailAdd03|password03|Repassword03|
      |FirstName04|LastName04|EmailAdd04|password04|Repassword04|

