/**
 * Created by prashant on 12/4/17.
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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chessTestNG
{
    public static AndroidDriver driver;

    @BeforeTest
    public void First() throws MalformedURLException, InterruptedException
    {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/AP/");
        File app = new File(appDir, "app-debugjj.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");

          /*    capabilities.setCapability("deviceName","jj");
        capabilities.setCapability("platformVersion", "4.4.2");
*/
/*
        capabilities.setCapability("deviceName", "pp");
        capabilities.setCapability("platformVersion", "5.1.1");
*/

        capabilities.setCapability("deviceName", "ss");
        capabilities.setCapability("platformVersion", "6.0");


/*
        capabilities.setCapability("deviceName","nn");
        capabilities.setCapability("platformVersion", "7.0");
*/


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
    }

    @Test
    public void Login() throws InterruptedException
    {
        WebElement Email = driver.findElementById("chess7.com:id/et_email");
        Email.sendKeys("edunuts.testing@gmail.com");

        WebElement Password = driver.findElementById("chess7.com:id/et_pwd");
        Password.sendKeys("qwerty");

        WebElement Login = driver.findElementById("chess7.com:id/btn_next");
        Login.click();

        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

        WebElement ImgButton = driver.findElementByClassName("android.widget.ImageButton");
        ImgButton.click();

    }

    @AfterTest

    public void afterTest()
    {
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    }


}
