package retoAutomatizacion.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retoAutomatizacion.tasks.Login;
import retoAutomatizacion.tasks.OpenPage;
import retoAutomatizacion.tasks.Purchase;

public class StepDefinitionsPurchase {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that Andres wants to buy products from Product Store")
    public void thatAndresWantsToBuyProductsFromProductStore() {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenPage.thePage());
    }

    @When("he selects a category and a product and adds them to the cart to complete the purchase")
    public void heSelectsACategoryAndAProductAndAddsThemToTheCartToCompleteThePurchase() {
        //OnStage.theActorInTheSpotlight().attemptsTo(Login.enterPage(data), Purchase.buyProduct());
    }

    @Then("he finalizes the purchase and gets the product")
    public void heFinalizesThePurchaseAndGetsTheProduct() {

    }
}
