package org.example;

import java.io.IOException;

/**
 * Mini WebApplicationServer 구현
 * */
public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
    }
}