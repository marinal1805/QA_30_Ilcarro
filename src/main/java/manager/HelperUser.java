package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }

public void openLoginForm(){
        click(By.xpath("//a[text()=' Log in ']"));
}

public boolean isLogged(){
        return isElementPresent(By.xpath("//a[text()='Delete account']"));
}


    public void fillRegistrationForm(String email, String password) {
        type(By.id("email"), email);
        type(By.id("password"), password);
    }
}
