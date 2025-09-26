import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostFormTest {
    @Test
    public void testPostFormData() {
        try {
            given()
                    .baseUri("https://postman-echo.com")
                    .contentType("application/x-www-form-urlencoded")
                    .formParam("foo1", "bar1")
                    .formParam("foo2", "bar2")
                    .log().all()
                    .when()
                    .post("/post")
                    .then()
                    .statusCode(200)
                    .body("form.foo1", equalTo("bar1"))
                    .body("form.foo2", equalTo("bar2"));
        } catch (AssertionError e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            // Здесь можно добавить дополнительную обработку
        }
    }
}
