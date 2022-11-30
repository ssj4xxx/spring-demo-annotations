package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class FileFortuneService implements FortuneService {

    private List<String> datalist;
    private Random randomNumber = new Random();
    public FileFortuneService() {
        /*File file = new File("src/fortune-data.txt");
        datalist = new ArrayList<String>();
        System.out.println("File exists: " + file.exists());
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                datalist.add(input.nextLine());
            }
        } catch (Exception ex) {
            System.out.println("Error Reading fortune data file");
            ex.printStackTrace();
        }*/
    }
    @PostConstruct
    public void loadFileService() {
        File file = new File("src/fortune-data.txt");
        datalist = new ArrayList<String>();
        System.out.println("File exists: " + file.exists());
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                datalist.add(input.nextLine());
            }
        } catch (Exception ex) {
            System.out.println("Error Reading fortune data file");
            ex.printStackTrace();
        }
    }
    @Override
    public String getFortune() {
        int index = randomNumber.nextInt(datalist.size());
        return datalist.get(index);
    }
}
