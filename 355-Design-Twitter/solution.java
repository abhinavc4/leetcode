public class Twitter {

    static int timestamp=0;
    HashMap <Integer,User> userMap ;
    /** Initialize your data structure here. */
    
    static class Tweet implements Comparable<Tweet>
    {
        int tweetId;
        Tweet next;
        int time ;
        Tweet(int tweetId)
        {
            this.tweetId = tweetId;
            next = null;
            time = ++timestamp;
        }
        public int compareTo(Tweet other)
        {
            return Integer.compare(other.time,this.time);
        }
    }
    static class User
    {
        int id;
        HashSet<Integer> followed;
        Tweet tweet_head;
        User(int id)
        {
            this.id = id;
            followed = new HashSet<>();
            follow(id);
            tweet_head = null;
        }
        void follow(int followerId)
        {
            followed.add(followerId);
        }
        
        void unfollow(int followerId)
        {
            followed.remove(followerId);
        }
        
        void postTweet(int tweetId)
        {
            Tweet twt = new Tweet(tweetId);
            twt.next = tweet_head;
            tweet_head = twt;
        }
        
        HashSet<Integer> getFollowed()
        {
            return followed;
        }
        
    }
    public Twitter() {
        userMap = new HashMap<Integer,User>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        User usr = userMap.get(userId);
        if(usr == null)
        {
            usr = new User(userId);
            userMap.put(userId,usr);
        }
        usr.postTweet(tweetId);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        User usr = userMap.get(userId);
        List<Integer> result = new ArrayList<Integer>();
        if(usr == null)
        {
            return result;
        }
        PriorityQueue<Tweet> q = new PriorityQueue<Tweet>(10);
            
        HashSet<Integer> userFollow = userMap.get(userId).getFollowed();
        for(Integer followed : userFollow)
        {
            User user = userMap.get(followed);
            if(user.tweet_head!=null)
            {
                q.add(user.tweet_head);
            }
        }
        int n = 0;
        while(n<10 && !q.isEmpty())
        {
            Tweet t = q.poll();
            result.add(t.tweetId);
            if(t.next!=null)
            {
                q.add(t.next);
            }
            n++;
        }
        return result;
        
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        User follower = userMap.get(followerId);
        if(follower == null)
        {
            follower = new User(followerId);
            userMap.put(followerId,follower);
        }
        
        User followee = userMap.get(followeeId);
        if(followee == null)
        {
            followee = new User(followeeId);
            userMap.put(followeeId,followee);
        }
        
        follower.follow(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId)||!userMap.containsKey(followeeId)||followerId == followeeId)
        {
            return;
        }
        
        userMap.get(followerId).unfollow(followeeId);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */