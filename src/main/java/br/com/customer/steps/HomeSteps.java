package br.com.customer.steps;

import br.com.customer.funcionalidade.HomeFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class HomeSteps {
	
	HomeFuncionalidade home = new HomeFuncionalidade();
	
	@Dado("que entro no app")
	public void que_entro_no_app() {
      home.isHome();
	}

	@Entao("visito a tela home")
	public void visito_a_tela_home() {
		home.isHome();
	}

}
