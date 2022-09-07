package com.cydeo.pages;

import java.util.Arrays;

public class ALI {
    public static void main(String[] args) {



        String str = "dcf501gyhku098911";
        String result = "";
        String letter = "";
        String digit = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                letter += str.charAt(i);
            }else {
                digit += str.charAt(i);
            }

            if (Character.isLetter(c) || (i==str.length()-1)) {

                String[] d = digit.split("");
                Arrays.sort(d);
                for (String each : d) {
                    result+=each;
                }
                digit = "";
            }

            if (Character.isDigit(c) || (i==str.length()-1)){
                String[] l = letter.split("");
                Arrays.sort(l);
                for (String each : l) {
                    result+=each;
                }
                letter = "";
            }
        }
        System.out.println(result);




                String original = "DC501GCCCA098911Z";

                System.out.println("original = " + original);

                String revised = "";

                //loop thru original String to separate alpha- from numeric- substrings with a comma
                for (int i = 0; i < original.length() - 1; i++) {
                    char ch = original.charAt(i); //current character
                    char chNext = original.charAt(i + 1); //next character

                    //compare current with next character to confirm whether they are both digits or capital letters
                    //if they are: add to the revised String; otherwise, put a comma as a separator
                    if (ch >= '0' && ch <= '9' && chNext >= '0' && chNext <= '9') {  //0~9 --> digit
                        revised += ch;

                    } else if (ch >= 65 && ch <= 90 && chNext >= 65 && chNext <= 90){  //65~90 --> capital letter
                        revised += ch;

                    } else {
                        revised += ch + ",";
                    }
                }

                //the loop omits the last character, so I have to manually add it to the String
                revised += original.charAt(original.length()-1);

                System.out.println("revised = " + revised);

                String [] arr = revised.split(","); //split the String into String array

                String sorted = "";

                for (String s : arr) { //for each loop to get access to each individual String
                    char[] arr1 = s.toCharArray(); //convert each element (individual String) to char array
                    Arrays.sort(arr1); //sort each char array
                    sorted += String.valueOf(arr1); //append each sorted char array to the sorted String
                }

                System.out.println("sorted = " + sorted);

            }
        }



