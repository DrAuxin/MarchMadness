package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner user = new Scanner(new File("MarchData"));
        Scanner person = new Scanner(System.in);
        ArrayList<Team> madness = new ArrayList();
        int count = 1;
        double score1 = 0;
        double score2 = 0;
        double z = 0;
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
        while (true) {
            score1 = 0;
            score2 = 0;
            System.out.println("Enter team name one");
            String w = person.nextLine();
            for (int a = 0; a < madness.size(); a++)
                if (madness.get(a).id.equalsIgnoreCase(" " + w))
                    score1 = madness.get(a).score;
            System.out.println("Enter team name two");
            String l = person.nextLine();
            for (int a = 0; a < madness.size(); a++)
                if (madness.get(a).id.equalsIgnoreCase(" " + l))
                    score2 = madness.get(a).score;
            Scanner finder = new Scanner(new File("Schedule"));
            while (finder.hasNextLine()) {
                if (finder.findInLine(w) != null) {
                    finder.findInLine("-");
                    finder.next();
                    score1 = (Double.parseDouble(finder.next()))*1000 + score1;
                    break;
                }
                finder.nextLine();
            }
            Scanner finder2 = new Scanner(new File("Schedule"));
            while (finder2.hasNextLine()) {
                if (finder2.findInLine(l) != null) {
                    finder2.findInLine("-");
                    finder2.next();
                    score2 = (Double.parseDouble(finder2.next()))*1000 + score2;
                    break;
                }
                finder2.nextLine();
            }
            if (score1 > score2)
                System.out.println(w + " wins");
            else if (score1 < score2)
                System.out.println(l + " wins");
        }
    }
}


