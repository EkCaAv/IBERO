package co.com.choucair.certification.jointoday.stepdefinitions;

import co.com.choucair.certification.jointoday.model.JoinToDayData;
import co.com.choucair.certification.jointoday.questions.Answer;
import co.com.choucair.certification.jointoday.tasks.Login;
import co.com.choucair.certification.jointoday.tasks.OpenUp;
import co.com.choucair.certification.jointoday.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class JoinToDayStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than erika wants to join world is largest community of testers$")
    public void thanErikaWantsToJoinWorldIsLargestCommunityOfTesters(List<JoinToDayData> joinToDayData) throws Exception {
        OnStage.theActorCalled("Erika").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }


    @When("^She wants to register her data in the registration form$")
    public void sheWantsToRegisterHerDataInTheRegistrationForm(List<JoinToDayData> joinToDayData) throws Exception {
        OnStage.theActorInTheSpotlight().wasAbleTo(Search.the(joinToDayData.get(0).getStrName(),joinToDayData.get(0).getStrLastName(),joinToDayData.get(0).getStrEmail(),joinToDayData.get(0).getStrPassword(),joinToDayData.get(0).getStrConfirm()));
    }


    @Then("^to join the community$")
    public void toJoinTheCommunity(List<JoinToDayData> joinToDayData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(joinToDayData.get(0).getStrCommunity())));
    }

}