package com.GiovanniDeFranceschi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    StringBuilder sb = new StringBuilder();
    sb.append(input);
        System.out.println(sb);
    sb.reverse();
        System.out.println(sb);
    String stringFromStringBuilder = sb.toString();
    int stringLength= stringFromStringBuilder.length();
    String reversedString="";
    for(int i=stringLength-1; i>=0; i--){
            char newChar=stringFromStringBuilder.charAt(i);
            reversedString = reversedString + newChar;
        }
        System.out.println(reversedString);
    }
}
