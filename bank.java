import java.util.Scanner;
public class bank{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter acc number");
    int acc=sc.nextInt();
    System.out.println("enter name");
    String name=sc.next();
    System.out.println("enter balance");
    int balance=sc.nextInt();
   customer cust=new customer(acc,name,balance);
   cust.deposit(1000);
   cust.display();
   cust.withdraw(500);
   cust.display();
  }
}
class customer{
  int acc;
  String name;
  int balance;
  customer(int a,String b,int c){
    acc=a;
    name=b;
    balance=c;
  }
  public void deposit(int d){
    balance=balance+d;
  }
  public void withdraw(int w){
    balance=balance-w;
  }
  public void display(){
    System.out.println("Acc number"+acc);
    System.out.println("Name"+name);
    System.out.println("Balance"+balance);
  }
}
    
    
    
    
  
    