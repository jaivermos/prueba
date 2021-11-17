package co.com.choucair.pruebatecnica.utest.task;

import co.com.choucair.pruebatecnica.utest.userinterfaces.RegisterPageStep2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register2 implements Task {

    private String strCity;

    public Register2(String strCity) {
        this.strCity = strCity;
    }

    public static Register2 the(String strCity) {
        return Tasks.instrumented(Register2.class,strCity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(RegisterPageStep2.INPUT_CITY),
                Click.on(RegisterPageStep2.NEXTSTEP_BUTTON));
    }
}
