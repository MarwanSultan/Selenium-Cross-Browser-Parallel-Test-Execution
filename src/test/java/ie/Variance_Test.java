package ie;


import com.amazon.marwan.core.BaseTest;
import com.amazon.marwan.pages.AmazonHome_Page;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Variance_Test extends BaseTest {

    AmazonHome_Page amazon;

    
    @Parameters(value ="browser")
    @Test
    public void showVariance(@Optional String browser) {
        AmazonHome_Page amazon = new AmazonHome_Page(driver);
        amazon.amazonBasics();

    }
}
