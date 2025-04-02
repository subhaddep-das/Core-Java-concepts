package operators;

public class TypeCasting {

    public void performTypeCasting() {
        System.out.println("Performing Type Casting Operations:");
        System.out.println("----------------------------------");

        // Implicit Type Casting (Widening)
        int intValue = 10;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("\nImplicit Type Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);

        // Explicit Type Casting (Narrowing)  
        double anotherDouble = 15.75;
        int anotherInt = (int) anotherDouble;
        float anotherFloat = (float) anotherDouble;
        long anotherLong = (long) anotherFloat;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + anotherDouble);
        System.out.println("int value (after casting): " + anotherInt);
        System.out.println("float value (after casting): " + anotherFloat);
        System.out.println("long value (after casting): " + anotherLong);

        // Type Casting with Characters
        int charIntValue = 65;
        char myChar = (char) charIntValue;

        char anotherChar = 'B';
        int anotherCharIntValue = (int) anotherChar;

        System.out.println("\nType Casting with Characters:");
        System.out.println("int value: " + charIntValue);
        System.out.println("char value (after casting): " + myChar);
        System.out.println("char value: " + anotherChar);
        System.out.println("int value (after casting): " + anotherCharIntValue);
    }
}