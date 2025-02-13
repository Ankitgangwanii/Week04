package com.tit.votingsystem;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCount;
    private LinkedHashMap<String, Integer> voteOrder;

    public VotingSystem() {
        voteCount = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
    }

    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate));
    }

    public void displayResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);
        System.out.println("Sorted Results (Alphabetical Order): " + sortedResults);
        System.out.println("Vote Order (Sequence of Votes Cast): " + voteOrder);
    }

    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        system.castVote("Ankit");
        system.castVote("Aadarsh");
        system.castVote("Aditya");
        system.castVote("Aditya");
        system.castVote("Aadarsh");
        system.castVote("Ankit");

        system.displayResults();
    }
}

