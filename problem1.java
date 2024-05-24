package calc;
import java.util.*;
class Calculator{
    public void calculate(int a, int b){
        System.out.println("I'm main Method");
        System.out.println("Your Result is:" +(a+b));
    }
}
class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("I'm main Method");
        System.out.println("Your Result is:" +(a+b));
    }
}
class HybridCalculator{
    public void calculate(int a, int b){
        System.out.println("I'm main Method");
        System.out.println("Your Result is:" + Math.sin(a+b));
    }
}
public class problem1 {
    public static void main(String[] args){
        System.out.println("I'm main Method");
        System.out.println("Your Result is:");
    }    
}
