package br.com.customer.steps;

import org.junit.Assert;
import br.com.customer.funcionalidade.HomeFuncionalidade;
import br.com.customer.funcionalidade.InsertClientsFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class InsertClientsSteps {
	
	HomeFuncionalidade home = new HomeFuncionalidade();
	InsertClientsFuncionalidade insertclients = new InsertClientsFuncionalidade();
	
	@Dado("clico no menu adicionar")
	public void clico_no_menu_adicionar() {
		home.isHome();
	    home.clickAdd();
	}

	@Quando("preencho os dados {string} e {string} e {string} e {string} e {string} e {string}")
	public void preencho_os_dados_e_e_e_e_e(String name, String phone, String email, String cpf, String description, String comments) {
		insertclients.writeName(name);
		insertclients.writePhone(phone);
		insertclients.writeEmail(email);
		insertclients.writeCPF(cpf);
		insertclients.writeDescription(description);
		insertclients.clickCalendarButton();
		insertclients.clickButtonOk();
		insertclients.writeComments(comments);
		insertclients.clickSave();
		
	}

	@Entao("o cliente e inserido com sucesso e o {string} esta correto")
	public void o_cliente_e_inserido_com_sucesso_e_o_esta_correto(String name) {
	    String getNome = home.getTextViewNome();
	    Assert.assertEquals(name, getNome);
	   
	}

}
