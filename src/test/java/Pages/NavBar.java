package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBar {
    WebDriver driver;

    public NavBar (WebDriver driver) {this.driver = driver;}

    @FindBy(className = "metrum-search__query ")
    private WebElement searchInput;

    public void searchFor (String phrase){
        searchInput.sendKeys(phrase);
        searchInput.submit();
    }
}
