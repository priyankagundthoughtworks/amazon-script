package com.amazon.pages;

import com.amazon.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart extends Base {

    @FindBy(xpath="//input[@id='twotabsearchtextbox']")
    WebElement SearchItem;

    @FindBy(className="nav-input")
    WebElement enterButton;

    @FindBy(xpath="//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results index=1']//img[@class='s-image']")
    WebElement selectItem;

    @FindBy(xpath="//button[@id='add-to-ebooks-cart-button']")
    WebElement addToCart;

    public AddToCart(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setSerachItem(){
        SearchItem.sendKeys("Novels");
    }

    public void setEnterButton(){
        enterButton.click();
    }

    public void setSelectItem(){
        selectItem.click();
    }

    public void setAddToCart(){
        addToCart.click();
    }

}
