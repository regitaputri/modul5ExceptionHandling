/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author ASUS
 */
public class multiplecatch {
    public static void main(String[] args){
        try
        {
            //int a = 3/0; //berpotensi menimbulkan kesalahan yaitu pembagian dengan bilangan nol
            int num = Integer.parseInt(args[0]);
            System.out.println("Perintah selanjutnya..");
        }
        catch(ArrayIndexOutOfBoundsException e){
        }
        catch(NullPointerException e){
        }
        catch(Exception e){
            System.out.println("Nama kota kelahiran: Jombang");
        }
        }
        }

