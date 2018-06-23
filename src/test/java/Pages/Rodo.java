package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rodo {

WebDriver driver;

public Rodo (WebDriver driver) {this.driver = driver;}

@FindBy(xpath = "/html/body/div[4]/div/div[2]/div")
    public WebElement rodoMessageWindow;

@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/button/svg[2]/image")
    public WebElement closeRodoMessageWindowButton;

@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/button")
    public WebElement dissagreRodoMessageWindowButton;

@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/button")
    public WebElement agreeRodoMessageButton;

public void agreeMessage(){
    agreeRodoMessageButton.click();
}
}
