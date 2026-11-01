import java.util.*;
public class Multiplication{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
int num=s.nextInt();
System.out.println("Multiplication table of "+num);
for(int i = 1;i <= 10;i++){
System.out.println(num +"x"+i+"="+(num*i));
s.close();
}
}
}
