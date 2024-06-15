package teste;

import Pages.CadastroEmail;
import Pages.CadastroIdade;
import Pages.CadastroNome;
import Pages.CadastroSenha;
import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroNomeTest extends TestCase {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenha criarSenha;

//    @Before
//    public void setUp() throws Exception {
//
//    }

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNome = new CadastroNome(driver);
        cadastroNome.preencherCampo();

        cadastroIdade = new CadastroIdade(driver);
        cadastroIdade.preencherDados();

        cadastroEmail = new CadastroEmail(driver);
        cadastroEmail.preecherDadosEmail();

        criarSenha = new CadastroSenha(driver);
        criarSenha.preencherPassword();



    }

}