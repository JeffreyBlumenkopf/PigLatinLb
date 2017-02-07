package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String subString = "";
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter a word to be translated:");
        String userInput = scan1.nextLine();


        if (       (userInput.charAt(0)== 'a') || (userInput.charAt(0)== 'e')  || (userInput.charAt(0)== 'i')
                || (userInput.charAt(0)== 'o') || (userInput.charAt(0)== 'u') ){


                    userInput = userInput + "way";

                    System.out.println(userInput);



        }else {

            int vowelIndex = 0;

            for (vowelIndex = 0 ; vowelIndex < userInput.length()  ; vowelIndex++){

                char charOne = userInput.charAt(vowelIndex);

                if ( charOne == 'a' || charOne == 'e' || charOne == 'i'|| charOne == 'o'|| charOne == 'u'){
                    subString = userInput.substring(vowelIndex); /// return substring from a e i ou till end of word
                    subString = subString + userInput.substring(0, (vowelIndex)) + "ay";  //   add charAt0,  to end of word then add "ay"
                    System.out.println(subString);
                    break;
                }

            }

        }



    }
}
