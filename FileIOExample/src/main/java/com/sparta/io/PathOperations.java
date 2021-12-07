package com.sparta.io;

import java.io.File;
import java.io.IOException;

public class PathOperations {
    public static void tryPathOps() throws IOException {
        File file = new File("TestDoc.file");
        if(!file.exists()) {
            boolean success = file.createNewFile();
            System.out.println("File created: " + success);
        }
        File dir = new File("testdir");
        dir.mkdir();
    }
}
