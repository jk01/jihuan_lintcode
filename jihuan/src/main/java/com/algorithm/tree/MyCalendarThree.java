package com.algorithm.tree;

import java.util.TreeMap;

public class MyCalendarThree {
    public MyCalendarThree() {

    }
    private TreeMap<Integer, Integer> timeline = new TreeMap<>();
    public int book(int start, int end) {
        timeline.put(start, timeline.getOrDefault(start, 0) + 1);
        timeline.put(end, timeline.getOrDefault(end, 0) - 1);
        int ongoing = 0, k = 0;
        for (int v : timeline.values()) {
            k = Math.max(k, ongoing += v);
        }
        return k;
    }
}
