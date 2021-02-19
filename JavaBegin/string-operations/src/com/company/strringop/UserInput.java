package com.company.strringop;

import java.io.IOException;

public class UserInput {
    public static void main(String[] args) throws IOException {
//        int read = System.in.read();
//        System.out.println(read); //Prints asci value
        int read;
        String str = "";
        while ((read = System.in.read()) != 10) {
            char read1 = (char) read;
            str = str + read1;
        }
        System.out.println(str);
    }
}
