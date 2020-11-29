import java.util.Scanner;
class bank{
  public String name;
  public int accno;
  public String type;
  public int balance;
  public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome!!");
    System.out.println("Enter your name of employee: ");
    name = sc.nextLine();
    System.out.println("Enter your account number: ");
    accno = sc.nextInt();
    System.out.println("Enter your account type: ");
    type = sc.next();
    System.out.println("Enter your balance: ");
    balance = sc.nextInt();
  }
  void deposit(int d){
    balance = balance +d;
  }
  void withdraw(int w){
    if(w>balance)
      
    {
      System.out.println("Error!! your balance is insufficient");
    }
    else{
      balance = balance - w;
    }
    
  }
  void display(){
    System.out.println("Name: "+name);
    System.out.println("Account Number: "+accno);
    System.out.println("Account Type: "+type);
    System.out.println("Balance: "+balance);
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    bank b = new bank();
    b.input();
    int choice;
    System.out.println(" ");
    do{
      System.out.println("1: Display");
      System.out.println("2: Deposit ");
      System.out.println("3: Withdraw");
      System.out.println("4: Quit your org");
      choice = s.nextInt();
      switch(choice){
          
        case 1:
        b.display();
        break;
        case 2:
        System.out.println("How much do you want to Deposit: ");
        int dep =s.nextInt();
        b.deposit(dep);
        break;
        case 3:
        System.out.println("How much do you want to Withdraw: ");
        int wit = s.nextInt();
        b.withdraw(wit);
        break;
        case 4:
        break;
        default:
        System.out.println("Wrong choice");
      }
    }while(choice!=4);
  }
}
