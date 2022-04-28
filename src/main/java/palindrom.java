public class palindrom {

    public boolean solve(String s1){
        int forward = 0;
        int backward = s1.length()-1;

        while(forward<backward){
            if (s1.charAt(forward) != s1.charAt(backward))
                return false;
            forward++;
            backward--;

        }

        return true;
    }
}
