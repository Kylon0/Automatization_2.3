package ru.netology.test;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

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
                .body("foo1", equalTo("bar1"))
        ;
    }
}
