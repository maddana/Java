import java.util.Scanner;
public class AddTwoNumbers{
public static void main(String [] args){
int a,b;
Scanner x = new Scanner(System.in);
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
//a=x.nextInt();
int y=a+b;
//b=x.nextInt();
System.out.println(x);
System.out.printf("%d\n %x\n%o\n",y,y,y);
String  binary=Integer.toBinaryString(y);
System.out.println(binary);

}
}