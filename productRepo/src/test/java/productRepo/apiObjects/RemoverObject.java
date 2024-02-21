package productRepo.apiObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RemoverObject {

	private static Response response;

	public static Response removerProduto(String id) {

		String endPoint = "http://localhost:8083/api/produtos" + id + "";
		return response = RestAssured.delete(endPoint);
	}

}
