/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opppro;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class OPPpro {


    public static void main(String[] args) throws IOException {
        
        int[][] javaData = new int[9][9];

        Random random = new Random();
        for (int i = 0; i < javaData.length; i++) {
            for (int j = 0; j < javaData[i].length; j++) {
                javaData[i][j] = random.nextInt(1000);
            }
        }
        for (int i = 0; i < javaData.length; i++) {
            for (int j = 0; j < javaData[i].length; j++) {
                System.out.printf("%3d ", javaData[i][j]);
            }
            System.out.println();
        }
        int[] rowAvg = new int[9];
        for (int i = 0; i < javaData.length; i++) {
            int sum = 0;
            for (int j = 0; j < javaData[i].length; j++) {
                sum += javaData[i][j];
            }
            rowAvg[i] = sum / javaData[i].length;
        }
        for (int i = 0; i < rowAvg.length; i++) {
            System.out.printf("%3d ", rowAvg[i]);
        }
        System.out.println();

        BufferedWriter writer = new BufferedWriter(new FileWriter("javaData.txt"));
        for (int i = 0; i < javaData.length; i++) {
            for (int j = 0; j < javaData[i].length; j++) {
                writer.write(javaData[i][j] + " ");
            }
            writer.newLine();
        }
        writer.close();

       
        writer = new BufferedWriter(new FileWriter("rowAvg.txt"));
        for (int i = 0; i < rowAvg.length; i++) {
            writer.write(rowAvg[i] + " ");
        }
        writer.close();
    }
}

    