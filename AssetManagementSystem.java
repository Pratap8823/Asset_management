package Asset_Management;

import java.util.Scanner;

public class AssetManagementSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Assets assets = new Assets();
    while (true) {
      System.out.println("Pleaase select ");
      System.out.println("1)laptop\n2)Desktop");
      int select = sc.nextInt();
      if (select == 1) {
        while (true) {
          System.out.println("Select your choice");
          System.out.println("1. Add Assets");
          System.out.println("2. Display Assets list which is in inventory");
          System.out.println("3. Remove assets which from inventory");
          System.out.println("4. Assets which are with users");

          int choice = sc.nextInt();

          switch (choice) {
            case 1:
              System.out.println("Please select your laptop brand");
              System.out.println("1. Dell");
              System.out.println("2. Lenovo");
              int brand = sc.nextInt();
              switch (brand) 
              {
                case 1:

                  System.out.println("How many laptop's you want to add on inventory");
                  sc.nextLine();
                  int qty = sc.nextInt();

                  for (int i = 1; i <= qty; i++) {
                    System.out.println(i + ") " + "Please enter model number:");
                    sc.nextLine();
                    String dModel = sc.nextLine();
                    System.out.println(i + ") " + "Enter the serial number:");
                    String dSnumber = sc.nextLine();
                    Dell dell = new Dell(dModel, dSnumber);
                    assets.addDell(dell);
                  }
                  System.out.println("Asset added successfully");
                  // int total_dCount=Assets.total_dCount;
                  int dCount = assets.dCount();
                  System.out.println("Total Dell laptop count: " + dCount);

                  break;
                case 2:
                  System.out.println("How many laptop's you want to add on inventory");
                  int lqty=sc.nextInt();
                  for(int i=1; i<=lqty; i++)
                    {
                      System.out.println("Please enter model number:");
                      String lModel = sc.nextLine();
                      sc.nextLine();
                      System.out.println("enter your serial number:");
                      String lSnumber = sc.nextLine();
                      Lenovo lenovo = new Lenovo(lModel, lSnumber);
                      assets.addLenovo(lenovo);
                    }
                  System.out.println("Asset added successfully");
                  int lCount = assets.lCount();
                  System.out.println("Total Dell laptop count: " + lCount);

                  break;
                default:
                  System.out.println("Invalid entry");
              }
              break;
            case 2:
              System.out.println("1)Laptop\n" + "2)desktop");
              int ch = sc.nextInt();
              if (ch == 1) {
                System.out.println("Number of assets which is in the inventory");
                assets.quantity();
                break;
              } else {
                System.out.println("Number of assets which is in the inventory");
                assets.quantity();
                break;
              }
            case 3:
              System.out.println("Which asset you want to remove from inventory");
              System.out.println("enter the serialnumber");
              String remove = sc.nextLine();
              assets.delAsset(remove);
          }
        }
      } else {

      }
    }
  }
}
