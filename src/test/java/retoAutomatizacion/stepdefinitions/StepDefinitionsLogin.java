package retoAutomatizacion.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retoAutomatizacion.tasks.Login;
import retoAutomatizacion.tasks.OpenPage;

public class StepDefinitionsLogin {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that Andres wants to log in to the Product Store Page")
    public void thatAndresWantsToLogInToTheProductStorePage() {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenPage.thePage());
    }

    @When("he enters his credentials in the login form")
    public void heEntersHisCredentialsInTheLoginForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterPage());
    }

    @Then("he can navigate with his account")
    public void heCanNavigateWithHisAccount() {

    }

}
