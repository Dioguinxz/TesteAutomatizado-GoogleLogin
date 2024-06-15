package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroEmail {
    static WebDriver driver;

    public CadastroEmail(WebDriver driver) {
        this.driver = driver;
    }

    public void preecherDadosEmail() {
        WebElement inputEmail = driver.findElement(By.name("Username"));
        inputEmail.sendKeys("diogoNovoaaaaaaaaa");

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(), 'Crie uma senha forte')]")));
    }

}
