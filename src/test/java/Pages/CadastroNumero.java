package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNumero {
    static WebDriver driver;

    public CadastroNumero(WebDriver driver) {
        this.driver = driver;

    }

    public void preencherNumero() {
        WebElement numero = driver.findElement(By.id("phoneNumberId"));
        numero.sendKeys("(48) 996726746");

        WebElement botaoProxima = driver.findElement(By.xpath("*//span[contains(text(), 'Próxima')]"));
        botaoProxima.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(), 'Digite o código')]")));
    }

}
