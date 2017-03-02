package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner user = new Scanner(new File("MarchData"));
        Scanner person = new Scanner(System.in);
        ArrayList<Team> madness = new ArrayList();
        int count = 1;
        String storage = "";
        boolean add = true;
        String year = "0";
        int index = 0;
        while (user.hasNextLine()) {
            if (count % 9 == 1) {
                year = user.nextLine();
                count++;
            }

            if (count % 9 == 2) {
                storage = user.nextLine();
                if (madness.isEmpty()) {
                    madness.add(new Team(storage));
                    madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 4 - 1938;
                    count++;
                } else {
                    for (int a = 0; a < madness.size(); a++)
                        if (madness.get(a).id.equalsIgnoreCase(storage)) {
                            index = a;
                            add = false;
                        }
                    if (add) {
                        madness.add(new Team(storage));
                        madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 4 - 1938;
                        count++;
                    } else {
                        madness.get(index).score = madness.get(index).score + Integer.parseInt(year) + 4 - 1938;
                        add = true;
                        count++;
                    }
                }
            }
            if (count % 9 == 3) {
                user.nextLine();
                count++;
            }
            if (count % 9 == 4) {
                storage = user.nextLine();
                if (madness.isEmpty()) {
                    madness.add(new Team(storage));
                    madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 3 - 1938;
                    count++;
                } else {
                    for (int a = 0; a < madness.size(); a++)
                        if (madness.get(a).id.equalsIgnoreCase(storage)) {
                            index = a;
                            add = false;
                        }
                    if (add) {
                        madness.add(new Team(storage));
                        madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 3 - 1938;
                        count++;
                    } else {
                        madness.get(index).score = madness.get(index).score + Integer.parseInt(year) + 3 - 1938;
                        add = true;
                        count++;
                    }
                }
            }

            if (count % 9 == 5) {
                storage = user.nextLine();
                if (madness.isEmpty()) {
                    madness.add(new Team(storage));
                    madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 2 - 1938;
                    count++;
                } else {
                    for (int a = 0; a < madness.size(); a++)
                        if (madness.get(a).id.equalsIgnoreCase(storage)) {
                            index = a;
                            add = false;
                        }
                    if (add) {
                        madness.add(new Team(storage));
                        madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 2 - 1938;
                        count++;
                    } else {
                        madness.get(index).score = madness.get(index).score + Integer.parseInt(year) + 2 - 1938;
                        add = true;
                        count++;
                    }
                }
            }
            if (count % 9 == 6) {
                storage = user.nextLine();
                if (madness.isEmpty()) {
                    madness.add(new Team(storage));
                    madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 1 - 1938;
                    count++;
                } else {
                    for (int a = 0; a < madness.size(); a++)
                        if (madness.get(a).id.equalsIgnoreCase(storage)) {
                            index = a;
                            add = false;
                        }
                    if (add) {
                        madness.add(new Team(storage));
                        madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 1 - 1938;
                        count++;
                    } else {
                        madness.get(index).score = madness.get(index).score + Integer.parseInt(year) + 1 - 1938;
                        add = true;
                        count++;
                    }
                }
            }
            if (count % 9 == 7) {
                user.nextLine();
                count++;
            }
            if (count % 9 == 8) {
                user.nextLine();
                count++;
            }
            if (count % 9 == 0) {
                user.nextLine();
                count++;
            }
        }
        while (true)
        {
            System.out.println("Enter team name");
            String w = " " + person.nextLine();
            for (int a = 0; a < madness.size(); a++)
                if (madness.get(a).id.equalsIgnoreCase(w))
                    System.out.println(madness.get(a).score);
        }
    }
}

