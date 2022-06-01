package co.com.choucair.certification.jointoday.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchRegisterJoinPage{
    public static final Target INPUT_USER = Target.the("were do we write the user").located(By.id("firstName"));
    public static final Target INPUT_PASSWORD = Target.the("were do we write the password").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("were do we write the email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("select month").located(By.xpath("//div[@class='container-fluid']//option[contains(text(),'December')]"));
    public static final Target SELECT_DAY = Target.the("select day").located(By.xpath("//div[@class='container-fluid']//option[contains(text(),'10')]"));
    public static final Target SELECT_YEAR = Target.the("select year").located(By.xpath("//div[@class='container-fluid']//option[contains(text(),'1989')]"));
    public static final Target SELECT_NEXT = Target.the("click to next form").located(By.xpath("//div[@class='container-fluid']//span[contains(text(),'Next: Location')]"));
    public static final Target SELECT_CITY = Target.the("select city").located(By.id("city"));
    public static final Target SELECT_TWO = Target.the("select next form two").located(By.xpath("//div[@class='container-fluid']//span[contains(text(),'Next: Devices')]"));
    public static final Target SELECT_MOBILE = Target.the("select mobile").located(By.xpath("//div[@class='container-fluid']//span[contains(text(),'A')]"));
    public static final Target SELECT_MODEL = Target.the("select model").located(By.xpath("//div[@class='container-fluid']//span[contains(text(),'Zenfone Max (M2) ZB633KL')]"));
    public static final Target SELECT_SO = Target.the("select system").located(By.xpath("//div[@class='container-fluid']//span[contains(text(),'Android 9.0 (Pie)')]"));
    public static final Target SELECT_LAST = Target.the("select next form two").located(By.xpath("//div[@class='container-fluid']//span[contains(text(),'Next: Last Step')]"));
    public static final Target INPUT_PASS = Target.the("were do we write the password").located(By.id("password"));
    public static final Target INPUT_CONFPASS = Target.the("were do we write the confirm password").located(By.id("confirmPassword"));
    public static final Target SELECT_VALUEONE = Target.the("clic to accept conditions").located(By.xpath("//div[@class='container-fluid']//div[contains(text(),'Please keep me up-to-date via email on the latest projects and updates from uTest. This is not required but highly recommended in order to receive info as it becomes available.')]"));
    public static final Target SELECT_VALUETWO = Target.the("clic to accept conditions").located(By.id("termOfUse"));
    public static final Target SELECT_VALUETHREE = Target.the("clic to accept conditions").located(By.id("privacySetting"));
    public static final Target SELECT_JOIN = Target.the("select confirmation message" ).located(By.xpath("//div[contains(@class,'container-fluid')]"));
    public static final Target SELECT_END = Target.the("click to send form").located(By.xpath("//div[@class='container-fluid']//span[contains(text(),'Complete Setup')]"));

}
