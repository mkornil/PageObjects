package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MojeAllegro;
import Pages.Rodo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;

public class LoginPageTest {
    WebDriver driver;
    private MojeAllegro mojeAllegro;
    private HomePage homePage;
    private Rodo rodo;
    private LoginPage loginPage;

    @BeforeClass
    public static void before(){
        System.setProperty("webdriver.chrome.driver", "/Users/Marek/IdeaProjects/AllegroTest/src/test/java/resources/chromedriver");
    }

    @Before
    public void setup(){
        this.driver = new ChromeDriver();
        this.mojeAllegro = PageFactory.initElements(this.driver, MojeAllegro.class);
        this.rodo = PageFactory.initElements(this.driver, Rodo.class);
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        this.loginPage = PageFactory.initElements(this.driver, LoginPage.class);
    }

    @Test
    public void LoginPageIsDisplayed(){
        homePage.goToHomePage();
        rodo.agreeMessage();
        mojeAllegro.mojeAllegroButtonClick();
        mojeAllegro.setZalogujOnMojeAllegroButtonClick();
        Assert.assertTrue(loginPage.getLogInInput().isDisplayed());

    }
}
