package retoAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import retoAutomatizacion.userinterface.ProductStorePage;

public class OpenPage implements Task {

    private ProductStorePage productStorePage;

    public static OpenPage thePage(){
        return Tasks.instrumented(OpenPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(productStorePage));
    }
}
