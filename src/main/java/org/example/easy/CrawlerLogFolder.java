package org.example.easy;

public class CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        int result = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                result = result == 0 ? result : result - 1;
                continue;
            }
            if (log.equals("./")) {
                continue;
            }
            result++;
        }
        return result;
    }
}
