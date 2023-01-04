import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = key.nextInt();
        if(age <= 0)
        {
            System.out.println("It is not your age. It is " + age*-1 + " years before your birth");
        }
        else if(age > 0 && age <= 6)
        {
            System.out.println("Your common activity is daycare");
        }
        else if(age > 6 && age <= 17)
        {
            System.out.println("Your common activity is school");
        }
        else if (age > 17 && age <= 28)
        {
            System.out.println("Your common activities are university and work");
        }
        else if (age > 28 && age <= 60)
        {
            System.out.println("Your common activity is work");
        }
        else if(age > 60 && age <= 100)
        {
            System.out.println("You are retired");
        }
        else
        {
            System.out.println("How are you still alive?");
        }
    }
}