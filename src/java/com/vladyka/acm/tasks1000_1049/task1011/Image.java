package com.vladyka.acm.tasks1000_1049.task1011;

import java.util.*;

public class Image {

    private int height;
    private int width;
    private int radius;
    private List<List<Integer>> image = new LinkedList<List<Integer>>();

    public Image(int height, int width, int radius) {

        // 1 <= height <= 400
        if (height < 1) this.height = 1;
        else if (height > 400) this.height = 400;
        else this.height = height;

        // 1 <= width <= 250
        if (width < 1) this.width = 1;
        else if (width > 250) this.width = 250;
        else this.width = width;

        // 1 <= radius <= 20
        if (radius < 1) this.radius = 1;
        else if (radius > 20) this.radius = 20;
        else this.radius = radius;


    }


    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                System.out.print(this.image.get(i).get(j) + " ");
            System.out.println();
        }
    }

    public void manualFill() {
        Scanner scanner = new Scanner(System.in);
        this.clear();

        LinkedList<Integer> row = new LinkedList<Integer>();
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++)
                row.add(scanner.nextInt());
            this.image.add(row);
            row = new LinkedList<Integer>();
        }
    }

    public void randomFill() {

        this.clear();
        Random rand = new Random();
        LinkedList<Integer> row = new LinkedList<Integer>();

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++)
                row.add(rand.nextInt(256));
            this.image.add(row);
            row = new LinkedList<Integer>();
        }
    }

    public void clear () {
        this.image.clear();
    }

    public void filterImage() {
        List<List<Integer>> filteredImage = new LinkedList<List<Integer>>();

        LinkedList<Integer> row = new LinkedList<Integer>();
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                row.add(getMediana(i, j));
            }
            filteredImage.add(row);
            row = new LinkedList<Integer>();
        }
        this.image = filteredImage;
    }

    private int getMediana(int i, int j) {
        LinkedList<Integer> array = new LinkedList<Integer>();

        for (int m = i - this.radius; m <= i + this.radius; m++) {
            for (int n = j - this.radius; n <= j + this.radius; n++) {
                if (isCorrectIndex(m, n))
                    array.add(this.image.get(m).get(n));
                else
                    array.add(0);
            }
        }
        Collections.sort(array); // todo sort using comparator
        return array.get(array.size() / 2);
    }

    public boolean isCorrectIndex(int m, int n) {
        return  !(m < 0 || n < 0 || n >= width || m >= height);

    }

    public int getMaxFilter() {
        int max = image.get(0).get(0);
        for (int i = 0; i < height; i++) {
            for (int j = 1; j < width; j++) {
                if (image.get(i).get(j) > max)
                    max = image.get(i).get(j);
            }
        }
        return max;
    }
}
