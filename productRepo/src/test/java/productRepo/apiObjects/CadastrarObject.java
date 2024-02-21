package productRepo.apiObjects;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CadastrarObject {

	private static Response response;
	private static RequestSpecification request;
	private static JSONObject json;
	
	public static Response cadastrarProdutoObject(String nome, String preco) {
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
		json = new JSONObject();
		json.put("nome", nome);
		json.put("preco", preco);
		request.body(json.toJSONString());
		response = request.post("http://localhost:8083/api/produtos");
		return response;
	} 

}
