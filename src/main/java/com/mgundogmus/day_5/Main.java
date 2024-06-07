package com.mgundogmus.day_5;

public class Main {
    public static void main(String[] args) {
        // Taşıt türünden referanslarla Araba ve Bisiklet nesneleri oluşturulur.
        Tasit araba = new Araba(); // bir araba nesnesi oluşturuluyor
        Tasit bisiklet = new Bisiklet(); // bir bisiklet nesnesi oluşturuluyor

        araba.hareketEt(); // Çıktı: Araba hareket ediyo
        bisiklet.hareketEt(); // Çıktı: Bisiklet pedalı çevriliyor.

        // Arabaya ait metot
        ((Araba) araba).kornaCal(); // Çıktı: Korna çalınıyor

        // Bisiklete ait metot
        ((Bisiklet) bisiklet).ziliCal(); // Çıktı: Zil çalınıyor
    }
}
