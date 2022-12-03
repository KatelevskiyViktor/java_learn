package oop.sem4HW;

import java.util.ArrayList;

class CatMechanic {
    ArrayList<ОccupiedField> steps = new ArrayList<ОccupiedField>();

    public class ОccupiedField {
        int x;
        int y;

        public ОccupiedField(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public boolean isThatWall(int stap) {
        return stap == -1 ? true : false;
    }

    public boolean isThatOutOfBounds(int point, int switcher) {
        if (switcher == 0) {
            return point > 0 ? false : true;
        } else {
            return point < 9 ? false : true;
        }
    }

    public boolean stepChecker(int x, int y) {
        for (ОccupiedField obj : steps) {
            if (obj.x == x && obj.y == y)
                return true;
        }
        return false;
    }
}