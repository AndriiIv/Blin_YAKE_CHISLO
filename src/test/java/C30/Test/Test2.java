package C30.Test;

import C30.Pages.HomePage;
import org.testng.annotations.Test;

public class Test2 extends BaseTest{
        @Test

        public void goToWebSite2(){
            HomePage homePage = new HomePage(driver);
            homePage.openUrl();
        }
}
