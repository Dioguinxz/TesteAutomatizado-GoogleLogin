package PageTestesFalhos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNumeroFalho {
    static WebDriver driver;

    public CadastroNumeroFalho(WebDriver driver) {
        this.driver = driver;

    }

    public void preencherNumeroFalho() {
        WebElement numero = driver.findElement(By.id("phoneNumberId"));
        numero.sendKeys("55555555555555");

        WebElement botaoProxima = driver.findElement(By.xpath("*//span[contains(text(), 'Próxima')]"));
        botaoProxima.click();
    }

    public String validarMensagemTelefone() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath
                        ("//div[contains(text(), 'Este formato de número de telefone não é válido. Verifique o país e o número.')]")));

        return driver.findElement(By.xpath
                ("//div[contains(text(), 'Este formato de número de telefone não é válido. Verifique o país e o número.')]")).getText();

    }

}

