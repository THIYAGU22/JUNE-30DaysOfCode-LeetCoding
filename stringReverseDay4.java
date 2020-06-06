class stringReverseDay4 {
    public static void reverse(char[] s,int start,int end)
    {
        if(start>=end){
            return ;
        }
        char t = s[start];
        s[start++] = s[end];
        s[end--] = t;
        reverse(s,start,end);
    }
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
}
