package C30.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openUrl() {
        driver.get(BASE_URL+"search?q=volvo+c30&oq=volvo+c30&aqs=chrome..69i57j69i59j0i512l8.4427j1j4&sourceid=chrome&ie=UTF-8");
    }

}
