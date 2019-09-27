package com.example.matillion.matillion;

import com.example.matillion.matillion.exception.DifferenceBetweenStringsException;
import com.example.matillion.matillion.task1.service.StringDifference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class MatillionApplication implements CommandLineRunner {

    private StringDifference stringDifference = new StringDifference();

    public static void main(String[] args) {
        SpringApplication.run(MatillionApplication.class, args);
    }

    @Override
    public void run(String... args) throws DifferenceBetweenStringsException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("......PART 1......");
        System.out.println("Enter first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter second string: ");
        String secondString = scanner.nextLine();
        System.out.println(stringDifference.differenceBetweenTwoStrings(firstString, secondString));
    }

}

