import java.util.*;
public class LargestOf3{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers: ");
int n1=s.nextInt();
int n2=s.nextInt();
int n3=s.nextInt();
if(n1 > n2 && n1 > n3){
System.out.println(n1+" is largest number.");
}else if(n2 > n3){
System.out.println(n2+" is largest number.");
}else{
System.out.println(n3+" is largest number.");
s.close();
}
}
}
