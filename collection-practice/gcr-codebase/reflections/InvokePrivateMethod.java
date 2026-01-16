package reflections;

import java.lang.reflect.*;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {

    public static void main(String[] args) {

        try {
            Calculator cal = new Calculator();

          
            Class<?> clazz = cal.getClass();

           
            Method method = clazz.getDeclaredMethod("multiply", int.class, int.class);

          
            method.setAccessible(true);

            
            int result = (int) method.invoke(cal, 5, 4);

           
            System.out.println("Result is: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
