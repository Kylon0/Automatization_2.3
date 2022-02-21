package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanApiTest {
    @Test
    void testOne() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("sodata"))
        ;
    }
}
