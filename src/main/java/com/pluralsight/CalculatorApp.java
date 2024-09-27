package com.pluralsight;
import java.util.*;

public class CalculatorApp
{
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int id = 10135;
        String name = "Brandon Players";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);
    }
}
