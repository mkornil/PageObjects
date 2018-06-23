package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MojeAllegro {

    WebDriver driver;

    public MojeAllegro(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[3]/div[3]/nav/div[1]/div/div[2]/div[3]/button/span[1]")
    private WebElement mojeAllegroButton;

    public void mojeAllegroButtonClick (){
        mojeAllegroButton.click();
    }

    @FindBy(xpath = "/html/body/div[3]/div[3]/nav/div[1]/div/div[2]/div[3]/div/div[5]/a[1]")
    private WebElement zalogujOnMojeAllegroButton;

    public void setZalogujOnMojeAllegroButtonClick (){
        zalogujOnMojeAllegroButton.click();
    }

}
