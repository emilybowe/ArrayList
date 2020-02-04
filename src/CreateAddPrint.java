import java.util.ArrayList;

public class CreateAddPrint {
    //Write a Java program to create a new array list, add some colors (string) and print out the collection.

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

        System.out.println(colorList);
    }
}
