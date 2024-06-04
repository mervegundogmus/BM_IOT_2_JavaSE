package com.mgundogmus.day_1;

import java.util.HashMap;
import java.util.Map;

// Map
// Örnek: Telefon Rehberi
// Rehberde her kişiye ait bir telefon numarası atanır. İsimleri kişilerin benzersizdir.

public class MapPhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Dilara", "555-1234");
        phoneBook.put("Rojda", "555-5678");
        phoneBook.put("Mehmet", "555-1234");
        phoneBook.put("Dilara", "999-1234");

        //System.out.println("Dilara'nın numarası: " + phoneBook.get("Dilara"));
        //System.out.println("Rojda'nın numarası: " + phoneBook.get("Rojda"));
        //System.out.println("Mehmet'in numarası: " + phoneBook.get("Mehmet"));
        System.out.println("Rehber: " + phoneBook);
    }
}
