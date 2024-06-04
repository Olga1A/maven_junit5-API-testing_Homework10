package API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiDeliveryTest {

    public static final String BASE_URL = "https://backend.tallinn-learning.ee";
    public static final String BASE_PATH = "/test-orders/";

    @Test
    public void deleteAnExistingOrder(){
        int orderIDRequested = 9;
    RestAssured
            .given()
            .log()
            .all()
            .delete(BASE_URL+BASE_PATH+orderIDRequested)
            .then()
            .log()
            .all()
            .assertThat()
            .statusCode(HttpStatus.SC_BAD_REQUEST);
    }

    @Test
    public void updateAnExistingOrderDetails(){
        RestAssured
                .given()
                .log()
                .all()
                .put(BASE_URL+BASE_PATH+"2")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST);
    }

    @Test
    public void getCustomerNameWithParameter(){
        int orderIDRequested = 1;
        String amendedOrderDetails = RestAssured
                .given()
                .log()
                .all()
                .queryParam("customerName")
                .get(BASE_URL+BASE_PATH+orderIDRequested)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract()
                .path("customerName");

        Assertions.assertEquals("Connor",amendedOrderDetails);
    }

    @Test
    public void checkOrderAndResponse(){
        int orderIDRequested = 5;
        int recivedOrderId = RestAssured
                .given()
                .log()
                .all()
                .get(BASE_URL+BASE_PATH+orderIDRequested)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract()
                .path("id");

        Assertions.assertEquals(orderIDRequested,recivedOrderId);
    }

    @Test
    public void checkOrderCreationId(){
        String requestBodyLongWay ="{\n" +
                "  \"status\": \"OPEN\",\n" +
                "  \"courierId\": 0,\n" +
                "  \"customerName\": \"0\",\n" +
                "  \"customerPhone\": \"0\",\n" +
                "  \"comment\": \"0\",\n" +
                "  \"id\": 0\n" +
                "}";

        long recivedOrderId = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBodyLongWay)
                .log()
                .all()
                .post(BASE_URL+BASE_PATH)
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .and()
                .extract()
                .path("id");

  //      Assertions.assertEquals(recivedOrderId);
    }
    }



