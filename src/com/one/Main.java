package com.one;

import java.util.Scanner;
import com.one.ConsoleController;
public class Main {

    public static void main(String[] args) {
        int resultArraySize = 0;
        int resultArrayIndex = 0;

        ConsoleController consoleController = new ConsoleController();
        int[] myArray = consoleController.getArrayFromConsole();

        consoleController.outLn("myArray includes: ");

        consoleController.printArray(myArray);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                resultArraySize++;
            }
        }
        int[] resultArray = new int[resultArraySize];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                resultArray[resultArrayIndex] = myArray[i];
                resultArrayIndex++;
            }
        }
        consoleController.outLn("resultArray: ");
        consoleController.printArray(resultArray);
    }

}

