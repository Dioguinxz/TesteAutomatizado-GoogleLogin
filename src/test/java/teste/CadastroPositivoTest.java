package teste;

import PageTestesFalhos.CadastroNomeFalho;
import Pages.*;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroPositivoTest extends TestCase {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenha cadastroSenha;
    static CadastroNumero cadastroNumero;


    @Test
    public void test() {

        System.setProperty("webdriver.chrome.driver", "C:\\Programação\\TestesAutomatizados\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNome = new CadastroNome(driver);
        cadastroNome.preencherCampo();
        cadastroIdade = new CadastroIdade(driver);
        cadastroIdade.preencherDados();

        cadastroEmail = new CadastroEmail(driver);
        cadastroEmail.preecherDadosEmail();

        cadastroSenha = new CadastroSenha(driver);
        cadastroSenha.preencherPassword();

        cadastroNumero = new CadastroNumero(driver);
        cadastroNumero.preencherNumero();


    }


}