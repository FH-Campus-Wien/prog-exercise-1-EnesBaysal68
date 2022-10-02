package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scan;

    public App() {
        scan = new Scanner(System.in);
    }

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals() {
        // input your solution here
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        int d = (int) 80L;
        int e = (int) 44e-1f;
        int f = (int) 5.5f;
        int g = (int) 8.88e1;
        int h = (int) 99.9;

        int sum = (a + b + c + d + e + f + g + h);

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a + b);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        x = x + y; // 9 + 4 = 13
        y = x - y; // 13 - 4 = 9
        x = x - y; // 13 - 9 = 4

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.print("n1: ");
        System.out.print("n2: ");

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n1 < n2) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        int umsatz = scan.nextInt();

        if (umsatz < 0 || umsatz >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (umsatz < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (umsatz >= 50000 && umsatz < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (umsatz >= 80000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        int comm = scan.nextInt();
        double prov;

        switch (comm) {
            case 1:
                prov = 0.01;
                break;
            case 2:
                prov = 0.02;
                break;
            case 3:
                prov = 0.03;
                break;
            case 4:
                prov = 0.04;
                break;
            default:
                prov = 0;
                break;
        }
        System.out.println("Your Commission Rate was set to " + prov);
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
        System.out.print("Year: ");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        System.out.print("Number: ");
        int numbers = scan.nextInt();

        int tens = numbers % 10;
        int hundreds = numbers % 100 / 10;
        int thousands = numbers % 1000 / 100;

        if(numbers/10 == 0)  {
            System.out.println(tens);
        } else if (numbers / 100 == 0)  {
            System.out.println(tens + "" + hundreds);
        } else if (numbers / 1000 == 0) {
            System.out.println(tens + "" + hundreds + "" + thousands);
        }
    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}