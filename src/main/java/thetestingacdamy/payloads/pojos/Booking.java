package thetestingacdamy.payloads.pojos;

public class Booking {

    private String firstname;
    private String lastname;
    private String toalprice;
    private String depositpaid;
    private String additionalneeds;


    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public String Additionalneeds() {
        return additionalneeds;
    }

    public void setDepositpaid(String depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getdepositpaid() {
        return depositpaid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setToalprice(String toalprice){
        this.toalprice=toalprice;
    }

    public String getToalprice(){
        return toalprice;
    }


    private BookingDates bookingDates;

    public BookingDates getBookingDates(){
        return bookingDates;
    }

    public void setBookingDates(BookingDates bookingDates){
        this.bookingDates=bookingDates;
    }

}
