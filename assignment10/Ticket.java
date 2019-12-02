package tickets;

import java.text.NumberFormat;

public class Ticket {
	public String eventName = "Campus Event";
	private static int ticketNumber = 1000;
	public double ticketPrice;
	
	
	// Formatted output of price
	
	public String getPriceFormatted(double ticketPrice) {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(ticketPrice);
        return formattedPrice;
    }

	@Override
	public String toString() {
		return "Thank you for your purchase!" +
				"\nEnjoy viewing " + eventName +
				"\nYour Ticket Number is: " + ticketNumber +
				"\nYou paid: " + getPriceFormatted(ticketPrice) +
				"\n\n";
	}

	// Getters & Setters
	public int getTicketNumber() {
		return ++ticketNumber;
	}
	
	public void setTicketNumber(int ticketNumber) {
		Ticket.ticketNumber = ticketNumber;
	}
	
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
}

