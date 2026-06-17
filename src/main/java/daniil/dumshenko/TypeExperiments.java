package daniil.dumshenko;

public class TypeExperiments {

    public static void main(String[] args) {
        //declaration без assignment;
        int a;

        //initialization;
        a = 10;

        //повторний assignment;
        a = 20;

        //присвоєння між двома int;
        int b = 30;
        a = b;

        //копіювання primitive value;
        int c = a;

        //присвоєння одного String іншому;
        String example = "Hello, it`s example";
        String answer = example;

        //конкатенацію String;
        String concat = "Hello," + "it`s concat";

        //зміну boolean;
        boolean isActive = true;

        isActive = false;

        //використання char;
        char grade = 'A';

        System.out.println(grade);

        //використання final-константи.
        final int date = 1997;

        //1. int → long (widening, implicit).
        int intVal = 100;
        long longVal = intVal;

        //2. int → double (widening, implicit).
        double widenedDouble = intVal;

        //3. double → int (narrowing, explicit, fractional part lost).
        double price = 9.99;
        int truncated = (int) price;

        //4. int → byte у межах byte (explicit, no info loss).
        int smallInt = 100;
        byte byteInRange = (byte) smallInt;

        //5. int → byte поза межами byte (explicit, info loss).
        int bigInt = 130;
        byte byteOutOfRange = (byte) bigInt;

        //overflow: byte переповнюється і перестрибує до -128.
        byte maxByte = 127;
        byte overflowed = (byte) (maxByte + 1);

        //0.1 + 0.2 != 0.3 через binary floating-point representation.
        double sum = 0.1 + 0.2;
        boolean equalsThird = sum == 0.3;

        System.out.println("1. int->long: " + longVal);
        System.out.println("2. int->double: " + widenedDouble);
        System.out.println("3. double->int: " + truncated);
        System.out.println("4. int->byte in range: " + byteInRange);
        System.out.println("5. int->byte out of range: " + byteOutOfRange);
        System.out.println("overflow: " + overflowed);
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("sum == 0.3: " + equalsThird);
    }
}
