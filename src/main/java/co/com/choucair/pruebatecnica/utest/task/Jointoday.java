package co.com.choucair.pruebatecnica.utest.task;

import co.com.choucair.pruebatecnica.utest.userinterfaces.RegisterPageStep1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Jointoday implements Task {

    private String strFirstName;
    private String strLastname;
    private String strEmail;
    private String strMonthBirth;
    private String strDayBirth;
    private String strYearBirth;

    public Jointoday(String strFirstName, String strLastname, String strEmail, String strMonthBirth, String strDayBirth, String strYearBirth) {
        this.strFirstName = strFirstName;
        this.strLastname = strLastname;
        this.strEmail = strEmail;
        this.strMonthBirth = strMonthBirth;
        this.strDayBirth = strDayBirth;
        this.strYearBirth = strYearBirth;
    }

    public static Jointoday onThePage(String strFirtsName, String strLastName, String strEmail, String strMonthBirth, String strDayBirth, String strYearBirth) {
        return Tasks.instrumented(Jointoday.class,strFirtsName, strLastName, strEmail, strMonthBirth, strDayBirth, strYearBirth);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPageStep1.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(RegisterPageStep1.INPUT_FIRSTNAME),
                Enter.theValue(strLastname).into(RegisterPageStep1.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(RegisterPageStep1.INPUT_EMAIL),
                Click.on(RegisterPageStep1.SELECT_MONTH),
                Click.on(RegisterPageStep1.SELECT_DAY),
                Click.on(RegisterPageStep1.SELECT_YEAR),
                Click.on(RegisterPageStep1.NEXTSTEP_BUTTON));
    }
}
