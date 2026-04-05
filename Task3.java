import java.util.Scanner;
public class Task2{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter side of triangle: ");
double side = inputCollector.nextDouble();
System.out.print("Enter length of prism: ");
double length = inputCollector.nextDouble();
double area   = (Math.sqrt(3) / 4) * side * side;
double volume = area * length;
System.out.println("Volume = " + volume);
}
}

