public class program2 {
    public static void main(String[] args) {
        
        int a = 10;
        System.out.println("Original a: " + a);//10
        System.out.println("a++: " + (a++));//10// Post-increment: uses current value then increments
        System.out.println("After a++: " + a);//11

        int b = 10;
        System.out.println("Original b: " + b);
        System.out.println("++b: " + (++b)); // Pre-increment: increments then uses new value
        System.out.println("After ++b: " + b);

        int c = 10;
        System.out.println("Original c: " + c);
        System.out.println("c--: " + (c--)); // Post-decrement: uses current value then decrements
        System.out.println("After c--: " + c);

        int d = 10;
        System.out.println("Original d: " + d);
        System.out.println("--d: " + (--d)); // Pre-decrement: decrements then uses new value
        System.out.println("After --d: " + d);

        // More complex example
        int x = 5;
        int y = 10;
        int result1 = ++x + y--; // x becomes 6, y is used as 10 then becomes 9
        System.out.println(y);
        System.out.println("x: " + x + ", y: " + y + ", result1: " + result1); // x=6, y=9, result1=16

        int p = 8;
        int q = 3;
        int result2 = p-- * --q; // p is used as 8 then becomes 7, q becomes 2 then used as 2
        
        System.out.println("p: " + p + ", q: " + q + ", result2: " + result2); // p=7, q=2, result2=16
    

    }

     
}
//OUTPUT


// Original a: 10
// a++: 10
// After a++: 11
// Original b: 10
// ++b: 11
// After ++b: 11
// Original c: 10
// c--: 10
// After c--: 9
// Original d: 10
// --d: 9
// // After --d: 9
    