package com.mgundogmus.day_5;

// Araba sınıfı, Tasit sınıfından özelliklerini ve metotlarını miras/kalıtım alır.
public class Araba extends Tasit{
    int kapilar; // arabaya özel ek bi özellik

    void kornaCal() {  // --> arabaya özel ait bir özellik
        System.out.println("Araba kornası çalıyor...");
    }

    @Override
    void hareketEt() {  // ---> Soyut olan sınıftan hareketEt() metodu burada implement ediliyor.
        System.out.println("Araba hareket ediyor...");
    }
}


