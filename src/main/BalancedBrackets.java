package main;


import java.util.ArrayList;
import java.util.List;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        int bracketCount = 0;

        for (char ch : str.toCharArray()) {

            if (ch == '[') {
                brackets++;
                bracketCount++;
            } else if (ch == ']') {
                brackets--;
                bracketCount++;
            }

            if (brackets < 0 || brackets > 1) {
                return false;
            }

        }

        if (bracketCount > 0) {
            return brackets == 0;
        } else {
            return false;
        }

    }
}

//    List<Integer> openIndexCheck = new ArrayList<>();
//    List<Integer> closeIndexCheck = new ArrayList<>();
//        for (char ch : str.toCharArray()) {
//                if (ch == '[') {
//                int i = 0;
//                brackets++;
//                bracketCount++;
//                if (openIndexCheck.size() == 0) {
//                openIndexCheck.add(str.indexOf(ch));
//                } else {
//                openIndexCheck.add(str.indexOf(ch, openIndexCheck.get(i) + 1));
//                i++;
//                }
//                } else if (ch == ']') {
//                int j = 0;
//                brackets--;
//                bracketCount++;
//                if (closeIndexCheck.size() == 0) {
//                closeIndexCheck.add(str.indexOf(ch));
//                } else {
//                closeIndexCheck.add(str.indexOf(ch, closeIndexCheck.get(j) + 1));
//                j++;
//                }
//                }
//                if (brackets < 0) {
//        return false;
//        } else if (brackets > 1) {
//        return false;
//        }
//        }
//        if (bracketCount > 0 && openIndexCheck.get(0) < closeIndexCheck.get(0)) {
//        return brackets == 0;
//        } else {
//        return false;
//        }
//
//        }
