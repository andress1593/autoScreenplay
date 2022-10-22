package retoAutomatizacion.interactions;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import retoAutomatizacion.userinterface.Shopping;

public class SelectCategory implements Interaction {

    private String options;

    public SelectCategory(String options) {
        this.options = options;
    }

    public static SelectCategory theCategory(String options) {
        return Tasks.instrumented(SelectCategory.class, options);
    }

    @Step("{0} select in the list the option '#option'")

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Shopping.LIST_CATEGORY.of(options)));
    }
}
