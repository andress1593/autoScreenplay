package retoAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Purchase implements Task {

    public static Purchase buyProduct() {
        return Tasks.instrumented(Purchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
