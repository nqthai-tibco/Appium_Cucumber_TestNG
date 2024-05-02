Feature: Test Search on app and on web
  @SearchOnApp
  Scenario: Search on Apps
    Given I start app Courses on devices "emulator-5556"

    And I search courser name "IBM Full Stack Software Developer"

    Then I verify  courser full name "IBM Full Stack Software Developer Professional Certificate"

  @SearchOnWeb
  Scenario: Search on Webs
      Given  I connect to vnexpress by chrome on devices "emulator-5554"

