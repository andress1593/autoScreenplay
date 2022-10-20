package retoAutomatizacion.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import retoAutomatizacion.model.ModelData;
import retoAutomatizacion.tasks.Login;
import retoAutomatizacion.tasks.OpenPage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static retoAutomatizacion.userinterface.LoginForm.WELCOME_MESSAGE;

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
    public void heEntersHisCredentialsInTheLoginForm(DataTable data) {
        List<Map<String, String>> newlista = data.asMaps();
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterPage(newlista));
    }

    @Then("he can navigate with his account")
    public void heCanNavigateWithHisAccount() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(WebElementQuestion.the(WELCOME_MESSAGE), isCurrentlyVisible())
        );
    }
}
