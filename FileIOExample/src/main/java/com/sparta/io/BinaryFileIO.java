package com.sparta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileIO {
    public static void readBinaryFile(String binaryFile){
        FileInputStream in = null;
        try {
            in = new FileInputStream(binaryFile);
            int theByte;
            while ((theByte = in.read()) != -1) { // -1 is EOF
                System.out.print(Character.toChars(theByte));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void copyBinaryFile(String binaryFile, String outFile){
        // try-with-resources
        // type of variable must be AutoCloseable
        try (FileInputStream in = new FileInputStream(binaryFile);
             FileOutputStream out = new FileOutputStream(outFile)) {
            int theByte;
            while ((theByte = in.read()) != -1) { // -1 is EOF
                System.out.print(Character.toChars(theByte));
                out.write(theByte);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
