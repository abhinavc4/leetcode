public class Solution {
    public String intToRoman(int num) {
    String [] ones  =  {"", "I" , "II", "III" , "IV" , "V" , "VI" , "VII" , "VIII" , "IX"}; 
    String [] tens  =  {"", "X" , "XX", "XXX" , "XL" , "L" , "LX" , "LXX" , "LXXX" , "XC"};
    String [] hunds =  {"", "C" , "CC" , "CCC" ,"CD" , "D" , "DC" , "DCC" , "DCCC" , "CM"};
    String [] thous =  {"", "M" ,"MM" ,"MMM"};
    //1405
    String val = thous[(int)(num/1000)] + hunds[(int)((num%1000)/100)] + tens[(int)((num%100)/10)] +  ones[(int)(num%10)];
    return val;
    
    }
}