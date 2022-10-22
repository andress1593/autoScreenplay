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
import retoAutomatizacion.interactions.SelectCategory;
import retoAutomatizacion.interactions.SelectProduct;
import retoAutomatizacion.tasks.Login;
import retoAutomatizacion.tasks.OpenPage;
import retoAutomatizacion.tasks.Purchase;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static retoAutomatizacion.userinterface.Shopping.THANK_MESSAGE;

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
    public void heSelectsACategoryAndAProductAndAddsThemToTheCartToCompleteThePurchase(DataTable data) {
        List<Map<String, String>> newlista = data.asMaps();
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterPage(newlista), SelectCategory.theCategory(newlista.get(0).get("category")), SelectProduct.theProduct(newlista.get(0).get("product")), Purchase.buyProduct(newlista));
    }

    @Then("he finalizes the purchase and gets the product")
    public void heFinalizesThePurchaseAndGetsTheProduct() {
        GivenWhenThen.seeThat(WebElementQuestion.the(THANK_MESSAGE), isCurrentlyVisible());
    }
}
