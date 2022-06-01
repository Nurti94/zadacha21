package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Abc {
    public static void abc(){
        try (FileWriter fileWriter=new FileWriter("abc.txt")){
            for (char i='A';i<='Z';i++){
                String a =i+""+Character.toLowerCase(i);
                fileWriter.append(a+"\n");
            }
            for (char j='0';j<='9';j++){
                fileWriter.append(j+"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }public static void abc2(){
        try (FileReader fileReader=new FileReader("abc.txt")){
            Scanner sc=new Scanner(fileReader);
            int a =1;
            while (sc.hasNextLine()){
                System.out.println(a+") "+sc.nextLine());
                a++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
