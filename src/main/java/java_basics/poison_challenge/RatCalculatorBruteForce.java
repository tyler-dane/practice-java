package java_basics.poison_challenge;

import java.util.*;


public class RatCalculatorBruteForce {

    /** returns the minimum number of rats required to identify which of n milk glasses contained poison */
    private int getMinTestRats(int n) {
        int combinations = 0;
        int minimumRats = 0;

        while (combinations  < n) {
            minimumRats++;
            combinations  = findCombinations(minimumRats);
        }

        return minimumRats;
    }

    private int findCombinations(int minimumRats) {
        // { [0] }      <-- initial set
        // { [0], [1] } <-- 2 combos
        // { [0], [1], [1,2], [2] }     <-- 4 combos
        // { [0], [1], [1,2], [1,3], [1,2,3], [2], [2,3], [3] } <-- 8 combos

        Set<List<Integer>> ratSet = new HashSet<>();
        ratSet.add(Collections.singletonList(0));   // account for scenario when no rats die
        ratSet.add(Collections.singletonList(minimumRats));
        System.out.println(ratSet);
        System.out.println("unique combos:" + ratSet.size());

        int uniqueCombos = ratSet.size();
        ratSet.clear();

        return uniqueCombos;
    }


    public static void main(String[] args) {
        int numberMilkGlasses = 8;
        RatCalculatorBruteForce rc = new RatCalculatorBruteForce();
        String message = String.format("%d milk glasses requires a minimum of %d rats",
                numberMilkGlasses, rc.getMinTestRats(numberMilkGlasses));
        System.out.println(message);
    }
}

