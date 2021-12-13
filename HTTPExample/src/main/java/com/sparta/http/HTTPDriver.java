package com.sparta.http;

import java.io.IOException;

public class HTTPDriver {
    public static void main(String[] args) {
        String body = null;
        try {
            body = HTTPProcessor.getBody("https://www.spartaglobal.com");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(body);
    }
}
