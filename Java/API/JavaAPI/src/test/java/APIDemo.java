import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APIDemo {
    @Test(description = "First API test")
    public void swaggerTest(){
        RestAssured.baseURI="https://64.227.160.186:8080";
    }
}
