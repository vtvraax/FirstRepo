package productRepo.apiObjects;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AtualizarObject {

	private static Response response;
	private static RequestSpecification request;
	private static JSONObject json;

	public static Response atualizarProdutos(String nome, String preco, String id) {
		request = RestAssured.given();
		request.header("Content-type", "application/json");
		json = new JSONObject();
		request.body(json.toString());
		json.put("nome", nome);
		json.put("preco", preco);
		response = RestAssured.get("http://localhost:8083/api/produtos"+ id +"");
		return response;

	}

}
