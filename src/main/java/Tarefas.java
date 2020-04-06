import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.FormLoginPage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.NewTaskPage;
import pages.SignUpFormPage;
import pages.SignUpPage;
import suport.End;
import suport.Generator;
import suport.Web;
import suport.captura;

public class Tarefas {
	private WebDriver driver;

	@Before
	public void iniciar() {
		driver = Web.setupChrome();
	}

	@Dado("^que acesso a tela de cadastro$")
	public void queAcessoATelaDeCadastro() throws Throwable {
		new SignUpPage(driver).clicarsignup();
	}

	@Quando("^informo dados de cadastro$")
	public void informoDadosDeCadastro() throws Throwable {
		new SignUpFormPage(driver).digitarDadosCadastro();
		captura.capturatela(driver, "Report\\Capturas\\Cenario 1 - " + Generator.datetime() + ".png");
	}

	@Quando("^clico em salvar$")
	public void clicoEmSalvar() throws Throwable {
		new SignUpFormPage(driver).clickSalvar();
	}

	@Entao("^visualizo a tela incial$")
	public void visualizoATelaIncial() throws Throwable {
		new LogoutPage(driver).CheckLogout();
		captura.capturatela(driver, "Report\\Capturas\\Cenario 1 - " + Generator.datetime() + ".png");
	}

	@Dado("^que acesso a tela de login$")
	public void queAcessoATelaDeLogin() throws Throwable {
		new LoginPage(driver).clicarsignin();
	}

	@Quando("^informo os dados de login$")
	public void informo_os_dados_de_login() throws Throwable {
		new FormLoginPage(driver).digitarDados("luisachristoni", "123456");
	}

	@Entao("^visualizo a tela inicial$")
	public void visualizoATelaInicial() throws Throwable {
		new LogoutPage(driver).CheckLogout();
		captura.capturatela(driver, "Report\\Capturas\\Cenario 2 - " + Generator.datetime() + ".png");
	}

	@Dado("^que estou logado$")
	public void queEstouLogado() throws Throwable {
		new LoginPage(driver).clicarsignin();
		new FormLoginPage(driver).digitarDados("luisachristoni", "123456");
		new LogoutPage(driver).CheckLogout();
	}

	@Quando("^adiciono uma nova tarefa$")
	public void adicionoUmaNovaTarefa() throws Throwable {
		new NewTaskPage(driver).criarTask();
	}

	@Entao("^consigo visualizar a tarefa criada$")
	public void consigoVisualizarATarefaCriada() throws Throwable {
		new NewTaskPage(driver).checkTask();
	}

	@After
	public void finalizar() {
		End.finalizaChrome(driver);
	}

}
