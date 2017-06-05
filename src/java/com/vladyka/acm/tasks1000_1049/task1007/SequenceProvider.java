package com.vladyka.acm.tasks1000_1049.task1007;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SequenceProvider {
    public Scanner scanner = new Scanner(System.in);

    public List<Integer> fromConsole(int amount) {
        LinkedList<Integer> sequence = new LinkedList<>();
        for (int i = 1; i <= amount; i++) {
            sequence.add(scanner.nextInt());
        }
        return sequence;
    }

    public List<Integer> fromRandom(int amount) {
        LinkedList<Integer> sequence = new LinkedList<>();
        Random random = new Random();
        sequence.add(1);
        for (int i = 1; i <= amount; i++) {
            sequence.add(sequence.get(i - 1) + 1 +
                    random.nextInt(70));
        }
        return sequence;
    }
}
