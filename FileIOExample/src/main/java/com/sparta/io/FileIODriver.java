package com.sparta.io;

import java.io.IOException;

public class FileIODriver {
    public static void main(String[] args) {
//        BinaryFileIO.readBinaryFile("SortManagerReq.txt");
//        BinaryFileIO.copyBinaryFile("SortManagerReq.txt", "NewFile.txt");
//        BinaryFileIO.copyBinaryFile("Capture.JPG", "Output.jpg");
//        TextFileIO.copyTextFile("SortManagerReq.txt", "TextOut.txt");
        try {
            PathOperations.tryPathOps();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
