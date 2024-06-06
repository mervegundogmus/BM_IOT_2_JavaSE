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
                        deposit(scanner);  // para yatırma
                        break;
                    case 2:
                        withdraw(scanner);  // para çekme
                        break;
                    case 3:
                        donation(scanner); // bağış yapma
                        break;
                    case 4:
                        transfer(scanner); // havale/eft
                        break;
                    case 5:
                        callSupport(); // müşteri hizmetlerini arama
                        break;
                    case 6:
                        logout(); // çıkış
                        return;
                    default:
                        System.out.println("Geçersiz seçim!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showMenu() {
        System.out.println("1. Para Yatır");
        System.out.println("2. Para Çek");
        System.out.println("3. Para Havale/EFT");
        System.out.println("4. Bağış Yap");
        System.out.println("5. Müşteri Hizmetlerini Ara");
        System.out.println("6. Güvenli Çıkış");

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

    private static void deposit(Scanner scanner) {
        System.out.println("Yatırmak istediğiniz tutarı girin: ");
        double amount = scanner.nextDouble();
        currentUser.getAccount().deposit(amount);
        System.out.println("Yeni bakiyeniz: " + currentUser.getAccount().getBalance());
    }

    private static void withdraw(Scanner scanner) {
        System.out.println("Çekmek istediğiniz tutarı girin: ");
        double amount = scanner.nextDouble();
        if (currentUser.getAccount().withdraw(amount)) {
            System.out.println("Yeni bakiyeniz: " + currentUser.getAccount().getBalance());
        } else {
            System.out.println("Yetersiz bakiye!" + "\nMevcut bakiyeniz: " + currentUser.getAccount().getBalance());
        }
    }

    private static void transfer(Scanner scanner) {
        System.out.println("Transfer etmek istediğiniz tutarı girin: ");
        double amount = scanner.nextDouble();
        System.out.println("Alıcı hesabın kullanıcı adını girin: ");
        scanner.nextLine(); // boş satırı geçer
        String recipientUsername = scanner.nextLine();

        try {
            String recipientPassword = FileUtil.readPassword(recipientUsername);
            if (recipientPassword == null) {
                System.out.println("Alıcı kullanıcı bulanamadı!");
                return;
            }

            User recipient = new User(recipientUsername, recipientPassword);
            if (currentUser.getAccount().withdraw(amount)) {
                recipient.getAccount().deposit(amount);
                System.out.println("Transfer başarılı! Yeni bakiyeniz: " + currentUser.getAccount().getBalance());
            } else {
                System.out.println("Yetersiz bakiye!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void donation(Scanner scanner) {
        System.out.println("Bağış yapmak istediğiniz tutarı girin: ");
        double amount = scanner.nextDouble();
        if (currentUser.getAccount().withdraw(amount)) {
            System.out.println("Bağış başarılı! Yeni bakineyiz: " + currentUser.getAccount().getBalance());
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }


    private static void callSupport() {
        System.out.println("Müşteri Hizmetleri aranıyor...");
    }

    private static void logout() {
        System.out.println("Güvenli çıkış yapılıyor...");
    }


}
