package PageTestesFalhos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroSenhaCaractereFalho {
    static WebDriver driver;

    public CadastroSenhaCaractereFalho(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherSenhaFalha(){
        WebElement password = driver.findElement(By.name("Passwd"));
        password.sendKeys("abc");

        WebElement confirmPassword = driver.findElement(By.name("PasswdAgain"));
        confirmPassword.sendKeys("abc");

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String validarMensagemSenha(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(), 'Use 8 caracteres ou mais para sua senha')]")));

        return driver.findElement(By.xpath
                ("//span[contains(text(), 'Use 8 caracteres ou mais para sua senha')]")).getText();
    }

}
