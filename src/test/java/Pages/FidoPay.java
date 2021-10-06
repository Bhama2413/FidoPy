package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

// //a[@title='View Details - iPhone 13']

public class FidoPay {
    WebDriver driver;
    By Shop =By.xpath("//*[@class='o-navLinkList']/li/a/span[2]");
    By Phones =By.xpath("//*[@class='o-headerNavDropdown -opened']/li[1]/a");
    By Details = By.xpath("//a[@title='View Details - iPhone 13']");
    By GetStarted =By.id("trident-cta-nac");
    By Plan =By.xpath("//button[@title='Build your plan']/span");
    @BeforeSuite
    public void setUp()
    {
        String ProjDir = System.getProperty("user.dir");
        System.setProperty
                ("webdriver.chrome.driver", ProjDir + "/src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.fido.ca/");
    }
    @Test
    public void tc1()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Shop)).click().pause(1000).build().perform();
        actions.moveToElement(driver.findElement(Phones)).click().pause(5000).build().perform();
        actions.moveToElement(driver.findElement(Details)).click().pause(3000).build().perform();
        actions.moveToElement(driver.findElement(GetStarted)).click().pause(3000).build().perform();
        actions.moveToElement(driver.findElement(Plan)).click().pause(3000).build().perform();

    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
