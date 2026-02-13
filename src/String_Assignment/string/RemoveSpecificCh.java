package com.gla.string;

import java.util.Scanner;

public class RemoveSpecificCh {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String a = s.next();
       boolean found = true;
       String e = "";
       char c = s.next().charAt(0);
       for (int i = 0; i < a.length(); i++) {
           char ch = a.charAt(i);
           if (ch != c) {
               e = e + ch;
           }    }
           System.out.print(e);

   }}
