package retoAutomatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {

    public static final Target REGISTER_BUTTON = Target.the(
            "button that accesses the registration form")
            .located(By.id("signin2"));

    public static final Target INPUT_USERNAME = Target.the(
            "text box to enter the username")
            .located(By.id("sign-username"));

    public static final Target INPUT_PASSWORD = Target.the(
            "text box to enter the password").
            located(By.id("sign-password"));

    public static final Target SUBMIT_BUTTON = Target.the(
            "button to send the information")
            .located(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
}
