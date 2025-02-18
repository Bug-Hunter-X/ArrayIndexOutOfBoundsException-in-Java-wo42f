public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); // Potential ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds.");
            // Handle the exception appropriately, e.g., log it, display a message to the user, etc.
        }
    }
}