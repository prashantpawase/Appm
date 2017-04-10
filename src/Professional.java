/**
 * Created by prashant on 10/4/17.
 */


import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Professional {

    private static AndroidDriver driver;


    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/AP/");
        File app = new File(appDir, "app-debug.apk");


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","pp");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.edunuts.edunutsprofessional");
        capabilities.setCapability("appActivity", "com.edunuts.edunutsprofessional.SplashActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);

        WebElement START = driver.findElement(By.id("com.edunuts.edunutsprofessional:id/btn_start"));
        START.click();

        WebElement MobileNumber = driver.findElement(By.id("com.edunuts.edunutsprofessional:id/et_username"));
        MobileNumber.sendKeys("8421911848");

        WebElement Password = driver.findElement(By.id("com.edunuts.edunutsprofessional:id/et_password"));
        Password.sendKeys("qwerty");

        WebElement LOGIN = driver.findElement(By.id("com.edunuts.edunutsprofessional:id/btn_login"));
        LOGIN.click();

        WebElement Search = driver.findElementByClassName("android.support.v7.widget.LinearLayoutCompat");
        Search.click();
        Search.sendKeys("Chandrakant");



//      driver.quit();

    }
}