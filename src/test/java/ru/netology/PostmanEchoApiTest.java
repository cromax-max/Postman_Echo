package ru.netology;

import io.restassured.mapper.ObjectMapperType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoApiTest {

    @Test
    void shouldCompareBodyValue() {
        given()
            .baseUri("https://postman-echo.com")
            .body("value")
        .when()
            .post("/post")
        .then()
            .statusCode(200)
            .body("data", equalTo("value"))
        ;

    }
}
