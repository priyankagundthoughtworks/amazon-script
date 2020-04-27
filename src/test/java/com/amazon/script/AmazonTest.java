package com.amazon.script;

import com.amazon.base.Base;
import com.amazon.pages.AddToCart;
import com.amazon.pages.Login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;


public class AmazonTest extends Base {

    @BeforeClass
    public void setUp() {
        initialization();
    }

    @Test
    public void login()  {
        Login login=new Login(driver);
        login.clickOnSignIn();
        login.setEmail();
        login.clickOnContinue();
        login.setPassword();
        login.clickOnLogin();

    }

   /* @Test
    public void testName() throws InterruptedException {
        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ap_email")).sendKeys("priyankagund18@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("priya@123");
        driver.findElement(By.id("signInSubmit")).click();
    }*/

   @Test
    public void searchBookAndAddToCart() {
        AddToCart addToCart=new AddToCart(driver);
        addToCart.setSerachItem();
        addToCart.setEnterButton();
        addToCart.setSelectItem();
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        addToCart.setAddToCart();
    }

    @Test
    public void logoutToAmazon() throws InterruptedException {
        Login login=new Login(driver);
        login.clickOnSignIn();
        login.setEmail();
        login.clickOnContinue();
        login.setPassword();
        login.clickOnLogin();
        Thread.sleep(1000);
        login.moveToSignOut();
        Thread.sleep(3000);
        login.clickOnSignOut();
    }
}
