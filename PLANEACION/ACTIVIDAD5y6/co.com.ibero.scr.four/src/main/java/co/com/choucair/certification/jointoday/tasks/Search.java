package co.com.choucair.certification.jointoday.tasks;

import co.com.choucair.certification.jointoday.userinterface.SearchRegisterJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Search implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strPassword;
    private String strConfirm;

    public Search(String strName, String strLastName, String strEmail, String strPassword, String strConfirm) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strPassword = strPassword;
        this.strConfirm = strConfirm;
    }

    public static Search the(String strName, String strLastName, String strEmail, String strPassword, String strConfirm ) {
        return Tasks.instrumented(Search.class,strName,strLastName,strEmail, strPassword, strConfirm);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(SearchRegisterJoinPage.INPUT_USER),
                Enter.theValue(strLastName).into(SearchRegisterJoinPage.INPUT_PASSWORD),
                Enter.theValue(strEmail).into(SearchRegisterJoinPage.INPUT_EMAIL),
                Click.on(SearchRegisterJoinPage.SELECT_MONTH),
                Click.on(SearchRegisterJoinPage.SELECT_DAY),
                Click.on(SearchRegisterJoinPage.SELECT_YEAR),
                Click.on(SearchRegisterJoinPage.SELECT_NEXT),
                Click.on(SearchRegisterJoinPage.SELECT_CITY),
                Click.on(SearchRegisterJoinPage.SELECT_TWO),
                Click.on(SearchRegisterJoinPage.SELECT_LAST),
                Enter.theValue(strPassword).into(SearchRegisterJoinPage.INPUT_PASS),
                Enter.theValue(strConfirm).into(SearchRegisterJoinPage.INPUT_CONFPASS),
                Click.on(SearchRegisterJoinPage.SELECT_VALUEONE),
                Click.on(SearchRegisterJoinPage.SELECT_VALUETWO),
                Click.on(SearchRegisterJoinPage.SELECT_VALUETHREE),
                Click.on(SearchRegisterJoinPage.SELECT_JOIN),
                Click.on(SearchRegisterJoinPage.SELECT_END)

        );
    }
}
