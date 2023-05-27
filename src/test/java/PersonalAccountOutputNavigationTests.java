import Data.LoginData;
import org.junit.Before;
import org.junit.Test;

public class PersonalAccountOutputNavigationTests extends TestBase{

    @Override
    @Before
    public void setUp() {
        init("RegistrationPage");
        registrationPage.createUser(validRegistrationData);
        getRegistrationData(validRegistrationData);
        loginPage.getLoginPage();
        loginPage.loginByUser(new LoginData(email, password));
        mainPage.initEnterToPersonalAccount();
    }

    @Test
    public void transitionToMainPageByLogo() {
        personalAccountPage.initTransitionToMainPageByLogo();
        mainPage.checkPage();
    }

    @Test
    public void transitionToMainPageByConstructorLink() {
        personalAccountPage.initTransitionToMainPageByConstructorLink();
        mainPage.checkPage();
    }
}
