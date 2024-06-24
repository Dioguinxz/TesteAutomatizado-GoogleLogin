package PageTestesFalhos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroEmailFalho {
    static WebDriver driver;

    public CadastroEmailFalho(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherEmailFalho() {
        WebElement inputEmail = driver.findElement(By.name("Username"));
        inputEmail.sendKeys("25478266");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String validarMensagemEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(text(), 'Os nomes de usuário com no mínimo oito caracteres devem incluir no mínimo um caractere alfabético (a - z)')]")));

        return driver.findElement(
                By.xpath("//div[contains(text(), 'Os nomes de usuário com no mínimo oito caracteres devem incluir no mínimo um caractere alfabético (a - z)')]")).getText();
    }
}
