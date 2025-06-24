public class Program4 {
    

    
    public static void main(String[] args) {
        System.out.println("--- Easy Questions ---");
        easyQuestions();

        System.out.println("\n--- Medium Questions ---");
        mediumQuestions();

        System.out.println("\n--- Critical Questions ---");
        criticalQuestions();
    }

    public static void easyQuestions() {
        // Q1: What is the value of 'result1'?
        int result1 = 10 + 5 * 2;
        System.out.println("Q1 Result: " + result1);//20

        // Q2: What is the value of 'result2'?
        int result2 = 20 / 3;
        System.out.println("Q2 Result: " + result2);//6

        // Q3: What is the value of 'result3' (remainder)?
        int result3 = 20 % 3;
        System.out.println("Q3 Result: " + result3);//2

        // Q4: What is the final value of 'a'?
        int a = 5;
        a++;
        System.out.println("Q4 Result: " + a);

        // Q5: What is the final value of 'b'?
        int b = 10;
        b -= 3; // Same as b = b - 3
        System.out.println("Q5 Result: " + b);
    }

    public static void mediumQuestions() {
        // Q1: What is the value of 'result1'?
        double result1 = 20 / 3;
        System.out.println("Q1 Result (double): " + result1);

        // Q2: What is the value of 'result2'?
        double result2 = 20.0 / 3;
        System.out.println("Q2 Result (double literal): " + result2);

        // Q3: What are the values of 'x' and 'y'?
        int x = 5;
        int y = ++x; // Pre-increment
        System.out.println("Q3 Result: x=" + x + ", y=" + y);

        // Q4: What are the values of 'm' and 'n'?
        int m = 5;
        int n = m++; // Post-increment
        System.out.println("Q4 Result: m=" + m + ", n=" + n);

        // Q5: What is the value of 'result5'?
        int result5 = 10 + (8 / 2) * 3 - 1;
        System.out.println("Q5 Result: " + result5);
    }

    public static void criticalQuestions() {
        // Q1: What happens when you run this?
        try {
            int result1 = 5 / 0;
            System.out.println("Q1 Result: " + result1);
        } catch (ArithmeticException e) {
            System.out.println("Q1 Result: " + e.getMessage());
        }

        // Q2: What is the value of 'result2'?
        double result2 = 5.0 / 0.0;
        System.out.println("Q2 Result: " + result2);

        // Q3: What is the value of 'result3'?
        int max = Integer.MAX_VALUE; // 2,147,483,647
        int result3 = max + 1;
        System.out.println("Q3 Result (Overflow): " + result3);

        // Q4: What is the final value of 'a'?
        int a = 2;
        a = a++ + ++a;
        System.out.println("Q4 Result: " + a);

        // Q5: What is the value of 'result5'?
        double result5 = 0.1 + 0.2;
        System.out.println("Q5 Result (Precision): " + result5);
        System.out.println("Is 0.1 + 0.2 == 0.3? " + (result5 == 0.3));
    }
}
// --- Easy Questions ---
// Q1 Result: 20
// Q2 Result: 6
// Q3 Result: 2
// Q4 Result: 6
// Q5 Result: 7

// --- Medium Questions ---
// Q1 Result (double): 6.0
// Q2 Result (double literal): 6.666666666666667
// Q3 Result: x=6, y=6
// Q4 Result: m=6, n=5
// Q5 Result: 21

// --- Critical Questions ---
// Q1 Result: / by zero
// Q2 Result: Infinity
// Q3 Result (Overflow): -2147483648
// Q4 Result: 6
// Q5 Result (Precision): 0.30000000000000004
// Is 0.1 + 0.2 == 0.3? false
