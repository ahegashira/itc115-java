// This program takes a students name, number of grades, and percent score of each grade and computes the gpa. 
// ie. Enter records: Hiro 3 87 92 100 //returns 93.0
//
// By Hiro Egashira on 10/26/2019


public static void printGPA() {
		    Scanner console = new Scanner(System.in);
		    int counter = 0;
		    double scoresTotal = 0;
		    

		    System.out.print("Enter a student record: ");
		    String name = console.next();
		    int numScores = console.nextInt();
		    double finalGrade = 0;
		    
		    while (counter < numScores) {
		        double getScore = console.nextDouble();
		        scoresTotal = scoresTotal + getScore;
		        counter++;
		    }
		    finalGrade = scoresTotal/numScores;
		    System.out.print(name + "'s grade is " + finalGrade);
		console.close();
	}
  
  printGPA();
  Enter a student record: Hiro 3 86 92 100   //returns 92.6666666667
