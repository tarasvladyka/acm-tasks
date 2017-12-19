package com.vladyka.acm.task1011;

import java.util.*;

public class Image {
    private int height;
    private int width;
    private int[][] data;

    public Image(int height, int width) {
        this.height = height;
        this.width = width;
        data = new int[height][width];
    }

    @Override
    public String toString() {
        String result = "";
        for(int[] row : data){
            for(int elem : row){
               result += elem + " ";
            }
            result += "\n";
        }
        return result;
    }

    public int getMaxValue(){
        int max = data[0][0];
        for(int i = 0; i < height; i++)
            for (int j = 0; j < width; j++)
                if(data[i][j] > max)
                    max = data[i][j];
        return max;
    }

    public void manualFill() {
        Scanner scanner = Main.scanner;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                data[i][j] = scanner.nextInt();
        }
    }
    public void randomFill() {
        Random rand = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                data[i][j] = rand.nextInt(256);
        }
    }
    public int getElement(int rowIndex, int colIndex){
        return data[rowIndex][colIndex];
    }
    public void setElement(int rowIndex, int colIndex, int value){
        data[rowIndex][colIndex] = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
