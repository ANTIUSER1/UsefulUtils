/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pns.utils;

import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jpdw
 */
public class RSrings {

    final public static String LATIN_SMALL = "latin";
    final public static String LATIN_LARGE = "LATIN";
    final public static String DIGITS = "DIGITS";

    /**
     * Gets a random String
     *
     * @return
     */
    public static String rndString() {
        char[] c = RBytes.rndCharArray();
        return new String(c);

    }

    /**
     * Gets a random String of fixed length
     *
     * @return
     */
    public static String rndString(int length) {
        char[] c = RBytes.rndCharArray(length);
        return new String(c);

    }

    /**
     * Gets a random String jf characters between min and max
     *
     * @return
     */
    public static String rndString(char min, char max) {
        char[] c = RBytes.rndCharArray(min, max);
        return new String(c);

    }

    /**
     * Gets a random String of characters between min and max and having fixed
     * length
     *
     * @return
     */
    public static String rndString(int length, char min, char max) {
        char[] c = RBytes.rndCharArray(length, min, max);
        return new String(c);
    }

    /**
     * Gets a random String of fixed charset
     *
     * @return
     */
    public static String rndString(String type) {
        char min = ' ';
        char max = ' ';
        if (type.trim().equals(LATIN_LARGE)) {
            min = 'A';
            max = 'Z';
        } else if (type.trim().equals(LATIN_SMALL)) {
            min = 'a';
            max = 'z';
        } else if (type.trim().equals(DIGITS)) {
            min = '0';
            max = '9';
        }
        char[] c = RBytes.rndCharArray(min, max);
        return new String(c);

    }

    /**
     * Gets a random String of fixed charset and fixed length
     *
     * @return
     */
    public static String rndString(int length, String type) {
        char min = ' ';
        char max = ' ';
        if (type.trim().equals(LATIN_LARGE)) {
            min = 'A';
            max = 'Z';
        } else if (type.trim().equals(LATIN_SMALL)) {
            min = 'a';
            max = 'z';
        } else if (type.trim().equals(DIGITS)) {
            min = '0';
            max = '9';
        }
        char[] c = RBytes.rndCharArray(length, min, max);
        return new String(c);

    }

    /**
     * Gets a random String of fixed charset, fixed additional characters and
     * fixed length
     *
     * @return
     */
    public static String rndString(int length, String type, char[] cc) {
        char min = ' ';
        char max = ' ';
        if (type.trim().equals(LATIN_LARGE)) {
            min = 'A';
            max = 'Z';
        } else if (type.trim().equals(LATIN_SMALL)) {
            min = 'a';
            max = 'z';
        } else if (type.trim().equals(DIGITS)) {
            min = '0';
            max = '9';
        }
        String CC = new String(cc);
        char[] c = RBytes.rndCharArray(length, min, max);
        return new String(c) + CC;
    }

    /**
     * Gets the code data string? using fixed string array and fixeddelimiter
     *
     * @param sData
     * @param delimiter
     * @return
     */
    public static String codeString(String[] sData, char delimiter) {
        String result = "";
        for (int i = 0; i < sData.length; i++) {
            if (i < sData.length - 1) {
                result += sData[i] + delimiter;
            } else {
                result += sData[i];
            }
        }
        return result;
    }

    /**
     * Shaffling given string
     *
     * @param string
     * @return
     */
    public static String shaffleString(String string) {
        Shaffle s = new Shaffle();
        return s.shuffle(string);
    }

    /**
     * Breaks given string to the token Array
     *
     * @param string
     * @return
     */
    public static String[] strParts(String string) {
        //StringTokenizer st = new StringTokenizer(string);
        String[] strings = string.split("\\s+");
        return removeSpaces(strings);
    }

    /**
     * Clears the long whitespaces in the given string
     *
     * @param str
     * @return
     */
    public static String clearLongWhitespaces(String str) {

        if (str == null) {
            str = "";
        }
        String result = "";
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s != null) {
                result += s + " ";
            }
        }
        return result.trim();
    }

    /**
     * Breaks given string to the token Array, using given delimeter
     *
     * @param string
     * @return
     */
    public static String[] strParts(String string, String delim) {
        //StringTokenizer st = new StringTokenizer(string);
        String[] strings = string.split(delim);
        return removeSpaces(strings);
    }

    /**
     * With every string in array String[] removes whete spaces from its end
     *
     * @param strings
     * @return
     */
    public static String[] removeSpaces(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
        return strings;
    }

}
