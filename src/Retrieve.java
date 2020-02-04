import java.util.ArrayList;

public class Retrieve {
    //Write a Java program to retrieve an element (at a specified index) from a given array list.

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


        System.out.println(colorList.get(0));
    }
}
