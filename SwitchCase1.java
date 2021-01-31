//Program that ilustrates the use of Switch Case in java
import java.util.Scanner;
class SwitchCase1{
  public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.print("\n Enter a number");
    int n=sc.nextInt();
    System.out.print("\n Enter 1 to print it's square \n 2 to print it's cube");
    int c=sc.nextInt();
    switch(c){
    case 1: int sq=n*n;
    System.out.print("\n The Square of n is "+sq);
    break;
    case 2: int cb=n*n*n;
    System.out.print("\n The Cube of n is "+cb);
    break;
    default: System.out.print("\n Invalid Option!");
    }
  }
}
