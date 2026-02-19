import java.util.Scanner;
public class allexcept{
  public static void main(String args[]){
    try{
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      for (int i=0;i<5;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(+arr[3]);
      System.out.println("ENTER a");
      int a=sc.nextInt();
      System.out.println("ENTER b");
      int b=sc.nextInt();
      int c=a/b;
      System.out.println("the divison is :"+c);
      System.out.println("Enter a number");
      String a1=sc.next();
      int a2=Integer.parseInt(a1);
    }
catch(ArithmeticException e){
  System.out.println("Arithmetic Exception occured");
}
  catch(ArrayIndexOutOfBoundsException e){
  System.out.println("Array index exception occured");
}
catch(NumberFormatException e){
  System.out.println("number format exception occured");
}
}
}
     
      
      
      