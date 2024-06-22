package TestesFalhos;

import PageTestesFalhos.CadastroEmailFalho;
import Pages.CadastroIdade;
import Pages.CadastroNome;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroEmailFalhoTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmailFalho cadastroEmailFalho;

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmailFalho = new CadastroEmailFalho(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherDados();
        assertEquals(cadastroEmailFalho.validarMensagemEmail(), "Os nomes de usuário com no mínimo oito caracteres devem incluir no mínimo um caractere alfabético (a - z)");
    }

}
