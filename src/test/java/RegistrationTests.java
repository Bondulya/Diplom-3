import Data.RegistrationData;
import org.junit.Before;
import org.junit.Test;

import static ToDo.Randomize.*;

public class RegistrationTests  extends TestBase {

    @Override
    @Before
    public void setUp() {
        init("RegistrationPage");
    }
    @Test
    public void positiveRegistrationTest() {
        registrationPage.createUser(new RegistrationData(getRandomName(),
                getRandomEmail(),
                getRandomPassword(8)));
        loginPage.checkPage();
    }

    @Test
    public void negativeRegistrationTest() {
        registrationPage.createUser(new RegistrationData(getRandomName(),
                getRandomEmail(),
                getRandomPassword(5)));
        registrationPage.checkWrongPasswordMessage();
    }
}
