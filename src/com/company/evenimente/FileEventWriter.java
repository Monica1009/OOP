package com.company.evenimente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileEventWriter {

    public void write(List<Evenimente> evenimenteList){
        File file= new File("C:/test/event.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(evenimenteList);
        } catch (FileNotFoundException e) {
            System.out.println("Eroare nu a gasit calea");
        } catch (IOException e) {
            System.out.println("Exceptie la scrierea de obiecte");
        }
    }

    public List<Evenimente> read(){
        File file= new File("C:/test/event.txt");
        List<Evenimente> evenimenteList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            evenimenteList= (List<Evenimente>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu s-a gasit");
        } catch (IOException e) {
            System.out.println("Exceptie la citire din fisier");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        return evenimenteList;
    }
}

