package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ReservationService {
    Set<Reservation> reservationsSet = new HashSet<Reservation>();
    public static void addRoom (IRoom room){

    }
    public IRoom getARoom(String roomID){

        return null;
    }
    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){

        return null;
    }
    public Collection<IRoom> findRooms (Date checkInDate, Date checkOutDate){

        return null;
    }
    public Collection <Reservation> getCustomersReservation(Customer customer){

        return null;
    }
    public void printAllReservation(){

    }

}

