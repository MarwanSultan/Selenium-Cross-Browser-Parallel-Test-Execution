package chrome;


import com.amazon.marwan.core.BaseTest;
import com.amazon.marwan.pages.AmazonHome_Page;
import com.amazon.marwan.pages.ProductDetails_Page;
import com.amazon.marwan.pages.ViewCart_Page;
import com.amazon.marwan.resources.HelperClass;
import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tc_001_Test extends BaseTest {

    AmazonHome_Page amazon;

    ProductDetails_Page pd;
    ViewCart_Page vc;

    HelperClass h;

    @Parameters("browser")
    @Test
    public void addToCart(@Optional String browser) throws TimeoutException, InterruptedException {
        AmazonHome_Page amazon = new AmazonHome_Page(getDriver());

        amazon.amazonSearch("Dewalt Impact Driver");
        HelperClass h = new HelperClass(driver);
        Thread.sleep(1000);

        h.moveBrowserRight();
    }
    
}