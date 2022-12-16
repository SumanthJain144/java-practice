package com.sumanth.interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

/**
 * If the fileReader constructor throws an IOException,which are correct below
 * <p>
 * 1. The result of file.readLine() will be assigned to the variable buffer.
 * 2. An error message will be printed to the console.
 * 3. The file variable will be compared to null.
 * 4. The file.close() function will be called.
 * 5. The function will return null.
 */
public class FileReaderExceptionCheck {

    public static void main(String[] args) {
        String path = "path";
        System.out.println("result" + readFirstLine(path));
    }

    static String readFirstLine(String path) {
        BufferedReader file = null;
        String buffer = null;
        try {
            file = new BufferedReader(new FileReader(path));
            buffer = file.readLine();
            System.out.println("buffer - " + buffer);
        } catch (IOException e) {
            System.out.println("error while reading file from " + path + "| message - " + e.getMessage());
        } finally {
            if (file != null) {
                System.out.println("inside if check");
                try {
                    file.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return buffer;
    }
}
