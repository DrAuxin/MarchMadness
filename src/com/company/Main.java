package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner user = new Scanner(new File("MarchData"));
        ArrayList<Team> madness = new ArrayList();
        int count = 1;
        boolean add = true;
        String year = "0";
        int index = 0;
        while (!user.hasNextLine()) {
            if (count % 9 == 1) {
                year = user.nextLine();
                count++;
            }
            if (count % 9 == 2)
                count++;
            if (count % 9 == 3) {
                if (madness.isEmpty()) {
                    madness.add(new Team(user.nextLine()));
                    madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 4 - 1938;
                    count++;
                } else {
                    for (int a = 0; a < madness.size(); a++)
                        if (madness.get(a).id.equalsIgnoreCase(user.nextLine())) {
                            index = a;
                            add = false;
                        }
                    if (add) {
                        madness.add(new Team(user.nextLine()));
                        madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 4 - 1938;
                        count++;
                    } else {
                        madness.get(index).score = madness.get(index).score + Integer.parseInt(year) + 4 - 1938;
                        add = true;
                        count++;
                    }
                }
            }
                if (count % 9 == 4) {
                    if (madness.isEmpty()) {
                        madness.add(new Team(user.nextLine()));
                        madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 3 - 1938;
                        count++;
                    } else {
                        for (int a = 0; a < madness.size(); a++)
                            if (madness.get(a).id.equalsIgnoreCase(user.nextLine())) {
                                index = a;
                                add = false;
                            }
                        if (add) {
                            madness.add(new Team(user.nextLine()));
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
                    if (madness.isEmpty()) {
                        madness.add(new Team(user.nextLine()));
                        madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 2 - 1938;
                        count++;
                    } else {
                        for (int a = 0; a < madness.size(); a++)
                            if (madness.get(a).id.equalsIgnoreCase(user.nextLine())) {
                                index = a;
                                add = false;
                            }
                        if (add) {
                            madness.add(new Team(user.nextLine()));
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
                    if (madness.isEmpty()) {
                        madness.add(new Team(user.nextLine()));
                        madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 1 - 1938;
                        count++;
                    } else {
                        for (int a = 0; a < madness.size(); a++)
                            if (madness.get(a).id.equalsIgnoreCase(user.nextLine())) {
                                index = a;
                                add = false;
                            }
                        if (add) {
                            madness.add(new Team(user.nextLine()));
                            madness.get(madness.size() - 1).score = madness.get(madness.size() - 1).score + Integer.parseInt(year) + 1 - 1938;
                            count++;
                        } else {
                            madness.get(index).score = madness.get(index).score + Integer.parseInt(year) + 1 - 1938;
                            add = true;
                            count++;
                        }
                    }
                }
                if (count)
            }
        }
    }

