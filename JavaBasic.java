import java.lang.Math;

class JavaBasic {

    private static void helloworld() {
        /* print the code */
        System.out.println("Hello World");
    }

    private static void string() {
        /* string and methods */
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int len = txt.length(); // string length
        txt = txt.toUpperCase();
        txt.toLowerCase();

        // method returns the index (the position) of the first occurrence of a
        // specified text in a string (including whitespace)
        int index = txt.indexOf("locate");

        String firstName = "usain", lastName = "bolt";
        firstName.concat(lastName); // method to concatenate two strings (space will be added in between
                                    // automatically)

        // escape character
        // \' => ' , \" => " , \\ => \

        String x = "10";
        int y = 20;
        String z = x + y; // z will be 1020 (a String)
    }

    private static void math() {
        int a = Math.max(5, 10); // to find the highest value of x and y
        int b = Math.min(5, 10);
        double c = Math.sqrt(64);

        double d = Math.abs(-4.7); // returns the absolute (positive) value of x

        double e = Math.random(); // returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        int randomNum = (int) (Math.random() * 101); // you only want a random number between 0 and 100
    }

    private static void sswitch() {
        // eg.
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        /*
         * When Java reaches a break keyword, it breaks out of the switch block.
         * 
         * This will stop the execution of more code and case testing inside the block.
         * 
         * When a match is found, and the job is done, it's time for a break. There is
         * no need for more testing.
         */
    }

    private static void array() {

        // To declare an array, define the variable type with square brackets.
        int[] myNum = { 10, 20, 30, 40 };
        int size = myNum.length;

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
    }

    public static void main(String[] args) {
        helloworld();
        string();
        math();
        sswitch();

        // ternary operator: variable = (condition) ? expressionTrue : expressionFalse;

    }
}