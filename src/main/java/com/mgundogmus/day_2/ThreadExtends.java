package com.mgundogmus.day_2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ThreadExtends extends Thread {
    // Variable
    private Long threadID;
    private String threadName;

    public ThreadExtends() {
    }

    public ThreadExtends(Long threadID, String threadName) {
        this.threadID = threadID;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread Extends");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Thread" + this.threadID + ": " + i + " " + this.threadName + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } //end for
    } //end run
} //end class

// PSVM
class ThreadTextMain {
    public static void main(String[] args) throws InterruptedException {
        // Thread Instance
        ThreadExtends t1 = new ThreadExtends(1L, "zoom");
        ThreadExtends t2 = new ThreadExtends(2L, "intellij idea");
        ThreadExtends t3 = new ThreadExtends(3L, "Browser");

        // Start
        System.out.println("getName:" + t1.getName());
        System.out.println("hashcode:" + t1.hashCode());
        System.out.println("is alive ? " + t1.isAlive());

        // bu programlarda öncelikle zoom çalışsın sonrasında diğer programlar çalışsın
        t1.start();
        t1.join();

        t2.start();
        t3.start();

    }
}

