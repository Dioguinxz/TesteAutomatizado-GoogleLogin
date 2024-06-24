package PageTestesFalhos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNomeFalho {
    static WebDriver driver;

    public CadastroNomeFalho(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherNomeFalho() {
        WebElement nome = driver.findElement(By.id("firstName"));
        nome.sendKeys("1425893");

        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("Cardoso");

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

    }

    public String validarMensagemNome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("*//span[contains(text(), 'Tem certeza de que inseriu seu nome corretamente?')]")));


        return driver.findElement
                (By.xpath("*//span[contains(text(), 'Tem certeza de que inseriu seu nome corretamente?')]")).getText();
    }


}