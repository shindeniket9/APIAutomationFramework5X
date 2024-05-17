package thetestingacdamy.tests.crud;

import io.restassured.RestAssured;
import org.eclipse.sisu.Description;
import org.testng.annotations.Test;
import thetestingacdamy.base.BaseTest;
import thetestingacdamy.endpoints.APIConstatns;
import thetestingacdamy.modules.PayloadManger;

public class TC_CreateBooking extends BaseTest {

    @Test
    public void testpositivePOSTreq(){
        requestSpecification.baseUri(APIConstatns.baseURL).basePath(APIConstatns.Create_Update_Booking_URL);
        response = RestAssured.given().spec(requestSpecification)
                .when().body(payloadManger.creatPayload()).post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
    }
}
