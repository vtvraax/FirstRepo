package productRepo.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import productRepo.apiObjects.AtualizarObject;

public class AtualizarProdutosTest {
	
	Response response;
	
	@Test
	public void atualizarProduto() {
		
		AtualizarObject.atualizarProdutos("Iphone 15 pro max", "15000.0", "1");
		assertTrue(response.asString().contains("Iphone 15 pro max"));
		assertEquals(200, response.getStatusCode());
		
	}
	

}
