package thetestingacdamy.payloads.pojos;

public class BookingResponse {

    public Integer getBookingID() {
        return BookingID;
    }

    public void setBookingID(Integer bookingID) {
        BookingID = bookingID;
    }

    public Integer getBooking() {
        return Booking;
    }

    public void setBooking(Integer booking) {
        Booking = booking;
    }

    private Integer BookingID;
    private Integer Booking;


}
