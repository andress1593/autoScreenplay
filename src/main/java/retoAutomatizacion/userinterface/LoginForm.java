package retoAutomatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.id("login2"));

    public static final Target INPUT_USERNAME = Target.
            the("text box to enter the username")
            .located(By.id("loginusername"));

    public static final Target INPUT_PASSWORD = Target
            .the("text box to enter the username")
            .located(By.id("loginpassword"));

    public static final Target LOGIN_SUBMIT = Target
            .the("button to send the credentials")
            .located(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));

    public static final Target WELCOME_MESSAGE = Target
            .the("welcome message on the page")
            .located(By.id("nameofuser"));
}
