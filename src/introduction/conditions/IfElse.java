package introduction.conditions;

public class IfElse {
    public static void main(String[] args) {
        /*
           if (Condition) {

           } else  if {

           } else {

           }
        * */

        if (true) {

        } else if (false) {

        } else  {

        }

        // variable = (condition) ? expressionTrue : expressionFalse;
        int time = 20;
        String result = (time > 20) ? "Good Day" : "Good evening";
        System.out.println(result);
    }
}
