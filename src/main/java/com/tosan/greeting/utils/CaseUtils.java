package com.tosan.greeting.utils;

public class CaseUtils {
    public static String toCamelCase (String str){
        String[] wordList = str.toLowerCase().split("_");
        String finalStr = "";
        for (String word : wordList) {
            finalStr += capitalize(word);
        }
        return finalStr;
    }

    public static String capitalize (String line){
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
}
