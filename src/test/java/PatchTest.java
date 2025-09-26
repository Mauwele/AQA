import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PatchTest {
    @Test
    public void testPatchRequest() {
        String payload = "This is expected to be sent back as part of response body.";

        given()
                .baseUri("https://postman-echo.com")
                .body(payload)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(payload));
    }
}
