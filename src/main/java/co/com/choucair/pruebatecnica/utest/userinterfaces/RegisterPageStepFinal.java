package co.com.choucair.pruebatecnica.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPageStepFinal extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("where to write the password").located(By.id("password"));
    public static final Target INPUT_CPASSWORD = Target.the("Where you confirm the password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("Check terms and conditions").located(By.id("termOfUse"));
    public static final Target  CHECKBOX_PRIVACY= Target.the("Accept the security and privacy policy").located(By.id("privacySetting"));
    public static final Target NEXTSTEP_BUTTON = Target.the("complete registration").located(By.xpath("//button[@class='btn btn-blue']"));
}
