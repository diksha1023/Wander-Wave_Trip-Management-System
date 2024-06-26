package app.trip.services;

import java.util.List;

import app.trip.exceptions.BookingException;
import app.trip.exceptions.InvalidCredentialException;
import app.trip.exceptions.UserAlreadyExistsException;
import app.trip.models.Booking;
import app.trip.models.User;

public interface BookingService {
	
	public Booking makeBooking(Booking bookings,Integer ticketId,String authKey) throws BookingException,InvalidCredentialException;
	public Booking cancelBooking(Integer bookingId) throws BookingException;; 
	public List<Booking> viewBookings(Integer userId) throws BookingException;;
	/*
	 * Administrator Access
	 */
	public List<Booking> viewAllBookings(String authKey) throws BookingException;;
}
