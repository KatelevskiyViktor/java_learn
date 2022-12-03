package oop.sem4HW;



public class Cat extends CatMechanic {
    int[][] field;
    int x;
    int y;
    int endGame = 0;
    

    

    public Cat(Field obj) {
        field = obj.fillingField();
        x = obj.catPoints[0];
        y = obj.catPoints[1];
    }

    

    public boolean stepUP(int x, int y) {

        if (endGame == 1)
            return false;
        else if (isThatOutOfBounds(x, 0) ||
                isThatWall(field[x - 1][y]) ||
                stepChecker(x - 1, y))
            return false;
        else if (field[x - 1][y] == 88) {
            endGame = 1;
            return false;
        } else {
            field[x - 1][y] = field[x][y] + 1;
            this.x = x - 1;
            steps.add(new ОccupiedField(x, y));
            return true;
        }
    }

    public boolean stepDown(int x, int y) {

        if (endGame == 1)
            return false;
        else if (isThatOutOfBounds(x, 1) || isThatWall(field[x + 1][y]) || stepChecker(x + 1, y))
            return false;
        else if (field[x + 1][y] == 88) {
            endGame = 1;
            return false;
        } else {
            field[x + 1][y] = field[x][y] + 1;
            this.x = x + 1;
            steps.add(new ОccupiedField(x, y));
            return true;
        }
    }

    public boolean stepLeft(int x, int y) {

        if (endGame == 1)
            return false;
        else if (isThatOutOfBounds(y, 0) || isThatWall(field[x][y - 1]) || stepChecker(x, y - 1))
            return false;
        else if (field[x][y - 1] == 88) {
            endGame = 1;
            return false;
        } else {
            field[x][y - 1] = field[x][y] + 1;
            this.y = y - 1;
            steps.add(new ОccupiedField(x, y));
            return true;
        }
    }

    public boolean stepRight(int x, int y) {

        if (endGame == 1)
            return false;
        else if (isThatOutOfBounds(y, 1) ||
                isThatWall(field[x][y + 1]) ||
                stepChecker(x, y + 1))
            return false;
        else if (field[x][y + 1] == 88) {
            endGame = 1;
            return false;
        } else {
            field[x][y + 1] = field[x][y] + 1;
            this.y = y + 1;
            steps.add(new ОccupiedField(x, y));
            return true;
        }

    }

    public int[][] catWalk() {
        while (true) {
            if (stepUP(x, y))
                continue;
            else if (stepRight(x, y))
                continue;
            else if (stepDown(x, y))
                continue;
            else if (stepLeft(x, y))
                continue;
            else
                break;
        }

        return field;
    }
}
