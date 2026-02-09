import java.util.Scanner;
class day{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    if (d==1){
      System.out.println("monday");
    }
    else if (d==2){
      System.out.println("tuesday");
    }
    else if (d==3){
      System.out.println("wednesday");
    }
    else if (d==4){
      System.out.println("Thursday");
    }
    else if (d==5){
      System.out.println("friday");
    }
    else if (d==6){
      System.out.println("saturday");
    }
    else if (d==7){
      System.out.println("sunday");
    }
    else{
      System.out.println("invalid day");
    }
  }
}
        
      