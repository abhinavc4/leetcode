public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)
        {
            return "0";
        }
        StringBuilder str = new StringBuilder();
        if(numerator<0 ^ denominator<0)
        {
            str.append("-");
        }
        Long dividend = Math.abs(Long.valueOf(numerator));
        Long divisor = Math.abs(Long.valueOf(denominator));
        str.append(String.valueOf(dividend/divisor));
        Long remainder = dividend % divisor;
        if(remainder == 0)
        {
            return str.toString();
        }
        str.append(".");
        HashMap<Long,Integer> hm = new HashMap<>();
        while(remainder!=0)
        {
            if(hm.containsKey(remainder))
            {
                str.insert(hm.get(remainder),"(");
                str.append(")");
                break;
            }
            hm.put(remainder,str.length());
            remainder*=10;
            str.append(String.valueOf(remainder/divisor));
            remainder %= divisor;
        }
        return str.toString();
    }
}