package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

@Test
    public void loginSuccess(){
    app.getHelperUser().openLoginForm();
    app.getHelperUser().fillRegistrationForm("tets@gmail.com", "Mm12345$");
    app.pause();
    app.getHelperUser().click(By.xpath("//button[@type='submit']"));
    app.pause();
    app.getHelperUser().click(By.xpath("//button[@type='button']"));

    Assert.assertTrue(app.getHelperUser().isLogged());

  //  Assert.assertTrue(app.getHelperUser().isLoggedModel(By.xpath("\"//a[text()='Delete account']\"")));
}

}
