package com.sparta.io;

import java.io.*;

public class TextFileIO {
    public static void copyTextFile(String inFile, String outFile) {
        try (BufferedReader in = new BufferedReader(new FileReader(inFile));
             BufferedWriter out = new BufferedWriter(new FileWriter(outFile))){
            String lineOfText;
            while( (lineOfText = in.readLine()) != null){
                System.out.println(lineOfText);
                String[] words = lineOfText.split(" ");
                for (String word: words)
                    System.out.print(word + "/");
                out.write(lineOfText + "\n");
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
