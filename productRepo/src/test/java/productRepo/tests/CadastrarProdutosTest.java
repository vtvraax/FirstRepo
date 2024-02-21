package productRepo.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import productRepo.apiObjects.CadastrarObject;
import productRepo.apiObjects.RemoverObject;

public class CadastrarProdutosTest {

	Response response;
	
	@AfterEach
	public void tearDown() {
		RemoverObject.removerProduto("1");
		
	}
	
	
	@Test
	public void cadastrar() {
		
		response = CadastrarObject.cadastrarProdutoObject("Iphone", "300.00");
		assertEquals(200, response.getStatusCode());
		assertTrue(response.asString().contains("Iphone"));

	}

}
