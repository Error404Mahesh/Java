public class program6 {
    public static void main(String[] args) {
        // The preferred Java convention is to place the brackets with the type (int[]).
        // This line declares an integer array named 'arr' and initializes it
        // with a size of 3. All elements are set to 0 by default.
        int[] arr = new int[3];
        System.out.println("The value at index 0 is: " + arr[0]); // Will print 0



        // Declare a float array marks of size 4 and initialize it at the time of declaration with 88.5, 79.0, 92.5, 85.0.
        // Then print the 3rd element.??
        
        // This is an array initializer. It declares the array and provides its
        // initial values in a single step. We use 'f' to denote float literals.
        float[] marks = {88.5f, 79.0f, 92.5f, 85.0f};
        
        // Arrays are 0-indexed, so the 3rd element is at index 2.
        System.out.println("The 3rd element (at index 2) is: " + marks[2]);
    }
}