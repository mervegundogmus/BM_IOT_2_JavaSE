package com.mgundogmus.day_3.ATMProject;

import java.io.IOException;
import java.util.Scanner;

public class ATM {

    private static User currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı girin:");
        String userName = scanner.nextLine();

        try {
            String storedPassword = FileUtil.readPassword(userName);
            if (storedPassword == null) {
                System.out.println("Kullanıcı bulunamadı!");
                return;
            }

            currentUser = new User(userName, storedPassword);
            login(scanner);

            while (true) {
                showMenu();
                int choice = scanner.nextInt();
                scanner.nextLine(); // boş satırı geç

                switch (choice) {
                    case 1:
                        deposit(scanner);
                        break;
                    case 2:
                        withdraw(scanner);
                        break;
                    case 3:
                        donation(scanner);
                        break;
                    case 4:
                        transfer(scanner);
                        break;
                    case 5:
                        logout(scanner);
                        return;
                    default:
                        System.out.println("Geçersiz seçim!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void login(Scanner scanner) {
        while (true) {
            if (currentUser.isBlocked()) {
                System.out.println("Hesabınız bloke olmuştur.");
                return;
            }

            System.out.println("Şifrenizi giriniz: ");
            String password = scanner.nextLine();

            if (currentUser.getPassword().equals(password)) {
                System.out.println("Giriş başarılı!");
                return;
            } else {
                currentUser.incrementLoginAttemps();
                System.out.println("Hatalı şifreé");

                if (currentUser.getLoginAttempts() >= 3) {
                    currentUser.block();
                    System.out.println("3 kere yanlış şifre girdiniz. Hesabınız bloke olmuştur.");
                    return;
                }
            }
        }
    }


}
