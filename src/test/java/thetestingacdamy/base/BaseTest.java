package thetestingacdamy.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeMethod;
import thetestingacdamy.actions.AssertActions;
import thetestingacdamy.endpoints.APIConstatns;
import thetestingacdamy.modules.PayloadManger;

public class BaseTest {


    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManger payloadManger;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;

    @BeforeMethod
    public void setConfig(){
        payloadManger = new PayloadManger();
        assertActions = new AssertActions();
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(APIConstatns.baseURL)
                .addHeader("Content-Type","application/json")
                .build().log().all();
    }
}
