package ie;


import com.amazon.marwan.core.BaseTest;
import com.amazon.marwan.pages.AmazonHome_Page;
import com.amazon.marwan.pages.ProductDetails_Page;
import com.amazon.marwan.pages.ViewCart_Page;
import com.amazon.marwan.resources.HelperClass;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tc_005_Test extends BaseTest {

    HelperClass hc;
    WebDriverWait wait;

    AmazonHome_Page amazon;
    ViewCart_Page vc;
    ProductDetails_Page pd;
    HelperClass h;
    
    
    
    @Parameters(value="browser")
    @Test
    public void viewOrderHistory(@Optional String browser) throws TimeoutException, InterruptedException {

        AmazonHome_Page amazon = new AmazonHome_Page(driver);
        amazon.navigateToAmazonBasicsOfficeProducts();
        HelperClass h = new HelperClass(driver);
        h.moveBrowserRight();

        Thread.sleep(1000);


    }

}