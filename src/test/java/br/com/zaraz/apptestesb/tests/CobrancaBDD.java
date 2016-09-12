package br.com.zaraz.apptestesb.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.*;

public class CobrancaBDD {
	
	private WebDriver driver;
	private String baseUrl = "http://localhost:8080";
	
	
	
	@Before
    public void setUp() {
		driver = new FirefoxDriver();
		
	}
	
	public CobrancaBDD() {
	}
	  	
	@Dado("^que estou na página de adicionar título$")
	public void paginaAddTitulo() throws Throwable {
		driver.get(baseUrl + "/titulos/novo/");
		Assert.assertEquals("Cadastro de Título", driver.getTitle());
	}
	@Quando("^preencher o formulário$")
	public void preencherFormularioCadastro() throws Throwable{
		driver.findElement(By.id("descricao")).clear();
		driver.findElement(By.id("descricao")).sendKeys("Condominio do AP 102");
		driver.findElement(By.id("dataVencimento")).clear();
		driver.findElement(By.id("dataVencimento")).sendKeys("25/09/2016");
		driver.findElement(By.id("valor")).clear();
		driver.findElement(By.id("valor")).sendKeys("55,55");
		new Select(driver.findElement(By.name("status"))).selectByVisibleText("Pendente");

	}
	
	@Quando("^mandar salvar$")
	public void mandar_salvar() throws Throwable {
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	}

	@Então("^mensagem de sucesso deve ser exibida$")
	public void mensagem_de_sucesso_deve_ser_exibida() throws Throwable {
		try {
			  Assert.assertEquals("Título Adicionado com Sucesso", driver.findElement(By.xpath("//div/span")).getText());

			} catch (Error e) {
			  throw new Exception(e.getMessage());
			}
	}
	
	@After
    public void tearDown() {
        driver.quit();
    }

}
