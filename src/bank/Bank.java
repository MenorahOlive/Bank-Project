/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author Olive Menorah
 */
public class Bank {

    Scanner scanner = new Scanner(System.in);
    String name;
    String acc_no;
    String acc_type;
    String balance;

    public void accountDetails() {
        System.out.println("Enter you name:");
        name = scanner.next();
        System.out.println("Enter you acc_no:");
        acc_no = scanner.next();
        System.out.println("Enter you acc_type:");
        acc_type = scanner.next();
    }

    public void showAccount() {
        System.out.println("The name of account holder: " + name);
        System.out.println("Your account number is: " + acc_no);
        System.out.println("Your account type is: " + acc_type);
        System.out.println("Your balance is: " + balance);
    }

    
}
