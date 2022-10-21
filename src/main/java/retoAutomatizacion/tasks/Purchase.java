package retoAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import retoAutomatizacion.userinterface.Shopping;

import java.util.List;
import java.util.Map;

public class Purchase implements Task {

    private final List<Map<String, String>> data;

    public Purchase(List<Map<String, String>> data) {
        this.data = data;
    }

    public static Purchase buyProduct(List<Map<String, String>> data) {
        return Tasks.instrumented(Purchase.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).get("name")).into(Shopping.INPUT_NAME),
                Enter.theValue(data.get(0).get("country")).into(Shopping.INPUT_COUNTRY),
                Enter.theValue(data.get(0).get("city")).into(Shopping.INPUT_CITY),
                Enter.theValue(data.get(0).get("creditCard")).into(Shopping.INPUT_CREDITCARD),
                Enter.theValue(data.get(0).get("month")).into(Shopping.INPUT_MONTH),
                Enter.theValue(data.get(0).get("year")).into(Shopping.INPUT_YEAR)
        );
        //Click.on(driver.findElement(By.linkText("Phones")))
    }
}
