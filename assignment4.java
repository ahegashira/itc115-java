/* 
This program takes a string and number and returns the given string repeated the number of times specified.
i.e. repl("Repeater", 5); will return "RepeaterRepeaterRepeaterRepeaterRepeater"

By Hiro Egashira on 10/17/2019
*/


public static String repl(String word, int times) {
    String answer = "";
    for (int i = 1; i <= times; i++) {
        answer = answer + word;
    }
    return answer;
}
