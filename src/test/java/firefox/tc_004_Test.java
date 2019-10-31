package firefox;


import com.amazon.marwan.core.BaseTest;
import com.amazon.marwan.pages.AmazonHome_Page;
import com.amazon.marwan.pages.SignIn_Page;
import com.amazon.marwan.resources.HelperClass;
import org.openqa.selenium.Point;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tc_004_Test extends BaseTest {

    SignIn_Page sp;
    AmazonHome_Page amazon;


    HelperClass h;
    
    @Parameters(value = "browser")
    @Test
    public void viewMyCart(@Optional String browser) throws RuntimeException  {

        AmazonHome_Page amazon = new AmazonHome_Page(getDriver());
        try {
            amazon.viewCart();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        HelperClass h = new HelperClass(driver);

        driver.manage().window().setPosition(new Point(800, 222));

        h.moveBrowserRight();

    }


}
