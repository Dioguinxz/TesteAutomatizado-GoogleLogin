package PageTestesFalhos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroSenhaFalha {
    static WebDriver driver;

    public CadastroSenhaFalha(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherSenhaFalha(){
        WebElement password = driver.findElement(By.name("Passwd"));
        password.sendKeys("pedro@21$%");

        WebElement confirmPassword = driver.findElement(By.name("PasswdAgain"));
        confirmPassword.sendKeys("dfddfdfdw&&#@");

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
    }

    public String validarMensagemSenha(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(), 'As senhas não são iguais. Tente novamente.')]")));

        return driver.findElement(By.xpath("//span[contains(text(), 'As senhas não são iguais. Tente novamente.')]")).getText();
    }
}
