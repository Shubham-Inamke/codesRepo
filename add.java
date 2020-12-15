public class Add {
    static int a1 = 20;
    static int a2 = 40;
    
    public static void main(String [] args) {
        int num1 = 10;
        int num2 = 70;
        int sum = num1 + num2;
        System.out.println("Addtion of num1 and num2 is: "+sum);
        
        System.out.println("Addition of static variables is: "+(a1+a2));
        System.out.println("Multiplication two numbers is: "+(a1*a2));
        System.out.println("Division of two numbers is: "+(num1/num2));
    }
}
