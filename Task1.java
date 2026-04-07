import java.util.Scanner;
public class Task1{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter Hour");
int FirstHour = inputCollector.nextInt();
System.out.println("Enter Minute");
int FirstMinute = inputCollector.nextInt();
System.out.println("Enter Hour");
int SecondHour = inputCollector.nextInt();
System.out.println("Enter Minute");
int MinuteHour = inputCollector.nextInt();
int totalMinute = FirstHour * FirstMinute;
int totalHours = minute / 60;
int finalMinutes = totalMinute % 60;
int finalHours = FirstHours + SecondHours + carryHours;
System.out.println("Total Time: " + finalHours + "hrs" + finalMinutes + "mins");
}
}
