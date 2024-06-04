package com.mgundogmus.day_2;

import lombok.Getter;
import lombok.Setter;

@Getter // Getter metodlarını otomatik olarak oluşturur
@Setter // Setter metodlarını otomatik olarak oluşturur
public class ThreadExtends extends Thread { // Thread sınıfından türetilen yeni bir sınıf tanımlar
    // Değişkenler
    private Long threadID; // threadID isimli uzun (Long) bir değişken tanımlar
    private String threadName; // threadName isimli string (metin) bir değişken tanımlar

    public ThreadExtends() { // Boş yapıcı (constructor) metod
    }

    public ThreadExtends(Long threadID, String threadName) {
        // İki parametreli yapıcı metod
        this.threadID = threadID; // Parametre olarak alınan threadID'yi sınıf değişkenine atar
        this.threadName = threadName; // Parametre olarak alınan threadName'i sınıf değişkenine atar
    }

    @Override // Thread sınıfının run metodunu geçersiz kılar
    public void run() {
        System.out.println("Thread Extends"); // Konsola "Thread Extends" yazar
        for (int i = 1; i <= 9; i++) { // 1'den 9'a kadar döngü
            System.out.println("Thread" + this.threadID + ": " + i + " " + this.threadName + " ");
            // Thread ID'sini, döngü sayısını ve thread adını yazdırır
            try {
                Thread.sleep(1000); // 1 saniye (1000 milisaniye) bekler
            } catch (InterruptedException e) { // Eğer bekleme süresi kesintiye uğrarsa
                throw new RuntimeException(e); // Bir çalışma zamanı hatası fırlatır
            }
        } // döngü sonu
    } // run metodu sonu
} // ThreadExtends sınıfı sonu

// PSVM (Public Static Void Main)
class ThreadTextMain { // Ana uygulama sınıfı
    public static void main(String[] args) throws InterruptedException {
        // Thread Instance (Thread örnekleri oluşturma)
        ThreadExtends t1 = new ThreadExtends(1L, "zoom"); // 1 numaralı thread, adı "zoom"
        ThreadExtends t2 = new ThreadExtends(2L, "intellij idea"); // 2 numaralı thread, adı "intellij idea"
        ThreadExtends t3 = new ThreadExtends(3L, "Browser"); // 3 numaralı thread, adı "Browser"

        // Start (Başlatma işlemleri)
        System.out.println("getName:" + t1.getName());
        System.out.println("hashcode:" + t1.hashCode());
        System.out.println("is alive ? " + t1.isAlive());

        // Bu programlarda öncelikle zoom çalışsın sonrasında diğer programlar çalışsın
        t1.start(); // t1 thread'ini başlatır
        t1.join(); // t1 thread'inin bitmesini bekler

        t2.start(); // t2 thread'ini başlatır
        t3.start(); // t3 thread'ini başlatır

    } // main metodu sonu
} // ThreadTextMain sınıfı sonu

