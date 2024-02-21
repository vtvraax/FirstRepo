package productRepo.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import productRepo.apiObjects.CadastrarObject;
import productRepo.apiObjects.RemoverObject;

public class ConsultarProdutosTest {

	private Response response = RestAssured.get("http://localhost:8083/api/produtos");

	@AfterEach
	void tearDown() {
		RemoverObject.removerProduto("1");

	}

	@Test
	public void listaVaziaTest() {

		assertTrue(response.asString().contains("vazia"));

	}

	@Test
	public void listaTest() {
		String produto = "Iphone 13 pro max";
		response = CadastrarObject.cadastrarProdutoObject(produto, "100.0");
		assertEquals(200, response.statusCode());

	}
}
