/**
 * Created by prashant on 6/4/17.
 */
//emulator -avd pp -http-proxy 0.0.0.0:4723

/**
 * Created by prashant on 27/3/17.
 */


import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class chess {

    private static AndroidDriver driver;


    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/AP/");
        File app = new File(appDir, "app-debugj.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");

          /*    capabilities.setCapability("deviceName","jj");
        capabilities.setCapability("platformVersion", "4.4.2");
*/
      /*  capabilities.setCapability("deviceName", "pp");
        capabilities.setCapability("platformVersion", "5.1.1");
      */
        /*capabilities.setCapability("deviceName", "ss");
        capabilities.setCapability("platformVersion", "6.0");
*/

        capabilities.setCapability("deviceName","nn");
        capabilities.setCapability("platformVersion", "7.0");


        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());

        capabilities.setCapability("appPackage", "chess7.com");
        capabilities.setCapability("appActivity", "chess7.com.SplashActivity");


        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
      //  Thread.sleep(10000);

        WebElement Email = driver.findElementById("chess7.com:id/et_email");
        Email.sendKeys("edunuts.testing@gmail.com");

        WebElement Password = driver.findElementById("chess7.com:id/et_pwd");
        Password.sendKeys("qwerty");

        WebElement Login = driver.findElementById("chess7.com:id/btn_next");
        Login.click();

        Thread.sleep(1000);


        WebElement Register = driver.findElementById("chess7.com:id/tv_register");
        Register.click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement RegisterNow = driver.findElementById("chess7.com:id/tv_register_now");
        RegisterNow.click();


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

/*
        //My Profile

        WebElement ImgButton = driver.findElementByClassName("android.widget.ImageButton");
        ImgButton.click();

        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        WebElement MyProfile = driver.findElement(By.name("My Profile"));
        MyProfile.click();

        WebElement GIEdit = driver.findElementById("chess7.com:id/tv_personal_info_edit");
        GIEdit.click();

        WebElement GIName = driver.findElementById("chess7.com:id/et_name");
        GIName.sendKeys("Prashant Pawase");

        WebElement GIAbout = driver.findElementById("chess7.com:id/et_about");
        GIAbout.sendKeys("Techno");

        WebElement GISave = driver.findElementById("chess7.com:id/tv_personal_info_edit");
        GISave.click();
*/

    }


//      driver.quit();



}

