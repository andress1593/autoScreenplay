package retoAutomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retoAutomatizacion.model.ModelData;
import retoAutomatizacion.userinterface.LoginForm;

import java.util.List;
import java.util.Map;

public class Login implements Task {

    private final List<Map<String, String>> data;

    public Login(List<Map<String, String>> data) {
        this.data = data;
    }

    public static Login enterPage(List<Map<String, String>> data) {
        return Tasks.instrumented(Login.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginForm.LOGIN_BUTTON),
                Enter.theValue(data.get(0).get("username")).into(LoginForm.INPUT_USERNAME),
                Enter.theValue(data.get(0).get("password")).into(LoginForm.INPUT_PASSWORD),
                Click.on(LoginForm.LOGIN_SUBMIT)
        );
    }
}
