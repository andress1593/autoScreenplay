package retoAutomatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import retoAutomatizacion.userinterface.Shopping;

public class SelectProduct implements Interaction {

    private String product;

    public SelectProduct(String product) {
        this.product = product;
    }

    public static SelectProduct theProduct(String product) {
        return Tasks.instrumented(SelectProduct.class, product);
    }

    @Step("{0} select in the list the option '#product'")

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Shopping.LIST_PRODUCTS.of(product)));
    }
}
