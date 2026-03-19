import java.util.Scanner;
class Stock {
    String stocks;
    int quantity;
    int  price;
}
public class Code_Alpha_StockTradingPlatform {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stocks[] = {"TCS", "INFOSYS", "RELIANCE"};
        int price[] = {3500, 1800, 2300};
        int quantity[] = {0, 0, 0};
        int balance = 30000;
        while (true) {
            System.out.println("Welcome To Stack Trading Simulator");
            System.out.println("-----------------------------------");
            System.out.println("1.View Available Stocks");
            System.out.println("2.Buy Shares");
            System.out.println("3.Sell Shares");
            System.out.println("4.View Portfolio");
            System.out.println("5.Exit");
            System.out.println("Enter a choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (choice == 1) {
                        for (int i = 0; i < stocks.length; i++) {
                            System.out.println((i + 1) + "." + stocks[i] + "-Price:$" + price[i] + "/-");
                        }
                    }
                    break;
                case 2:
                    if (choice == 2) {
                        System.out.println("Select Stock number:");
                        int stockindex = sc.nextInt() - 1;
                        System.out.println("Enter Quantity:");
                        int qty = sc.nextInt();
                        int totalcost = price[stockindex] * qty;
                        if (balance >= totalcost) {
                            balance -= totalcost;
                            quantity[stockindex] += qty;
                            System.out.println("Stock Bought Successfully:");
                        } else {
                            System.out.println("Not Enough Balance:");
                        }
                    }
                    break;
                case 3:
                    if (choice == 3) {
                        System.out.println("Select Stock Number:");
                        int stockindex=sc.nextInt()-1;
                        System.out.println("Enter Qunatity:");
                        int qty=sc.nextInt();
                        int totalcost=price[stockindex] * qty;
                        if(balance>=totalcost){
                            balance+=totalcost;
                            quantity[stockindex]-=qty;
                            System.out.println("Stock Sell Successfully:");
                        }
                        else{
                            System.out.println("Rejected Stock:");
                        }
                    }
                    break;
                default:
                    if(choice==4){
                        System.out.println("Updated Portifolio:");
                        for(int i=0; i<stocks.length;i++){
                            System.out.println(stocks[i] +":"+quantity[i]+" "+"shares");
                        }
                        System.out.println("Balance:$"+balance);
                        break;
                    }
            }
        }
    }
}

