package com.mgundogmus.day_5;

public class Bisiklet extends Tasit{
    boolean elektrikli;  // Bisiklete özel bir özellik

    void ziliCal() { // Bisiklete özel bir davranış/metot
        System.out.println("Bisiklet zili çalıyor...");
    }

    @Override
    void hareketEt() {
        System.out.println("Bisiklet hareket ediyor...");
    }
}
