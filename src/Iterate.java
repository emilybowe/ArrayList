import java.util.ArrayList;

public class Iterate {
    //Write a Java program to iterate through all elements in a array list.

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

        for(String string : colorList){
            System.out.println(string);
        }
    }
}
