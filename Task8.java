import java.util.Scanner;
public class Task8{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in); System.out.print("Enter square meters: ");
double minutes = inputCollector.nextdouble();
double totalDays = minutes / 1440;
double years = totalDays / 365;
double leftovDays = totalDays % 365;
System.out.println(minutes + " minutes = " + years + " years and " + leftovDays + " days");
}
}
