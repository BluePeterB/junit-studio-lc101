package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     * <p>
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     * <p>
     * The string may contain non-bracket characters as well.
     * <p>
     * These strings have balanced brackets:
     * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     * <p>
     * While these do not:
     * "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        boolean result = true;  //init to true

        if (str.equals("")) {
            result = false;  // set to return false even if no other failure
        }
        //***Test for even numbers***
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
            //Test for not non-facing pairs
            if (brackets > 1 || brackets < 0) {
                result = false;
                break;
            }

        }  // end for

        //Test for correct numbers of brackets
        if (!(brackets == 0)) {
            result = false;
        }

        return result;
    }  // end method
}  // end class

        /* ****Test for matching pairs***
        boolean flag = false;
        for (char ch : str.toCharArray()) {
            result = ((ch == '['  && !flag) ||;
            if (!result) {break;}

            result = (ch == ']' && flag);
                flag = false;
                brackets--;;           }
        }
        if (!(brackets == 0)) {
            result = false;
        }
        return result;
    } //end hasBalancedBrackets
*/


