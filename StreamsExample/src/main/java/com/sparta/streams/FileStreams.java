package com.sparta.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FileStreams {
    public static void main(String[] args) {
        try {
            Predicate<String> myPred = s->s.split(",")[5].equals("ON");
            System.out.println(Files
                    .lines(Path.of("canada.csv"))
                    .filter(myPred)
                    .map(s->{
                        String[] split = s.split(",");
                        return split[0] + " " + split[1];
                    })
                    .toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
