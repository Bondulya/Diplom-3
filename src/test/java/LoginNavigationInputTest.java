import Data.LoginData;
import org.junit.Test;

public class LoginNavigationInputTest extends TestBase{

    @Test
    public void loginByButtonFromRegistrationPage() {
        registrationPage.getRegistrationPage();
        registrationPage.initLogin();
        loginPage.loginByUser(new LoginData(email, password));
        mainPage.checkPage();
    }

    @Test
    public void loginByEnterButtonFromMainPage() {
        mainPage.getMainPage();
        mainPage.initLogin();
        loginPage.checkPage();
        loginPage.loginByUser(new LoginData(email, password));
        mainPage.checkPage();
    }

    @Test
    public void loginByPersonalAccountLinkFromMainPage() {
        mainPage.getMainPage();
        mainPage.initEnterToPersonalAccount();
        loginPage.checkPage();
        loginPage.loginByUser(new LoginData(email, password));
        mainPage.checkPage();
    }

    @Test
    public void loginByEnterLinkFromPasswordRecoveryPage() {
        passwordRecoveryPage.getPasswordRecoveryPage();
        passwordRecoveryPage.initLogin();
        loginPage.checkPage();
        loginPage.loginByUser(new LoginData(email, password));
        mainPage.checkPage();
    }
}
