package com.mgundogmus.day_1;

import java.util.ArrayList;
import java.util.List;

// List
// Örnek: Alışveriş Listesi
// Açıklama: Marketten alışverişi yaparken bir liste tutuyoruz. Bu liste sıralıdır. Aynı ürünü birden fazla kez ekleyebiliriz.
// 2 adet elma, 1 adet süt, 1 adet deterjan.

public class ShoppingList {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Elma");
        shoppingList.add("Kiraz");
        shoppingList.add("Deterjan");
        shoppingList.add("Süt");
        shoppingList.add("Elma");

        System.out.println("Alışveriş Listesi: " + shoppingList);
        System.out.println("İkinci öğe: " + shoppingList.get(1));
    }
}
