package ie.atu.week7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class OrderMain {
    public static void main(String[] args) {
        ArrayList<Object> orders = new ArrayList<>(100);

        Scanner sc2 = new Scanner(System.in); //create scanner object
        System.out.println("Enter one of the following options: ");
        System.out.println("1. Add Order \n2. Update Order \n3.Display All Orders \n4.Exit: ");
        Scanner sc = new Scanner(System.in); //create scanner object
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                try{
                    Order o1 = new Order(); //create default order
                    System.out.println("Please enter an order ID: ");
                    int oID = sc2.nextInt(); //take the order ID as the index
                    orders.add(o1);//add object
                    orders.set(oID, o1);//set index to first object made

                } catch(Exception e){
                    System.out.println("Order Creation Error" + e);
                } break;

            case 2:
                try{
                    System.out.println("Enter order ID: ");
                    int orID = sc2.nextInt();
                    orders.get(orID);//get the object at the index enters
                    for(int i = 0; i< orders.size();i++){
                        if (orID == i){//if order ID entered equals the index/ordernumber
                            Order o1 = new Order(); //create default order
                            System.out.println("Enter new customer name: ");
                            o1.setCustomerName(sc.nextLine());
                            System.out.println("Enter new product name: ");
                            o1.setProductName(sc.nextLine());
                            System.out.println("Enter new quantity: ");
                            o1.setQuantity(sc.nextInt()); //set new values for object
                        }
                    }

                } catch (Exception e){
                    System.out.println("Order ID Error");
                } break;

            case 3:
                try{
                    for(Object i: orders){
                        System.out.println(i);//print each object in the list
                    }

                } catch (Exception e){
                    System.out.println("Printing Error");
                } break;

            case 4:
                System.out.println("Thank you");
                break;

            default:
                break;
        }



    }
}
