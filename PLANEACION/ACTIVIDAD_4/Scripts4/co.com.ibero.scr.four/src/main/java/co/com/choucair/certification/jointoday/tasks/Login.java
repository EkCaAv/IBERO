package co.com.choucair.certification.jointoday.tasks;

import co.com.choucair.certification.jointoday.userinterface.JoinRegistrerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Task {
    public Login() {
    }

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(JoinRegistrerPage.LOGIN_BUTTON)
        );

    }
}
