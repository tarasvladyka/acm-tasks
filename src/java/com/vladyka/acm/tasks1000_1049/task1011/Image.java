package com.vladyka.acm.tasks1000_1049.task1011;

import java.util.*;

public class Image {
    private int height;
    private int width;
    private int radius;

    private List<List<Integer>> array = new LinkedList<List<Integer>>();

    public Image(int height, int width, int radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }
    private int getMediana(int i, int j) {
        LinkedList<Integer> row = new LinkedList<Integer>();
        for (int m = i - this.radius; m <= i + this.radius; m++) {
            for (int n = j - this.radius; n <= j + this.radius; n++) {
                if (isCorrectIndex(m, n))
                    row.add(this.array.get(m).get(n));
                else
                    row.add(0);
            }
        }
        Collections.sort(row); // todo sort using comparator
        return row.get(array.size() / 2);
    }

    private boolean isCorrectIndex(int m, int n) {
        return  !(m < 0 || n < 0 || n >= width || m >= height);
    }

    public int getMaxFilter() {
        int max = array.get(0).get(0);
        for (int i = 0; i < height; i++) {
            for (int j = 1; j < width; j++) {
                if (array.get(i).get(j) > max)
                    max = array.get(i).get(j);
            }
        }
        return max;
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                System.out.print(this.array.get(i).get(j) + " ");
            System.out.println();
        }
    }

    public void manualFill() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.height; i++) {
            LinkedList<Integer> row = new LinkedList<Integer>();
            for (int j = 0; j < this.width; j++)
                row.add(scanner.nextInt());
            this.array.add(row);
        }
    }
    public void randomFill() {
        Random rand = new Random();
        for (int i = 0; i < this.height; i++) {
            LinkedList<Integer> row = new LinkedList<Integer>();
            for (int j = 0; j < this.width; j++)
                row.add(rand.nextInt(256));
            this.array.add(row);
        }
    }
    public void clear () {
        this.array.clear();
    }

    public void filterImage() {
        List<List<Integer>> filteredArray = new LinkedList<List<Integer>>();
        for (int i = 0; i < this.height; i++) {
            LinkedList<Integer> row = new LinkedList<Integer>();
            for (int j = 0; j < this.width; j++) {
                row.add(getMediana(i, j));
            }
            filteredArray.add(row);
        }
        this.array = filteredArray;
    }
}
