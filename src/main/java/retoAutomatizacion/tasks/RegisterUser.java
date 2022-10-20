package retoAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retoAutomatizacion.userinterface.RegistrationForm;

public class RegisterUser implements Task {


    public static RegisterUser onThePage() {
        return Tasks.instrumented(RegisterUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrationForm.REGISTER_BUTTON),
                Enter.theValue("andress1593").into(RegistrationForm.INPUT_USERNAME),
                Enter.theValue("1234*").into(RegistrationForm.INPUT_PASSWORD),
                Click.on(RegistrationForm.SUBMIT_BUTTON)
        );
    }
}
