package medium.q017;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abosen
 * @date 2018/08/28
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() != 0) {
            backtracking(digits, "", list);
        }
        return list;
    }

    private void backtracking(String digits, String letter, List<String> list) {
        int index = letter.length();
        if (index == digits.length()) {
            list.add(letter);
            return;
        }
        String[] strings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int digit = digits.charAt(index) - '0';
        for (char c : strings[digit].toCharArray()) {
            backtracking(digits, letter + c, list);
        }
    }
}
