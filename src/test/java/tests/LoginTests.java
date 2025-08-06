package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition() {
        //if SignOut present ---> logout
        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logout();
        }
    }

@Test
    public void loginSuccess(){
    app.getHelperUser().openLoginForm();
    app.getHelperUser().fillLoginForm("tets@gmail.com", "Mm12345$");
    app.pause();
    app.getHelperUser().clickYallaBtnOnLoginPage();
    app.pause();
    app.getHelperUser().clickLoggedInOk();

    Assert.assertTrue(app.getHelperUser().isLogged());

  //  Assert.assertTrue(app.getHelperUser().isLoggedModel(By.xpath("\"//a[text()='Delete account']\"")));
}

    @Test
    public void loginSuccessModel() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("tets@gmail.com", "Mm12345$");
        app.getHelperUser().clickYallaBtnOnLoginPage();
        app.getHelperUser().clickLoggedInOk();

        Assert.assertTrue(app.getHelperUser().isLogged());

    }

}
