/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab13;

/**
 *
 * @author james
 */
public class Text {

    static boolean cont5Dig(String str) {
        return str.replaceAll("[^0-9]", "").length() == 5;
    }

    static int digitsCount(String str) {
        return str.replaceAll("[^0-9]", "").length();
    }

    static boolean noDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == 0;
    }

    static boolean digitsOnly(String str) {
        return str.replaceAll("[^0-9]", "").length() == str.length();
    }
}
