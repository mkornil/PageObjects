package Tests;

import Pages.HomePage;
import Pages.Rodo;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchingTests {
    WebDriver driver;
    private HomePage homePage;
    private Rodo rodo;

    @BeforeClass
    public static void before(){
        System.setProperty("webdriver.chrome.driver", "/Users/Marek/IdeaProjects/AllegroTest/src/test/java/resources/chromedriver");
    }

    @Before
    public void setup(){
        this.driver = new ChromeDriver();
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        this.rodo = PageFactory.initElements(this.driver, Rodo.class);

    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void searchingDataInSearchFieldWhenUsersAgrees() {
        homePage.goToHomePage();
        rodo.agreeMessage();

    }
}
