/**
 * Created by prashant on 7/4/17.
 */

/**
 * Created by prashant on 6/4/17.
 */

/**
 * Created by prashant on 27/3/17.
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

public class GP {

    private static AndroidDriver driver;


    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/AP/");
        File app = new File(appDir, "ComicGarder.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
       /* capabilities.setCapability("deviceName","jj");
        capabilities.setCapability("platformVersion", "4.4.2");
*/
        capabilities.setCapability("deviceName","jj");
        capabilities.setCapability("platformVersion", "4.4.2");

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());

        capabilities.setCapability("appPackage", "com.comicgrader");
        capabilities.setCapability("appActivity", "com.comicgrader.MainActivity");


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);


//      driver.quit();

    }
}

