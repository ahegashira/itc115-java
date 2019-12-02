package tickets;

public class TicketMain {

	public static void main(String[] args) {
		
		WalkupTicket t1 = new WalkupTicket();
		System.out.print(t1);
		
		System.out.println();
		
		WalkupTicket t2 = new WalkupTicket();
		System.out.print(t2);

		System.out.println();
		
		WalkupTicket t3 = new WalkupTicket();
		System.out.print(t3);
		
		System.out.println();
		
		System.out.print(t2.getTicketPrice());

	}
}
