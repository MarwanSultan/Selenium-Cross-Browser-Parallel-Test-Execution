package firefox;


import com.amazon.marwan.core.BaseTest;
import com.amazon.marwan.pages.AmazonHome_Page;
import com.amazon.marwan.resources.DataProvider;
import com.amazon.marwan.resources.HelperClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SuppressWarnings("ALL")
public class tc_002_Test extends BaseTest {

    AmazonHome_Page amazon;
    HelperClass h;


    @Parameters("browser")
    @Test(dataProvider = "data", dataProviderClass = DataProvider.class)
    public void dataDriven(@Optional("browser") String item) throws InterruptedException {
        AmazonHome_Page amazon = new AmazonHome_Page(getDriver());
        HelperClass h = new HelperClass(driver);
        h.moveBrowserLeft();
        
        amazon.testSearch(item);
        Thread.sleep(1000);

    }


    
    
    
}
