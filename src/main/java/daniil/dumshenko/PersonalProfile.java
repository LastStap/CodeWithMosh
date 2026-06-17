package daniil.dumshenko;

public class PersonalProfile {

    static final int NUMBER_OF_MONTH_IN_YEAR = 12;
    static final String NAME_OF_LEARNING_PROGRAMM = "Kozachok";
    static final int NUMBER_OF_LEARNING_DAYS = 10;

    public static void main(String[] args) {
        String name = "Viktor";
        String fourname = "Yanukovich";
        int age = 55;
        float height = 1.9f;
        double weight = 111.5;
        char firstNameLetter = 'V';
        boolean studentStatus = false;
        byte numberOfFinishedStudiedDays = 3;
        short numberOfHours = 60;
        String roles = "lox" + "povniy";
        String countries = "Ukraine";
        long likedNumber = 999999999999999999L;
        int remainingDays = NUMBER_OF_LEARNING_DAYS - numberOfFinishedStudiedDays;
        String specialChars = "tab:\there\nnewline above\n\"quoted\"\nbackslash: \\";

        System.out.println("================================");
        System.out.println("PERSONAL PROFILE");
        System.out.println("================================");
        System.out.println("Name: " + name);
        System.out.println("fourname: " + fourname);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
        System.out.println("weight: " + weight);
        System.out.println("first name: " + firstNameLetter);
        System.out.println("studentStatus: " + studentStatus);
        System.out.println("numberOfFinishedStudiedDays: " + numberOfFinishedStudiedDays);
        System.out.println("numberOfHours: " + numberOfHours);
        System.out.println("roles: " + roles);
        System.out.println("countries: " + countries);
        System.out.println("likedNumber: " + likedNumber);
        System.out.println("Number of month: " + NUMBER_OF_MONTH_IN_YEAR);
        System.out.println("Name of learning program: " + NAME_OF_LEARNING_PROGRAMM);
        System.out.println("number of learning days: " + NUMBER_OF_LEARNING_DAYS);
        System.out.println("remaining days: " + remainingDays);
        System.out.println("special chars demo: " + specialChars);
        System.out.println("================================");
    }
}