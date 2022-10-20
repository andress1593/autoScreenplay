package retoAutomatizacion.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retoAutomatizacion.tasks.OpenPage;
import retoAutomatizacion.tasks.RegisterUser;

public class StepDefinitionsRegister {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Andres wants to register on the Product Store page$")
    public void thatAndresWantsToRegisterOnTheProductStorePage(){
        OnStage.theActorCalled("Andres").wasAbleTo(
                OpenPage.thePage());
    }

    @When("^he finds a registration form where he must fill out the information$")
    public void heFindsARegistrationFormWhereHeMustFillOutTheInformation(){
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.onThePage());
    }

    @Then("he can log in the page$")
    public void heCanLogInThePage(){
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.validation(questions)));
    }

}
