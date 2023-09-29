package PackageDefault;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PerfilTest {

	@Test
	public void verificaPagamento() {
		//Arrange
		Perfil perfil = new Perfil(false);
		Perfil perfil2 = new Perfil(true);
		
		//Action
		perfil.verificarPagamento();
		perfil2.verificarPagamento();
		
		//Assert
		Assert.assertEquals("Pagamento pendente. Realize o pagamento para acessar os cursos.", perfil.verificarPagamento());
		Assert.assertEquals("Cursos liberados", perfil2.verificarPagamento());
		
	}
	
	@Test
	public void visualizarCursos() {
        List<String> cursos = new ArrayList<>();

        //Arrange
		Perfil perfil = new Perfil(false);
		
		//Action
		perfil.visualizarCursos();
		
		//Assert
		Assert.assertEquals(cursos, perfil.visualizarCursos());

	}
	
	@Test
	public void visualizarQtdCursos() {
		
		//Arrange
		Perfil perfil = new Perfil(false);
		
		//Action
		perfil.cursosQuantidade();
		
		//Assert
		Assert.assertEquals(0, perfil.cursosQuantidade());
		
	}

}
