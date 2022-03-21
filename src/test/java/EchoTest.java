import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class EchoTest {

    @Test
    void shouldPostSomeData() {
        given()

                .baseUri("https://postman-echo.com")
                .body("Welcome")

                .when()
                .post("/post")

                .then()

                .statusCode(200)
                .body("data", equalTo("Welcome"))
        ;
    }

    @Test
    void shouldPostSomeInteger() {
        given()

                .baseUri("https://postman-echo.com")
                .body("142536")

                .when()
                .post("/post")

                .then()

                .statusCode(200)
                .body("data", equalTo("142536"))
        ;
    }

    @Test
    void shouldPostSomeIntegerAndString() {
        given()

                .baseUri("https://postman-echo.com")
                .body("R2D2")

                .when()
                .post("/post")

                .then()

                .statusCode(200)
                .body("data", equalTo("R2D2"))
        ;
    }


}
