import java.util.Scanner;
public class Task7{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in); System.out.print("Enter square meters: ");
int number = inputCollector.nextInt();
int sum  = 0;
int temp = number;
if (temp > 0) {
sum  = sum + (temp % 10);
temp = temp / 10;   
}
System.out.println("Sum of digits = " + sum);
}
}
