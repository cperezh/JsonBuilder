package org.springframework.webflow.samples.booking;

import org.springframework.stereotype.Component;

@Component
public class CarlosServiceImpl implements CarlosService{

	@Override
	public Booking getBooking() {
		Booking booking;
		
		booking = new Booking();
		
		booking.setBeds(10);
		
		
		return booking;
	}

}
