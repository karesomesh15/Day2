public class Program1{

public int add(int num1, int num2){

return num1+num2;
}

public int sub(int num1, int num2){
return num1-num2;
}

public int mul(int num1, int num2){
    return num1*num2;
}

public int div(int num1, int num2){
return num1/num2;
}


public static void main(String [] args){

Program1 calculator = new Program1();

int num1 = 5;
int num2 = 10;

System.out.println("Addition:" + calculator.add(num1, num2));
System.out.println("Substraction:" + calculator.sub(num1, num2));
System.out.println("Division:" + calculator.mul(num1, num2));
System.out.println("Division:" + calculator.div(num1, num2));

}
}

 



