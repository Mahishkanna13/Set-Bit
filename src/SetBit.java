import java.util.Scanner;

public class SetBit {
    public static int Result(int number1,int number2)
    {
        int result=0;
        if(number1!=number2)
        {
            result=(int)Math.pow(2,number1);
            result+=(int)Math.pow(2,number2);
        }
        else {
            result=(int)Math.pow(2,number1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2= scanner.nextInt();
        System.out.println(Result(number1,number2));
    }
}
