package CommonPO;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;
    public CommonMethods commonMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        commonMethods = new CommonMethods(driver);
    }
}
//testing changes in the code
//second time making changes