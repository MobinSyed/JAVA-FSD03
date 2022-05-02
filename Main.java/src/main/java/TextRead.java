import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class TextRead {
    static ArrayList<String> nameList = new ArrayList<>();
    static ArrayList<Double> numsList = new ArrayList<>();

    public static void main(String[] args){

        try {
            File input = new File("Main.java/src/main/input.txt");
            Scanner myReader = new Scanner(input);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                try {
                    double value = Double.parseDouble(line);
                    numsList.add(value);
                } catch (NumberFormatException ex){
                    nameList.add(line);
                }

            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        System.out.println("Names" + nameList);
        System.out.println("Numbers" + numsList);
    }
}
