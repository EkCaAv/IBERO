package co.com.choucair.certification.jointoday.questions;

import co.com.choucair.certification.jointoday.userinterface.SearchRegisterJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameJoin= Text.of(SearchRegisterJoinPage.SELECT_JOIN).viewedBy(actor).asString();
        if (question.equals(nameJoin)){
            result = false;
        }else {
            result = true;
        }
        return result;
    }
}
