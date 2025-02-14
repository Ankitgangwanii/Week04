package com.tit.exceptionhandling.trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

        public static void main(String[] args) {
            String fileName = "data.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String first_Line;
                if((first_Line = reader.readLine()) != null) {
                    System.out.println(first_Line);
                }

            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        }
    }

