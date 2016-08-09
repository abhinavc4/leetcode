/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int result = 2;
        int low =1;
        int high = n;
        int mid = 0;
        while(result!=0)
        {
            mid = low+(high-low)/2;
            result = guess(mid);
            if(result ==-1)
            {
                high = mid-1;
            }
            else if(result ==1)
            {
                low = mid+1;
            }
        }
        return mid;
    }
}