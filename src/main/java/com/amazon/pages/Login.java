package com.amazon.pages;
import com.amazon.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login extends Base {

    public Login(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nav-link-accountList")
    WebElement SignIn;

   /* @FindBy(xpath = "//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
    WebElement SignIn;*/

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "continue")
    WebElement Continue;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id = "signInSubmit")
    WebElement Login;

    @FindBy(xpath = ".//*[@id='nav-al-your-account']")
    WebElement myAccount;

    @FindBy(xpath = "//span[contains(text(),'Sign Out')]")
    WebElement signOut;

   /* @FindBy(xpath = "//a[@id='nav-link-accountList']")
    WebElement beforeSignIn;
*/
   public void clickOnSignIn() {
      SignIn.click();
   }
    public void setEmail() {
        email.sendKeys("priyankagund18@gmail.com");
    }
    public void setPassword() {
        password.sendKeys("priya@123");
    }
    public void clickOnContinue() { Continue.click(); }
    public void clickOnLogin() {
        Login.click();
    }
    public void moveToSignOut(){
        Actions a= new Actions(driver);
        a.moveToElement(SignIn).build().perform();
    }
    public void clickOnSignOut(){
       signOut.click();
    }
}
