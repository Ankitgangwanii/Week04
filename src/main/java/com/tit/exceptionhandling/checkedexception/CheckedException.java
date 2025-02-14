package com.tit.exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

        public static void main(String[] args) {
            String fileName = "data.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) { // Catching specific exception first
                System.out.println("File not found");
            } catch (IOException e) { // Handling other IO exceptions
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }
        }
    }
