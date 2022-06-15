package com.cogent.day11;
import java.io.File;
import java.util.Scanner;

public class file {

    public static void main(String[] args) {

        try {
            //System.out.print("Enter the file name with extension : ");

            Scanner input = new Scanner(System.in);

            File file = new File("C:\\Users\\deepone\\Desktop\\Cursos\\Java\\contacts.txt");

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}