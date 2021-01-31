import java.util.Scanner;
class AreaCalculation{
  public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.print("\n AREA CALCULATOR \n Enter your choice \n 1 for Triangle \n 2 for Rectangle/Square \n 3 for Parallelogram/Rhombus \n 4 for Circle \n 5 for Semi Circle \n 6 for Ellipse");
    int ch=sc.nextInt();
    double ar=0.0d;
    switch(ch){
      case 1: System.out.print("\n Enter base and height"); 
      int b=sc.nextInt();
      int h=sc.nextInt();
      ar=(double)((0.5d)*b*h);
      System.out.print("\n Area of Triangle is "+ar);
      break;
      case 2: System.out.print("\n Enter Length and Breadth");
      int l=sc.nextInt();
      int b1=sc.nextInt();
      ar=(double)(l*b1);
      System.out.print("\n Area of Rectangle/Square is "+ar);
      break;
      case 3: System.out.print("\n Enter base and height");
      int b2=sc.nextInt();
      int h1=sc.nextInt();
      ar=(double)(b2*h1);
      System.out.print("\n Area of Parallelogram/Rhombus is "+ar);
      break;
      case 4: System.out.print("\n Enter Radius");
      int r=sc.nextInt();
      ar=(double)((Math.PI)*r*r);
      System.out.print("\n Area of Circle is "+ar);
      break;
      case 5: System.out.print("\n Enter Radius");
      int r1=sc.nextInt;
      ar=(double)(((Math.PI)*r*r)*(0.5d));
      System.out.print("\n Area of Semi Circle is" +ar);
      break;
      case 6: System.out.print("\n Enter the semi major and semi minor axes");
      int m=sc.nextInt();
      int m2=sc.nextInt();
      ar=(double)((Math.PI)*m*m1);
      System.out.print("\n Area of Ellipse is "+ar);
      break;
      default: System.out.print("\n Invalid Input!");
      System.exit(0);
      }
   }
}
