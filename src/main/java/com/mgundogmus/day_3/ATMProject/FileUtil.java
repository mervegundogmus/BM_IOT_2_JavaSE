package com.mgundogmus.day_3.ATMProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
    public static String readPassword(String userName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(userName)) {
                    return parts[1];
                }
            }
        }
        return null;
    }
}
