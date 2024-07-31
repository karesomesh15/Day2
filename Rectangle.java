import java.util.Scanner;
class Rectangle{
    public static void main(String [] args){
    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter the length of rectangle:");
    double length = sc.nextDouble();
    System.out.println("Enter the breadth of rectangle:");
    double breadth = sc.nextDouble();

    if (length == breadth){
        System.out.println("Square");
    }
    else{
        System.out.println("Reactangle");
    }


    sc.close();

    }

}