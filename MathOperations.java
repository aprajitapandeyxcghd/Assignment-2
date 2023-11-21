public class MathOperations {
        // Method to add two integers
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    
        // Method to add two doubles
        public double add(double num1, double num2) {
            return num1 + num2;
        }
    
        // Method to add an integer and a double
        public double add(int num1, double num2) {
            return num1 + num2;
        }
    
        public static void main(String[] args) {
            MathOperations mathOperations = new MathOperations();
    
            // Testing the addition of two integers
            System.out.println("The sum of 5 and 3 is: " + mathOperations.add(5, 3));
    
            // Testing the addition of two doubles
            System.out.println("The sum of 5.5 and 3.3 is: " + mathOperations.add(5.5, 3.3));
    
            // Testing the addition of an integer and a double
            System.out.println("The sum of 5 and 3.3 is: " + mathOperations.add(5, 3.3));
        }
    
}
