package life;


import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class How {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first name");


        String firstName = scan.nextLine();
        System.out.println("enter last name");
        String lastName = scan.nextLine();


        String first = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String last = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = first+" "+last;

        System.out.println(first);
        System.out.println(last);
        System.out.println(fullName+" ");



    }
}
