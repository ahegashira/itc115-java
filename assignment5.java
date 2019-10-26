/* 
This program takes two integers representing the month and day in a date and returns the season of that date.
i.e. season(6, 15); will return "Spring"

By Hiro Egashira on 10/26/2019
*/

public static String season(int month, int day) {
    String currentSeason = "";
    if ((month == 12 && day > 15) || (month == 1 || month == 2) || (month == 3 && day < 16)) {
       currentSeason = "Winter"; 
    } 
    else if 
       ((month == 3 && day > 15) || (month == 4 || month == 5) || (month == 6 && day < 16)) {
       currentSeason = "Spring";
    } 
    else if 
       ((month == 6 && day > 15) || (month == 7 || month == 8) || (month == 9 && day < 16)) {
       currentSeason = "Summer";
    } 
    else if
       ((month == 9 && day > 15) || (month == 10 || month == 11) || (month == 12 && day < 16)) {
       currentSeason = "Fall";
    }   
    return currentSeason;
}

season(6, 15);    //should return "Spring"
season(9, 16);    //should return "Fall"
