package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class CoinSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coins = {50, 20, 10, 5, 2, 1};
        int target = 923;
        int miniCoins = CoinSelectionTest.getMiniCoins(coins, target);
        System.out.println("Maximum coins needed: " + miniCoins);
    }
}
class CoinSelectionTest{
    public static int getMiniCoins(int[] coinDenoms, int target){
        // Sort coin denominations ascending
        Arrays.sort(coinDenoms);

        int miniCoins = 0;
        int index = coinDenoms.length - 1;


        while (target > 0) {
            int currentCoin = coinDenoms[index];

            if (currentCoin <= target) {
                int maxAmount = target / currentCoin;
                target = target - currentCoin * maxAmount;
                miniCoins = miniCoins + maxAmount;
                System.out.println("Taking " + maxAmount + " of " + currentCoin);
            } else{
                index--;
            }
        }
        return miniCoins;
    }
}
