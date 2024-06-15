package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroIdade {

    static WebDriver driver;

    public CadastroIdade(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherDados(){
        WebElement day = driver.findElement(By.id("day"));
        day.sendKeys("03");

        WebElement month = driver.findElement(By.id("month"));
        month.sendKeys("Fevereiro");

        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("2005");

        WebElement gender = driver.findElement(By.id("gender"));
        gender.sendKeys("Homem");

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//span[contains(text(), 'Como você fará o login')]")));



    }

}
