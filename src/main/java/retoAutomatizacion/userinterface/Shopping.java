package retoAutomatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Shopping {

    public static final Target BUTTON_ADDCART = Target
            .the("add to cart button")
            .located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

    public static final Target OPTIONS_CART = Target
            .the("main menu options to access the cart")
            .located(By.id("cartur"));

    public static final Target PLACE_ORDER = Target
            .the("button to open the order form")
            .located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));

    public static final Target INPUT_NAME = Target
            .the("customer name")
            .located(By.id("name"));

    public static final Target INPUT_COUNTRY = Target
            .the("customer country")
            .located(By.id("country"));

    public static final Target INPUT_CITY = Target
            .the("customer city")
            .located(By.id("city"));

    public static final Target INPUT_CREDITCARD = Target
            .the("credit card number")
            .located(By.id("card"));

    public static final Target INPUT_MONTH = Target
            .the("month of purchase")
            .located(By.id("month"));

    public static final Target INPUT_YEAR = Target
            .the("year of purchase")
            .located(By.id("year"));

    public static final Target BUTTON_PURCHASE = Target
            .the("button to confirm the purchase")
            .located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));

    public static final Target BUTTON_CONFIRMATION = Target
            .the("button close the purchase confirmation")
            .located(By.xpath("/html/body/div[10]/div[7]/div/button"));
}
