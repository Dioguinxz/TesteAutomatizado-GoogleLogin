package TestesFalhos;

import PageTestesFalhos.CadastroIdadeFalho;
import Pages.CadastroNome;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroIdadeFalhoTest {
    static WebDriver driver;
    static CadastroIdadeFalho cadastroIdadeFalho;
    static CadastroNome cadastroNome;

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Programação\\TestesAutomatizados\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);
        cadastroIdadeFalho = new CadastroIdadeFalho(driver);

        cadastroNome.preencherCampo();
        cadastroIdadeFalho.preencherIdadeFalho();
        assertEquals(cadastroIdadeFalho.validarMensagemIdade(), "Insira uma data válida");
    }

}
