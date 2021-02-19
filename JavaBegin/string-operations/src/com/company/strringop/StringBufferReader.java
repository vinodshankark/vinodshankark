package com.company.strringop;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferReader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int s = Integer.parseInt(bufferedReader.readLine());
        System.out.println(s);
    }
}
