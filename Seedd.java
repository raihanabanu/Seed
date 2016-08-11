# Seed
import java.util.Scanner;
public class Seedd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
int mod=0;
int output=1;
int k=j;
while(j>0){
mod=mod%10;
output=output*mod;
j=j/10;
}
System.out.println(output*k);
}
}
