package com.mgundogmus.day_2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeThreads extends Thread {
    private Long threadID;
    private String threadName;

    public HomeThreads() {
    }

    public HomeThreads(Long threadID, String threadName) {
        this.threadID = threadID;
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("Home Threads");

        for( int i=1; i<= 10; i++) {
            System.out.println("Thread" + this.threadID + ":" + i + " " + this.threadName + " ");
            try {
                Thread.sleep(2000);
                // Belirli süre beklemek için kullanıyoruz
            } catch (InterruptedException e) { // Standart kullanım
                throw new RuntimeException(e);
            }
        } // end for
    } // end run
} // end class

class MainThread {
    public static void main(String[] args) throws InterruptedException{

        // Thread örnekleri oluşturulur
        ThreadExtends t1 = new ThreadExtends(1L, "Cook Meal");
        ThreadExtends t2 = new ThreadExtends(2L,"Dishwasher");
        ThreadExtends t3 = new ThreadExtends(3L, "Phone Call");

        // Başlangıç
        System.out.println("getName: " + t1.getName());
        System.out.println("hashcode: " + t1.hashCode());
        System.out.println("is alive ? " + t1.isAlive());

        // Programda öncelikle Yemek Pişirme çalışsın, diğer işler arka arkaya çalışsın

        t1.start();
        t1.join(); // "t1" işlemi/işi tamamlanana kadar bekler

        t2.start();
        t3.start();
    }
}
