Feature: As a customer,I need to be able to see the covid 9 restrictions
  so  I know whether I am still OK to place an order or not

  Scenario Outline: Checking Covid 19 Service Updates

    Given That  I am viewing the DIY webpage
    When I press the '<Covid>' button
    Then The '<Covids>' page will be displayed same as B2B but with B2C theme

    Examples:
      | Covid                  | Covids |
      |Covid-19 Service Updates|Covid-19:Customer Notice|