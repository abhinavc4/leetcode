public class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length()-1;
        int l2 = b.length()-1;
        int carry = 0;
        StringBuilder s = new StringBuilder();
        for(;l1>=0||l2>=0||carry==1;l1--,l2--)
        {
            int a1 = l1>=0?a.charAt(l1)-'0':0;
            int b1 = l2>=0?b.charAt(l2)-'0':0;
            int sum = (a1^b1^carry);
            s.insert(0,sum);
            carry = (a1&b1)|(a1&carry)|(b1&carry);
        }
        return s.toString();
    }
}