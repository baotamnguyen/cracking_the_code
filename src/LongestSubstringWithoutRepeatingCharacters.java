import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    /*
   Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
    */
    public static void main(String[] args) {
        HashSet<Character> uniqueSetOfCharacters = new HashSet<Character>();
        String input = args[0];
        int length = 0;
        if (!input.isEmpty()) {
            char[] chars = input.toCharArray();
            int inputIndex = 0;
            for (int i = 0; i < chars.length; i++) {
                inputIndex = i;
                char aChar = chars[i];
                uniqueSetOfCharacters.add(aChar);
                if (inputIndex+1 < chars.length) {
                    for (int j = inputIndex+1; j < chars.length; j++) {
                        char bChar = chars[j];
                        if (!uniqueSetOfCharacters.contains(bChar)) {
                            uniqueSetOfCharacters.add(bChar);
                        } else {
                            System.out.println(uniqueSetOfCharacters.toString());
                            int size = uniqueSetOfCharacters.size();
                            System.out.println("size: " + size);
                            if (size > length) {
                                length = size;
                            }
                            uniqueSetOfCharacters.clear();
                        }
                    }
                }


            }
        }
        System.out.println("Max length of string: " + input + " is " + length);

    }
}
