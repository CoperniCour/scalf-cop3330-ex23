/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 23 - Troubleshooting Car Issues

package org.example;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner getInfo = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String silent = getInfo.nextLine();
        if (silent.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            String corroded = getInfo.nextLine();
            if (corroded.equals("y")) {
                System.out.println("Clean the terminals and try starting again.");
            } else if (corroded.equals("n")) {
                System.out.println("Replace the cables and try again.");
            } else if (silent.equals("n")) {
                System.out.println("Does the car make a slicking nise?");
                String slicking = getInfo.nextLine();

                if (slicking.equals("y")) {
                    System.out.println("Replace the battery.");
                }

                else if (slicking.equals("n")) {
                    System.out.println("Does the car crank up but fail to start?");
                    String crank = getInfo.nextLine();

                    if (crank.equals("y")){
                        System.out.println("Check spark plug connections.");
                    }

                    else if (crank.equals("n")){
                        System.out.println("Does the engine start and then die?");
                        String start_then_die = getInfo.nextLine();

                        if(start_then_die.equals("y")) {
                            System.out.println("Does your car have fuel injection?");
                            String fuel_inj = getInfo.nextLine();

                            if (fuel_inj.equals("y")) {
                                System.out.println("Get it in for service.");
                            } else if (fuel_inj.equals("n")) {
                                System.out.println("Check to ensure the choke is opening and closing.");
                            }
                        }

                        else if(start_then_die.equals("n")){
                            System.out.println("This should nt be possible.");
                        }
                    }
                }
            }
        }
    }
}
