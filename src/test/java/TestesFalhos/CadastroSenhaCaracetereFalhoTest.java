package TestesFalhos;

import PageTestesFalhos.CadastroSenhaCaractereFalho;
import PageTestesFalhos.CadastroSenhaFalha;
import Pages.CadastroEmail;
import Pages.CadastroIdade;
import Pages.CadastroNome;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroSenhaCaracetereFalhoTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenhaCaractereFalho cadastroSenhaCaractereFalho;

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Programação\\TestesAutomatizados\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmail = new CadastroEmail(driver);
        cadastroSenhaCaractereFalho= new CadastroSenhaCaractereFalho(driver);


        cadastroNome.preencherCampo();
        cadastroIdade.preencherDados();
        cadastroEmail.preecherDadosEmail();
        cadastroSenhaCaractereFalho.preencherSenhaFalha();
        assertEquals(cadastroSenhaCaractereFalho.validarMensagemSenha(), "Use 8 caracteres ou mais para sua senha");
    }
}
