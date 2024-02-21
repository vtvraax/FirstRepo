package productRepo.apiObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ConsultarObject {

	private static Response response;

	public static Response consultarProduto() {

		String endPoint = ("http://localhost:8083/api/produtos");
		return response = RestAssured.get(endPoint);

	}

}
