package daggerok;

import cucumber.api.DataTable;
import cucumber.api.java8.En;

/**
 * Created by mak on 3/12/17.
 */
// cucumber-java8
public class FirstFeatureJava8Stepdefs implements En {

    public FirstFeatureJava8Stepdefs() {

        When("^I opened an urls:$", (DataTable urlStrings) -> {

            System.out.println("start");
            urlStrings.asList(String.class).forEach(System.out::println);
        });

        Then("^I see search elements:$", (DataTable elementStrings) -> {

            System.out.println("end");
            elementStrings.asList(String.class).forEach(System.out::println);
        });
    }
}

/* // cucumber-java
class JavaNot8StepsDefinition {

    @When("I opened an urls")
    public void iOpenedAnUrl(List<String> urls) throws Throwable {

        System.out.println("start");
        urls.forEach(System.out::println);
    }

    @Then("I see search elements")
    public void iSeeSearchElement(List<String> elements) throws Throwable {

        System.out.println("end");
        elements.forEach(System.out::println);
    }
}
*/
