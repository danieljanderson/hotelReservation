package model;

import java.util.Date;

public class Reservation {
    private  Customer customer;
    private IRoom room;
    private Date chackInDate;
    private Date checkOutDate;
    public Reservation( Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        this.customer = customer;
        this.room =room;
        this.chackInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public IRoom getRoom() {
        return room;
    }

    public void setRoom(IRoom room) {
        this.room = room;
    }

    public Date getChackInDate() {
        return chackInDate;
    }

    public void setChackInDate(Date chackInDate) {
        this.chackInDate = chackInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", room=" + room +
                ", chackInDate=" + chackInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }
}
