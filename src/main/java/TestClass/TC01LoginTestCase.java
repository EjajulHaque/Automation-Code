package TestClass;

import PageObject.LoginPage;
import TestBase.BaseClass;
import org.testng.annotations.Test;

public class TC01LoginTestCase extends BaseClass {
    @Test
    public void loginAccount(){
        LoginPage lp=new LoginPage(driver);
        lp.setTextUserName("Admin");
        lp.setTextPassword("admin123");
        lp.setLoginButton();
    }
}
