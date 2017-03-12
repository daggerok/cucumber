Feature: First feature
  Here we can add any description
  In order to current feature motivation...

  Scenario: First scenario
#cucumber-java8
    When I opened an urls:
      | "https://ya.ru/"          |
      | "https://www.rambler.ru/" |
    Then I see search elements:
      | span#input__box     |
      | input#search_query  |
##cucumber-java
#    When I opened an urls
#      | https://ya.ru/            |
#      | https://www.rambler.ru/   |
#    Then I see search elements
#      | span#input__box     |
#      | input#search_query  |
