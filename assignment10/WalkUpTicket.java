package tickets;

public class WalkupTicket extends Ticket {
	
	public double getTicketPrice() {
		return 50.00;
	}
	
	@Override
	public String toString() {
		return "Thank you for your Walkup Ticket purchase!" +
				"\nEnjoy viewing " + eventName +
				"\nYour Ticket Number is: " + getTicketNumber() +
				"\nYou paid: " + getPriceFormatted(getTicketPrice()) +
				"\n\n";
	}
}
