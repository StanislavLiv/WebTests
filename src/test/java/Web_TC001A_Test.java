import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class Web_TC001A_Test {

    // TC-001-A Verify URL
    @Test
    public void testFirst() throws InterruptedException {

//Test Data:
//Browser: Chrome Browser 90.0
//URL http://www.99-bottles-of-beer.net/
//Expected Result: “http://www.99-bottles-of-beer.net/ ”
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\stani\\Documents\\WebDriversMaven\\Chrome\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";

// ACT _____Steps:

        System.setProperty(chromeDriver, driverPath);
//1. Open Browser
        WebDriver driver = new ChromeDriver();

//2. Go to URL
        driver.get(url);
        Thread.sleep(3000); // добавляем паузу на 3 сек до закрытия браузура
        // мы проимпортировали sleep и в класс добавилась строка throws InterruptedException

//3. Actual result = Get web Page URL
        String actualResult = driver.getCurrentUrl();

// ASSERT

//4. Assert URL

        Assert.assertEquals(actualResult, expectedResult);

        driver.close();
        driver.quit();






    }
}
