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
import retoAutomatizacion.tasks.RegisterUser;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static retoAutomatizacion.userinterface.LoginForm.WELCOME_MESSAGE;

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
    public void heFindsARegistrationFormWhereHeMustFillOutTheInformation(DataTable data){
        List<Map<String, String>> newlista = data.asMaps();
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.onThePage(newlista), Login.enterPage(newlista));
    }

    @Then("he can log in the page$")
    public void heCanLogInThePage(){
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(WebElementQuestion.the(WELCOME_MESSAGE), isCurrentlyVisible())
        );
    }
}
