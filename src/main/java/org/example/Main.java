package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(checkForPalindrome("I did, did I"));
        System.out.println(checkForPalindrome("I did, did i"));
        */
        /*
        WorkintechList workintechList = new WorkintechList();
        workintechList.get(0)
        */

        System.out.println(convertDecimalToBinary(13));
    }

    // Veri Yapıları Challenge I

        public static Boolean checkForPalindrome(String text){
        // ^ bu işaret, bunlar hariç anlamında kullanılıyor
            String cleanedString = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            LinkedList<Character> charList = new LinkedList<>();

            for (char c : cleanedString.toCharArray()){
                charList.add(c);
            }
            while (charList.size() > 1){
                if(!charList.pollFirst().equals(charList.pollLast())){
                    return false;
                }
            }
            return true;
        }

        public static String convertDecimalToBinary(int decimal){
            LinkedList<Integer> binaryList = new LinkedList<>();
            while (decimal > 0){
                int remainder = decimal % 2;
                binaryList.addFirst(remainder);
                decimal = decimal / 2;
            }
            StringBuilder binaryString = new StringBuilder();
            for (int digit : binaryList) {
                binaryString.append(digit);
            }
            return binaryString.toString();
    }




}