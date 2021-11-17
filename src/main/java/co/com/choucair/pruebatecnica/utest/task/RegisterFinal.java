package co.com.choucair.pruebatecnica.utest.task;

import co.com.choucair.pruebatecnica.utest.userinterfaces.RegisterPageStep2;
import co.com.choucair.pruebatecnica.utest.userinterfaces.RegisterPageStepFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterFinal implements Task {

    private String strPassword;
    private String strConfirmPassword;
    public RegisterFinal(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static RegisterFinal fPage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(RegisterFinal.class, strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(RegisterPageStepFinal.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(RegisterPageStepFinal.INPUT_CPASSWORD),
                Click.on(RegisterPageStepFinal.CHECKBOX_TERMS),
                Click.on(RegisterPageStepFinal.CHECKBOX_PRIVACY),
                Click.on(RegisterPageStepFinal.NEXTSTEP_BUTTON));
    }
}
