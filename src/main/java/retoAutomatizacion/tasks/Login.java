package retoAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retoAutomatizacion.userinterface.LoginForm;

public class Login implements Task {

    public static Login enterPage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginForm.LOGIN_BUTTON),
                Enter.theValue("andress1593").into(LoginForm.INPUT_USERNAME),
                Enter.theValue("1234*").into(LoginForm.INPUT_PASSWORD),
                Click.on(LoginForm.LOGIN_SUBMIT)
        );
    }
}
