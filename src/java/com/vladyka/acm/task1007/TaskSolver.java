package com.vladyka.acm.task1007;

import java.util.LinkedList;
import java.util.List;

public class TaskSolver {
    private List<Integer> sequence;

    public TaskSolver(List<Integer> sequence) {
        this.sequence = sequence;
    }

    public void solve() {
        if (!isSorted()) {
            System.out.println("NOT SUPER[CAUSE NOT SORTED]");
            return;
        }
        try {
            for (int currentNumber : sequence) {
                List<Integer> seqWithoutCurrNum = new LinkedList<>(
                        sequence.subList(0, sequence.indexOf(currentNumber)));
                seqWithoutCurrNum.remove(new Integer(currentNumber));

                List<Integer> whyList = new LinkedList<>();
                whyList.add(currentNumber);

                checkNumber(seqWithoutCurrNum, currentNumber, whyList);
            }
            System.out.println("Yes");
        } catch (NotSuperSequenceException e) {
            System.out.println("No[CAUSE " + e.getMessage() + "]");
        }
    }

    private boolean isSorted() {
        for (int i = 1; i < sequence.size(); i++) {
            if (sequence.get(i) <= sequence.get(i - 1))
                return false;
        }
        return true;
    }

    private static void checkNumber(List<Integer> sequence, int targetNumber, List<Integer> whyList) {
        if (sequence.size() == 0 || targetNumber < 0)
            return;
        if (targetNumber == 0) {
            throw new NotSuperSequenceException(whyList.get(0) + " = " +
                    whyList.subList(1, whyList.size()));
        }
        for (int currentNumber : sequence) {
            List<Integer> seqWithoutCurrentNum = new LinkedList<>(sequence);
            List<Integer> newWhyList = new LinkedList<>(whyList);
            seqWithoutCurrentNum.remove(new Integer(currentNumber));
            newWhyList.add(currentNumber);
            checkNumber(seqWithoutCurrentNum, targetNumber - currentNumber, newWhyList);
        }
    }


}
