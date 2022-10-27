import io.appium.java_client.windows.WindowsDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.BasePage;
import pages.Standard;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WindowsDriver driver;
    protected BasePage basePage=new BasePage(driver);
    protected Standard standardPage=new Standard(driver);

    @BeforeClass
    public static void setup(){
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
        try {
            driver=new WindowsDriver<>(new URL("http://127.0.0.1:4723/"),cap);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}
