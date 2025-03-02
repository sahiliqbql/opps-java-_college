// 13. Write a program to define a class Item containing code and price. 
//     Accept this data for five objects using array of objects. Display code, 
//     price in tabular form and also, display total price of all arr.

import java.util.Scanner;

class Item {
    int code;
    double price;

    Item(int code, double price) {
        this.code = code;
        this.price = price;
    }

    void displayItem() {
        System.out.println(code + "      ₹" + price);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] arr = new Item[3];
        double totalPrice = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Item Code: ");
            int code = sc.nextInt();

            System.out.print("Enter Item Price: ");
            double price = sc.nextDouble();

            arr[i] = new Item(code, price);
            totalPrice += price;
        }

        System.out.println("\nItem Details:");
        System.out.println("Code      Price");
        System.out.println("-----------------");

        for (Item item : arr) {
            item.displayItem();
        }

        System.out.println("-----------------");
        System.out.println("Total Price: ₹" + totalPrice);

        sc.close();
    }
}

// Enter Item Code: 101
// Enter Item Price: 50.2
// Enter Item Code: 102
// Enter Item Price: 150
// Enter Item Code: 103
// Enter Item Price: 75.3

// Item Details:
// Code Price
// -----------------
// 101 ?50.2
// 102 ?150.0
// 103 ?75.3
// -----------------
// Total Price: ?275.5
