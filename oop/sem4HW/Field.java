package oop.sem4HW;

import java.util.Random;

public class Field {
    int[][] field = new int[10][10];
    Random HorizontalOrVertical = new Random();
    Random randomFieldStart = new Random();
    int[] catPoints = new int[2];

    public int[][] fillingField() {
        puttingObstacles();
        puttingCatAndDoors();

        return this.field;
    }

    public void puttingCatAndDoors() {

        int count = 0;

        while (count < 5) {
            int HorizontalOrVerticalVar = HorizontalOrVertical.nextInt(1, 3);
            int randomFieldPointX = randomFieldStart.nextInt(0, 9);
            int randomFieldPointY = randomFieldStart.nextInt(0, 9);

            if (HorizontalOrVerticalVar == 1 &&
                    field[randomFieldPointX][randomFieldPointY] != -1
                    && field[randomFieldPointX][randomFieldPointY] != 88
                    && field[randomFieldPointX][randomFieldPointY] != 1) {
                if (count == 0) {
                    this.field[randomFieldPointX][randomFieldPointY] = 1;
                    catPoints[0] = randomFieldPointX;
                    catPoints[1] = randomFieldPointY;
                } else
                    this.field[randomFieldPointX][randomFieldPointY] = 88;

                count++;
            } else if (HorizontalOrVerticalVar == 2 &&
                    this.field[randomFieldPointX][randomFieldPointY] != -1
                    && field[randomFieldPointX][randomFieldPointY] != 88
                    && field[randomFieldPointX][randomFieldPointY] != 1) {
                if (count == 0) {
                    field[randomFieldPointX][randomFieldPointY] = 1;
                    catPoints[0] = randomFieldPointX;
                    catPoints[1] = randomFieldPointY;
                } else
                    this.field[randomFieldPointX][randomFieldPointY] = 88;

                count++;
            }

        }
    }

    public void puttingObstacles() {
        int origin = 0;
        int bound = 10;
        int switcher = 0;

        for (int i = 0; i < 5; i++) {
            if (switcher == 0) {
                origin = 1;
                bound = 10;
                switcher = 1;
            } else {
                origin = 0;
                bound = 9;
                switcher = 0;
            }

            int HorizontalOrVerticalVar = HorizontalOrVertical.nextInt(1, 3);
            int randomFieldPointX = randomFieldStart.nextInt(origin, bound);
            int randomFieldPointY = randomFieldStart.nextInt(origin, bound);
            for (int j = 0; j < 4; j++) {

                if (HorizontalOrVerticalVar == 1 &&
                        randomFieldPointX >= 0 &&
                        randomFieldPointX <= 9 &&
                        this.field[randomFieldPointX][randomFieldPointY] != -1) {

                    this.field[randomFieldPointX][randomFieldPointY] = -1;
                    randomFieldPointX--;

                } else if (HorizontalOrVerticalVar == 2 &&
                        randomFieldPointY >= 0 &&
                        randomFieldPointY <= 9 &&
                        this.field[randomFieldPointX][randomFieldPointY] != -1) {

                    this.field[randomFieldPointX][randomFieldPointY] = -1;
                    randomFieldPointY--;

                }
            }
        }

    }

}
