/**
 * Created by prashant on 23/3/17.
 */


import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class flipkart {

    private static AndroidDriver driver;


    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/AP/");
        //       File app = new File(appDir, "app-debug.apk");
        File app = new File(appDir, "flipkart.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("deviceName", "PP");
        capabilities.setCapability("platformVersion", "5.1.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());

        capabilities.setCapability("appPackage", "com.flipkart.android");
        capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);

    }
}