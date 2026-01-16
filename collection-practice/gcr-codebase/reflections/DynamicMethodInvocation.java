package reflections;

import java.util.*;
import java.lang.reflect.*;

class MathOperation {
    public int Add(int a, int b) {
        return a + b;
    }

    public int Subtract(int a, int b) {
        return a - b;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {

    public static void main(String[] args) {

        try {
            Class<?> clazz = MathOperation.class;

           
            MathOperation obj = new MathOperation();

            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("\nEnter what would you like to perform:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Exit");

                int choice = sc.nextInt();

                if (choice == 4) {
                    System.out.println("Program exited.");
                    break;
                }

                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                Method method = null;

                switch (choice) {
                    case 1:
                        method = clazz.getDeclaredMethod("Add", int.class, int.class);
                        break;

                    case 2:
                        method = clazz.getDeclaredMethod("Subtract", int.class, int.class);
                        break;

                    case 3:
                        method = clazz.getDeclaredMethod("Multiply", int.class, int.class);
                        break;

                    default:
                        System.out.println("Enter valid input");
                        continue;
                }

                
                int result = (int) method.invoke(obj, a, b);

                System.out.println("Result is: " + result);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
