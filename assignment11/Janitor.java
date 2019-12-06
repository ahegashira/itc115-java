// Building Java Programs, 4th Ed.
// Chapter 9, Exercise 2
// Hiro Egashira on 12-6-2019

// Write a class Janitor to accompany the other law firm classes described in this chapter. 
// Janitors work twice as many hours per week as other employees (80 hours/week), they make 
// $30,000 ($10,000 less than general employees), they get half as much vacation as other 
// employees (only 5 days), and they have an additional method clean that prints "Workin' for 
// the man." Make sure to interact with the superclass as appropriate.


public class Janitor extends Employee {
    
    public int getHours() {
        return (super.getHours() * 2);
    }
    
    public double getSalary() {
        return super.getSalary() -10000;
    }
    
    public int getVacationDays() {
        return super.getVacationDays()/2;
    }
    
    public void clean() {
        System.out.print("Workin' for the man.");
    }

}
