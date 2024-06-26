package TestesFalhos;

import PageTestesFalhos.CadastroNomeFalho;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastrosNomeFalhoTest extends TestCase {

    static WebDriver driver;
    static CadastroNomeFalho cadastroNomeFalho;


    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Programação\\TestesAutomatizados\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNomeFalho = new CadastroNomeFalho(driver);

        cadastroNomeFalho.preencherNomeFalho();
        assertEquals(cadastroNomeFalho.validarMensagemNome(),
                "Tem certeza de que inseriu seu nome corretamente?");
    }


}