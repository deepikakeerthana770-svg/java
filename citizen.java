import java.util.Scanner;
public class citizen{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    System.out.println("age "+age);
    if (age>=60){
      System.out.println("senior citizen");
    }
    else{
      System.out.println("not senior citizen");
    }
  }
}
    