package com.pluralsight;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

                    public class buffer {
                    public static void main(String[] args) {
                        Scanner scanner = new Scanner((System.in));
                        //open the file



                        try {

                            FileWriter writer = new FileWriter("NewHires.csv");
                            // write to the file
                            writer.write("New hires:\n");
                            writer.write("\n");
                            writer.write(
                                    "222|James Tee|2150.00\n");
                            writer.write("I have no idea what I'm doing.\n");
                            writer.write("But I hope this works");
                            // close the file when you are finished using it
                            writer.close();


                            FileReader fileReader = new FileReader("src/main/resources/employees.csv");


                            BufferedReader bufferedReader = new BufferedReader(fileReader);
                            bufferedReader.readLine();
                            String input;

                            while ((input = bufferedReader.readLine()) != null) {
                                System.out.println(input);
                                String[] employSort = input.split("\\|");
                                System.out.println(Arrays.toString(employSort));
                                // Employee E = new Employee();

                                int id = Integer.parseInt(employSort[0]);
                                String name = employSort[1];
                                double hoursWorked = Double.parseDouble(employSort[2]);
                                double payRate = Double.parseDouble(employSort[3]);
                                Employee E = new Employee(id, name, hoursWorked, payRate);
                                double grossPay = E.calculatePay()cd;
                                writer.write(String.format("%d|%s|%.2f\n", id, name, grossPay));
                            }
                            // Close buffer
                            bufferedReader.close();
                            writer.close();

                        } catch (IOException e) {
                        e.printStackTrace();}
                    }



                            }















