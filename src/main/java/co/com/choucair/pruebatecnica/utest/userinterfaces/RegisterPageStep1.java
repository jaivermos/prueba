package co.com.choucair.pruebatecnica.utest.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPageStep1 extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("button to go to the registration form").located(By.xpath("//button[@class='btn btn-blue']"));
    public static final Target INPUT_FIRSTNAME = Target.the("where the names are written").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where to write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where you write the email address").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Where you select the month of birth").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("Where you select the day of birth").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("Where you select the year of birth").located(By.id("birthYear"));
    public static final Target NEXTSTEP_BUTTON = Target.the("Button for next step").located(By.xpath("//button[@class='unauthenticated-nav-bar__dropdown-menu-sign-up']"));
}
