package oop.sem1_2_3HW.task1;

import java.util.Arrays;

public class Human extends Research{
    public String[] siblings;
    public String[] grandparents;
    public String[] parents;
    public String[] children;
    public String[] aunts;
    public String[] uncles;
    public String name;

    //this use if field are private
    // Human(String[] siblings, String[] grandparents, 
    //       String[] parents, String[] children,
    //       String[] aunts,String[] uncles, String name){
    //         this.siblings = siblings;
    //         this.grandparents = grandparents;
    //         this.parents = parents;
    //         this.children = children;
    //         this.aunts = aunts;
    //         this.uncles = uncles;
    // }


    @Override
    public String toString() {
        return "Siblings: " + (this.siblings == null ? "No siblings or undefined" : Arrays.toString(this.siblings))  + 
                "\nGrandparents: " + (this.grandparents == null ? "No grandparents or undefined" : Arrays.toString(this.grandparents)) + 
                "\nParents: " + (this.parents == null ? "No parents or undefined" : Arrays.toString(this.parents)) + 
                "\nChildren: " + (this.children == null ? "No children or undefined" : Arrays.toString(this.children)) + 
                "\nAunts: " + (this.children == null ? "No aunts or undefined" : Arrays.toString(this.aunts)) +
                "\nUncles: " + (this.children == null ? "No uncles or undefined" : Arrays.toString(this.uncles));
    }

    
}
