import java.util.ArrayList;

public class Insert {
    //Write a Java program to insert an element into the array list at the first position.

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

        colorList.add(0, blue);

        System.out.println(colorList);
    }
}
