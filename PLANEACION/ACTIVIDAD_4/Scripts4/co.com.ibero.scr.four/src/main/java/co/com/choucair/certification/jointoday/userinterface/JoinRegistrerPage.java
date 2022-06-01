package co.com.choucair.certification.jointoday.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinRegistrerPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='navbar navbar-default navbar-fixed-top unauthenticated-nav-bar']//a[contains(text(),'Join Today')]"));
}

