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

public class Amazon {

    private static AndroidDriver driver;


    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/AP/");
        //       File app = new File(appDir, "app-debug.apk");
        File app = new File(appDir, "amazon.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
     /*   capabilities.setCapability("deviceName", "Mi 4i");
        capabilities.setCapability("platformVersion", "5.0.2");

        capabilities.setCapability("deviceName", "pp");
        capabilities.setCapability("platformVersion", "5.1.1");
*/
        capabilities.setCapability("deviceName","jj");
        capabilities.setCapability("platformVersion", "4.4.2");


        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());

        capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
        capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        Thread.sleep(10000);


        WebElement Skip = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button"));
        Skip.click();
/*
        WebElement Signin = driver.findElement(By.id("in.amazon.mShop.android.shopping:id/sign_in_button"));
        Signin.click();
*/
        WebElement sign = driver.findElementByName("Hello.Sign inSign inHello. Link");
        sign.click();


        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

//      driver.quit();

    }
}
