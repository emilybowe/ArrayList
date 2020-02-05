import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {

    //Write a Java program to sort a given array list.

    public static void main(String args[]){

        String red = new String("red");
        String yellow = new String("yellow");
        String green = new String("green");
        String purple = new String("purple");
        String blue = new String("blue");

        ArrayList<String> colorList = new ArrayList<>();

        colorList.add(red);
        colorList.add(yellow);
        colorList.add(green);
        colorList.add(purple);
        colorList.add(blue);

        Collections.sort(colorList);

        System.out.println(colorList);
    }
}
