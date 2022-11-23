package oop.sem1_2HW.task1;

public class Research implements Researches {
    public boolean checkerRelative(String[] arr, String name) {
        if (arr != null)
            for (String s : arr)
                if (name == s)
                    return true;

        return false;
    }

    @Override
    public String relativeResearcher(Human human, Human human2) {

        if (this.checkerRelative(human.siblings, human2.name))
            return human2.name + " is brother or sister " + human.name;

        if (this.checkerRelative(human.grandparents, human2.name))
            return human2.name + " is grandparent " + human.name;

        if (this.checkerRelative(human.children, human2.name))
            return human2.name + " is children " + human.name;

        if (this.checkerRelative(human.parents, human2.name))
            return human2.name + " is parent " + human.name;

        if (this.checkerRelative(human.uncles, human2.name))
            return human2.name + " is uncle " + human.name;

        if (this.checkerRelative(human.aunts, human2.name))
            return human2.name + " is aunt " + human.name;

        return human2.name + " is not relative " + human.name;
    }
}
