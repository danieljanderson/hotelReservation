package model;

import java.util.Date;

public class Room implements IRoom {
    // TODO  It will need to take a customer (which is going to be an object/class
    // It will take the type which is an enom
    // TODO It will room number.
    // TODO It will take a cost
    // TODO and it will take a date that its occupied which is a object
    private Customer customer;
    private String roomNumber;
    private Double roomPrice;
    private RoomType roomType;
    private Date checkedIn;
    private Date checkOut;
    private boolean free;
    public Room(Customer customer,String roomNumber, Double roomPrice, RoomType roomType,Date checkedIn, Date checkOut, boolean free){
        this.customer = customer;
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.roomType = roomType;
        this.checkedIn = checkedIn;
        this.checkOut = checkOut;
        this.free = free;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Date getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Date checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +
                "customer=" + customer +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomType=" + roomType +
                ", checkedIn=" + checkedIn +
                ", checkOut=" + checkOut +
                ", free=" + free +
                '}';
    }
}
