package retoAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retoAutomatizacion.userinterface.RegistrationForm;

import java.util.List;
import java.util.Map;

public class RegisterUser implements Task {

    private final List<Map<String, String>> data;

    public RegisterUser(List<Map<String, String>> data) {
        this.data = data;
    }

    public static RegisterUser onThePage(List<Map<String, String>> data) {
        return Tasks.instrumented(RegisterUser.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrationForm.REGISTER_BUTTON),
                Enter.theValue(data.get(0).get("username")).into(RegistrationForm.INPUT_USERNAME),
                Enter.theValue(data.get(0).get("password")).into(RegistrationForm.INPUT_PASSWORD),
                Click.on(RegistrationForm.SUBMIT_BUTTON)
        );
    }
}
