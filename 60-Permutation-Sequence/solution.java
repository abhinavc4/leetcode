public class Solution {
    public String getPermutation(int n, int k) {
        int pos = 0;
        List<Integer> numbers = new ArrayList<Integer>();
        int[] factorial = new int [n + 1];
        factorial[0]=1;
        
        int sum = 1;
        for(int i = 1 ; i<=n;i++)
        {
            sum *= i;
            factorial[i]=sum;
            numbers.add(i);
        }
        StringBuilder str = new StringBuilder();
        k--;
        for(int i = 1 ; i <=n ; i++)
        {
            int index = k/factorial[n-i];
            str.append(numbers.get(index));
            numbers.remove(index);
            k -= index*factorial[n-i];
        }
        return str.toString();
    }
}