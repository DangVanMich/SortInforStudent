package view;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    private final static Scanner sc = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int check = Integer.parseInt(sc.nextLine().trim());
                if (check < min || check > max) {
                    throw new Exception();
                } else {
                    return check;
                }
            } catch (Exception e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]!");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputString(String name) {
        while (true) {
            System.out.print(name);
            String string = sc.nextLine().trim();
            if (string.isEmpty()) {
                System.err.println("Not allowed empty!");
                System.out.print("Enter again: ");
            } else {
                return string;
            }
        }
    }

    public String checkInputString1() {
        while (true) {
            String string = sc.nextLine();
            if (string.isEmpty()) {
                System.err.println("Not allowed empty!");
                System.out.println("Enter again: ");
            } else {
                return string;
            }
        }
    }

     public double checkInput(String name){
        while (true) {            
            System.out.println(name);
            double input = sc.nextDouble();
            if(input<=0){
                System.err.println("Input Invalid!!");
                System.out.println("Try again");
            }else{
                return input;
            }
        }
    }
    public boolean checkInputYesNo() {
        while (true) {
            String result = checkInputString1();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            // System.out.println("Enter again: ");
        }
    }

}
