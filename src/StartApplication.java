/**
 * Created by prashant on 21/3/17.
 */


import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartApplication {

    private static AndroidDriver driver;


    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/AP/");
        //       File app = new File(appDir, "app-debug.apk");
        File app = new File(appDir, "app-debugg.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("deviceName", "PP");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("platformName", "Android");

        /*  capabilities.setCapability("deviceName", "Mi 4i");
        capabilities.setCapability("platformVersion", "5.0.2");
      */

        capabilities.setCapability("app", app.getAbsolutePath());
     /*
        capabilities.setCapability("appPackage", "com.edunuts.edunutsprofessional");
        capabilities.setCapability("appActivity", "com.edunuts.edunutsprofessional.SplashActivity");
*/


        capabilities.setCapability("appPackage", "com.tutor.edunuts.mytutor");
        capabilities.setCapability("appActivity", "com.tutor.edunuts.mytutor.activity.SpalshActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);
/*
        WebElement START = driver.findElement(By.id("com.edunuts.edunutsprofessional:id/btn_start"));
        START.click();

        WebElement MobileNumber = driver.findElement(By.id("com.edunuts.edunutsprofessional:id/et_username"));
        MobileNumber.sendKeys("8421911848");

        WebElement Password = driver.findElement(By.id("com.edunuts.edunutsprofessional:id/et_password"));
        Password.sendKeys("qwerty");

        WebElement LOGIN = driver.findElement(By.id("com.edunuts.edunutsprofessional:id/btn_login"));
        LOGIN.click();

*/




        WebElement START = driver.findElement(By.className("android.widget.Button"));
        START.click();

        WebElement MobileNumber = driver.findElement(By.id("com.tutor.edunuts.mytutor:id/et_email"));
        MobileNumber.sendKeys("7750089306");

        WebElement Password = driver.findElement(By.id("com.tutor.edunuts.mytutor:id/et_password"));
        Password.sendKeys("password");

        WebElement LOGIN = driver.findElement(By.id("com.tutor.edunuts.mytutor:id/btn_sign_in"));
        LOGIN.click();


//      driver.quit();

    }
}