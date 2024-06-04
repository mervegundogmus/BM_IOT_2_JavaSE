package com.mgundogmus.day_1;

import java.util.HashSet;
import java.util.Set;

// Set
// Örnek: Sınıftaki Öğrenci Kayıtları
// Bir sınıftaki öğrenci kayıtlarını tutarken bir öğrenci bir kez eklenir.
// Bir sınıfta iki Ayşe Java olmaz.

public class SetStudent {
    public static void main(String[] args) {
        Set<String> studentSet = new HashSet<>();
        studentSet.add("Rojda");
        studentSet.add("Büşra");
        studentSet.add("Dilara");
        studentSet.add("Dilara2");
        studentSet.add("Dilara");
        studentSet.add("Rojda");
        studentSet.add("Ali");

        System.out.println("Sınıftaki Öğrenciler: " + studentSet);
    }

}
