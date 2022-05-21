package Array;

import java.util.Arrays;

public class Anagram {

    public boolean solve(char[] word1, char[] word2){
        if(word1.length != word2.length) return false;
        // sort the letters of the string
        Arrays.sort(word1);
        Arrays.sort(word2);

        // consider letter one by one;

        for(int i=0;i<word1.length;i++)
            if(word1[i] != word2[i])
                return false;
        return true;


    }
}
