package org.example.easy;

public class WaterBottles {

    public static int waterBottles(int numBottles, int numExchange) {
        if (numExchange > numBottles) {
            return numBottles;
        }
        int bottlesResult = numBottles + numBottles / numExchange;
        int emptyBottles = numBottles / numExchange + numBottles % numExchange;
        while (emptyBottles >= numExchange) {
            bottlesResult++;
            emptyBottles -= numExchange;
            emptyBottles++;
        }
        return bottlesResult;
    }
}
