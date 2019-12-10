package library;

import java.time.LocalDate;

public interface Item {
	public String title();
	public String authName();
	public String publisher();
	public int isbn(); 
	public LocalDate dueDate();
	public boolean reserved();
	public boolean checkedIn();
	public double finesAccrued();
}
