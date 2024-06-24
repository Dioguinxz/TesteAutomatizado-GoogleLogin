package TestesFalhos;

import PageTestesFalhos.CadastroNumeroFalho;
import Pages.CadastroEmail;
import Pages.CadastroIdade;
import Pages.CadastroNome;
import Pages.CadastroSenha;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CadastroNumeroFalhoTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenha cadastroSenha;
    static CadastroNumeroFalho cadastroNumeroFalho;

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\Programação\\TestesAutomatizados\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmail = new CadastroEmail(driver);
        cadastroSenha = new CadastroSenha(driver);
        cadastroNumeroFalho = new CadastroNumeroFalho(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherDados();
        cadastroEmail.preecherDadosEmail();
        cadastroSenha.preencherPassword();
        cadastroNumeroFalho.preencherNumeroFalho();
        assertEquals(cadastroNumeroFalho.validarMensagemTelefone(), "Este formato de número de telefone não é válido. Verifique o país e o número.");
    }



}
