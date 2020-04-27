package com.amazon.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base implements ConfigFiles {

    public static WebDriver driver;
    static {
        System.setProperty(CHROME_KEY,CHROME_VALUE);
    }
    public void initialization(){
            driver = new ChromeDriver();
            String url = Proposal.getProperty(CONFIG_PATH,"URL");
            driver.manage().window().maximize();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }


}
