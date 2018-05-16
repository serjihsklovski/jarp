package com.serjihsklovski.jarp;

public class Application {

    public static void main(String[] args) {
        int argsLength = args.length;
        int numberColumnWidth = String.valueOf(argsLength).length();
        for (int i = 0; i < argsLength; i++) {
            int number = i + 1;
            String numberColumn = getNumberColumn(number, numberColumnWidth);
            System.out.println(String.format("%s |%s|", numberColumn, args[i]));
        }
    }

    private static String getNumberColumn(int number, int numberColumnWidth) {
        StringBuilder numberColumn = new StringBuilder();
        int spacesCount = getSpacesCount(number, numberColumnWidth);
        for (int i = 0; i < spacesCount; i++) {
            numberColumn.append(' ');
        }
        numberColumn.append(number);
        return numberColumn.toString();
    }

    private static int getSpacesCount(int number, int numberColumnWidth) {
        int numberWidth = String.valueOf(number).length();
        return numberColumnWidth - numberWidth;
    }

}
