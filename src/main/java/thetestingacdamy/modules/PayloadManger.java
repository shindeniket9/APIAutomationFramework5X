package thetestingacdamy.modules;

import com.google.gson.Gson;
import thetestingacdamy.payloads.pojos.Booking;
import thetestingacdamy.payloads.pojos.BookingDates;

public class PayloadManger {

    public String creatPayload(){

        Booking booking = new Booking();
        booking.setFirstname("Ferrari");
        booking.setLastname("Brown");
        booking.setToalprice("111");
        booking.setDepositpaid("true");

        BookingDates bookingDates = new BookingDates();
        bookingDates.setChekin("2018-01-01");
        bookingDates.setChekout("2019-01-01");
        booking.setBookingDates(bookingDates);

        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        //Object - JSON String (GSON);

        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);

        return jsonStringBooking;
    }


    public void updatePayload(){

    }
}
