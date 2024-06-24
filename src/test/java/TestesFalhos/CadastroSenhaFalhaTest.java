package TestesFalhos;

import PageTestesFalhos.CadastroEmailFalho;
import PageTestesFalhos.CadastroSenhaFalha;
import Pages.CadastroEmail;
import Pages.CadastroIdade;
import Pages.CadastroNome;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class CadastroSenhaFalhaTest {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenhaFalha cadastroSenhaFalha;

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Programação\\TestesAutomatizados\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);
        cadastroIdade = new CadastroIdade(driver);
        cadastroEmail = new CadastroEmail(driver);
        cadastroSenhaFalha = new CadastroSenhaFalha(driver);

        cadastroNome.preencherCampo();
        cadastroIdade.preencherDados();
        cadastroEmail.preecherDadosEmail();
        cadastroSenhaFalha.preencherSenhaFalha();
        assertEquals(cadastroSenhaFalha.validarMensagemSenha(), "As senhas não são iguais. Tente novamente.");


    }
}
