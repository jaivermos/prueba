package co.com.choucair.pruebatecnica.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPageStep2 extends PageObject {
    public static final Target INPUT_CITY = Target.the("where to write the city").located(By.id("city"));
    public static final Target NEXTSTEP_BUTTON = Target.the("Button for next step").located(By.xpath("//button[@class='btn btn-blue pull-right']"));
}
