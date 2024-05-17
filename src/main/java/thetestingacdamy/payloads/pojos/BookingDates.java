package thetestingacdamy.payloads.pojos;

public class BookingDates {

    private String chekin;
    private String chekout;

    public void setChekin(String chekin){
        this.chekin=chekin;
    }

    public String getChekin(){
        return chekin;
    }

    public void setChekout(String chekout){
        this.chekout=chekout;
    }

    public String getChekout(){
        return chekout;
    }
}
