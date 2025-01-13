Feature: Cucumber Data Tables implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange |
      | apple  |
      | kiwi   |
      | tomato |
      | pear   |
      | potato |

  #To beautify the pipes above
  #Windows: control + alt + L
  #Mac: command + option + L

  #Create a new scenario where we list the type of pets we love
  #Print out all the strings in the List

  Scenario: List of pet types I love
    Then I will share my favorites
      | Kangal       |
      | Husky        |
      | Doodle       |
      | Munchkin     |
      | Rag-doll cat |
      | Siberian Cat |

    Scenario: Officer reads data about driver
      Then officier is able to see any data he wants
        | name    | Jame      |
        | surname | John      |
        | age     | 29        |
        | address  | somewhere|
        | zipcode | 711906    |

  @dataTable
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |








