package com.mgundogmus.day_1;

import java.util.HashMap;
import java.util.Map;

public class MapBarcode {
    public static void main(String[] args) {
        Map<String, String> barcodeList = new HashMap<>(); // key-value
        barcodeList.put("staff_barcode1", "12345");
        barcodeList.put("staff_barcode2", "54860");

        System.out.println("Staff List: " + barcodeList);
    }
}
