package task1007;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SequenceProvider {
    public static Scanner scanner = new Scanner(System.in);

    public List<Integer> provide(int amount) {
        LinkedList<Integer> sequence = new LinkedList<>();
        for (int i = 1; i <= amount; i++) {
            sequence.add(scanner.nextInt());
        }
        return sequence;
    }
}
