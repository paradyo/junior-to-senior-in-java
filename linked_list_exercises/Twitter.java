package linked_list_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Twitter {
    int lastId = 0;
    Node users;
    public Twitter() {
        users = new Node();
    }
    private class Tweet{
        int id;
        int alt_id;
        User user;
        public Tweet(int id, User user) {
            this.id = id;
            this.alt_id = lastId + 1;
            lastId++;
            this.user = user;
        }
    }
    private class User{
        int id;
        ArrayList<User> followers;
        ArrayList<User> followings;
        ArrayList<Tweet> tweets;
        public User() {
            this.id = lastId + 1;
            lastId++;
            this.tweets = new ArrayList<>();
            this.followings = new ArrayList<>();
            this.followers = new ArrayList<>();
        }
        public User(int userId) {
            this.id = userId;
            this.tweets = new ArrayList<>();
            this.followings = new ArrayList<>();
            this.followers = new ArrayList<>();
        }
        public void addTweetToTweets(Tweet tweet){
            for(int i = 0; i < tweets.size(); i++){
                if(tweets.get(i).equals(tweet)){
                    tweets.remove(i);
                    break;
                }
            }
            tweets.add(tweet);
        }
        public void addFollowerToFollowers(User user){
            for(int i = 0; i < followers.size(); i++){
                if(followers.get(i).equals(user)){
                    followers.remove(i);
                    break;
                }
            }
            followers.add(user);
        }
        public void deleteFollowerFromFollowers(User user){
            for(int i = 0; i < followers.size(); i++){
                if(followers.get(i).equals(user)){
                    followers.remove(i);
                    break;
                }
            }
        }
        public void addFollowingToFollowings(User user){
            for(int i = 0; i < followings.size(); i++){
                if(followings.get(i).equals(user)){
                    followings.remove(i);
                    break;
                }
            }
            followings.add(user);
        }
        public void deleteFollowingFromFollowings(User user){
            for(int i = 0; i < followings.size(); i++){
                if(followings.get(i).equals(user)){
                    followings.remove(i);
                    break;
                }
            }
        }
    }
    private class Node{
        User user;
        Node next;
        public Node() {
            this.user = new User();
        }
        public Node(int userId) {
            this.user = new User(userId);
        }
        public Node(User user, Node next) {
            this.user = user;
            this.next = next;
        }
    }

    public void postTweet(int userId, int tweetId) {
        Node data = users;
        Node user = null;
        while(data != null){
            if(data.user.id == userId){
                user = data;
                Tweet newTweet = new Tweet(tweetId, data.user);
                data.user.addTweetToTweets(newTweet);
                break;
            }
            data = data.next;
        }
        if(user == null){
            Node newNode = new Node(userId);
            newNode.next = users;
            users = newNode;
            postTweet(userId, tweetId);
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        ArrayList<Tweet> tweets = new ArrayList<>();
        Node data = users;
        while(data != null){
            if(data.user.id == userId){
                //own tweets
                tweets.addAll(data.user.tweets);
                //following's tweets
                for(User user : data.user.followings){
                    tweets.addAll(user.tweets);
                }
                break;
            }
            data = data.next;
        }
        Collections.sort(tweets, new Comparator<Tweet>() {
            @Override
            public int compare(Tweet item1, Tweet item2) {
                return Integer.compare(item2.alt_id, item1.alt_id);
            }
        });

        List<Integer> sortedIds = new ArrayList<>();
        for (Tweet item : tweets) {
            sortedIds.add(item.id);
        }
        return sortedIds.subList(0, Math.min(10, sortedIds.size()));
    }

    public void follow(int followerId, int followeeId) {
        Node data = users;
        Node followerData = null;
        Node followeeData = null;
        while(data != null){
            if(data.user.id == followeeId){
                followeeData = data;
            }
            else if(data.user.id == followerId){
                followerData = data;
            }
            data = data.next;
        }
        if(followeeData == null){
            Node newNode = new Node(followeeId);
            newNode.next = users;
            users = newNode;
            followeeData = newNode;
        }
        if(followerData == null){
            Node newNode = new Node(followerId);
            newNode.next = users;
            users = newNode;
            followerData = newNode;
        }
        followeeData.user.addFollowerToFollowers(followerData.user);
        followerData.user.addFollowingToFollowings(followeeData.user);
    }

    public void unfollow(int followerId, int followeeId) {
        Node data = users;
        Node followerData = null;
        Node followeeData = null;
        while(data != null){
            if(data.user.id == followeeId){
                followeeData = data;
            }
            else if(data.user.id == followerId){
                followerData = data;
            }
            data = data.next;
        }
        if(followeeData == null){
            Node newNode = new Node(followeeId);
            newNode.next = users;
            users = newNode;
            followeeData = newNode;
        }
        if(followerData == null){
            Node newNode = new Node(followerId);
            newNode.next = users;
            users = newNode;
            followerData = newNode;
        }
        followeeData.user.deleteFollowerFromFollowers(followerData.user);
        followerData.user.deleteFollowingFromFollowings(followeeData.user);
    }
}
