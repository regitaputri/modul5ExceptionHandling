/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MelakukanInput;
import java.io.*;
/**
 *
 * @author ASUS
 */
public class DemoInputString {
    public static void main(String[] args) throws IOException{
        System.out.print("Masukkan nama Anda: ");
        String nama;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        nama = br.readLine();
        System.out.println("Halo " + nama +", sudahkah Anda mengerti Java?");
    }
}
