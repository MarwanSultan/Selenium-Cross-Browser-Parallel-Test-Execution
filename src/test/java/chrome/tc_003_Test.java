package chrome;


import com.amazon.marwan.core.BaseTest;
import com.amazon.marwan.pages.AmazonHome_Page;
import com.amazon.marwan.pages.SignIn_Page;
import com.amazon.marwan.resources.HelperClass;
import org.openqa.selenium.Point;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tc_003_Test extends BaseTest {




    SignIn_Page sp;

    HelperClass h;


    @Parameters("browser")
    @Test
    public void amazonLogin(@Optional String browser) throws Exception {
        AmazonHome_Page amazon = new AmazonHome_Page(getDriver());
        amazon.amazonLogin();
        driver.manage().window().setPosition(new Point(888, 111));

        SignIn_Page sp = new SignIn_Page(getDriver());
        sp.logIntoAmazon("Marwan.Sultan@gmail.com", "Blue4444#");
        Thread.sleep(1000);

        h.moveBrowserRight();
    }


}









