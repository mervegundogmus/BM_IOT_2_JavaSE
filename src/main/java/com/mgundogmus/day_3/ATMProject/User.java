package com.mgundogmus.day_3.ATMProject;

// ATM.java: Ana sınıf ve ana menü
// User.java: Kullanıcı bilgilerinin tutulduğu sınıf.
// Account.java: Kullanıcının hesabını temsil eden sınıf.
// TransactionType.java: İşlem türlerini belirten enum.
// FileUtil.java: Dosya işlemlerini yapacak sınıf.

// 1- Değişkenleri oluştur
// 2- Yapıcı Metodunu oluştur

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String userName;
    private String password;
    private Account account;
    private boolean isBlocked;
    private int loginAttempts;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.account = new Account(1000); // Başlangıçta 1000 tl bonus
        this.isBlocked = false;
        this.loginAttempts = 0;
    }

}
