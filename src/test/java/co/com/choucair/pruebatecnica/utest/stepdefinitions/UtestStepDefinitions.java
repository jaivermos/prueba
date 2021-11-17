package co.com.choucair.pruebatecnica.utest.stepdefinitions;

import co.com.choucair.pruebatecnica.utest.model.UtestData;
import co.com.choucair.pruebatecnica.utest.task.Jointoday;
import co.com.choucair.pruebatecnica.utest.task.OpenUp;
import co.com.choucair.pruebatecnica.utest.task.Register2;
import co.com.choucair.pruebatecnica.utest.task.RegisterFinal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user wants to register you on the Utest platform$")
    public void TheUserWantsToRegisterYouOnTheUtestPlatform (List<UtestData> utestData){
        OnStage.theActorCalled("Jaiver").wasAbleTo(OpenUp.thePage(), Jointoday.onThePage(utestData.get(0).getStrFirtsName(), utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(), utestData.get(0).getStrMonthBirth(), utestData.get(0).getStrDayBirth(), utestData.get(0).getStrYearBirth()));
    }
    @When("^Search for the registration form$")
    public void SearchForTheRegistrationForm (List<UtestData> utestData){
        OnStage.theActorInTheSpotlight().attemptsTo(Register2.the(utestData.get(0).getStrCity()));

    }
    @Then("^he registers on the platform$")
    public void HeRegistersOnThePlatform (List<UtestData> utestData){
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterFinal.fPage(utestData.get(0).getStrPassword(), utestData.get(0).getStrConfirmPassword()));
    }
}
