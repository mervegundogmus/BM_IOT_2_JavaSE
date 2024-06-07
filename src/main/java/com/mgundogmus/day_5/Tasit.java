package com.mgundogmus.day_5;


// Taşıt SOYUT sınıfı
// Ortak özellikleri ve metotları içerir

public abstract class Tasit {
    String marka; // her taşıtın bir markası var
    int hiz; // her taşıtın bir hızı vardır

    abstract void hareketEt(); // Alt sınıflar tarafından kullanılabilen ortak bir metotdur.

    void dur() {
        System.out.println("Taşıt duruyor..");
    }
}
