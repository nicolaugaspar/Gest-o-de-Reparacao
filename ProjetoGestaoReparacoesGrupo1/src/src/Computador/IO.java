package Computador;

import java.util.Scanner;

public class IO {
    public static int getInt(){
        @SuppressWarnings("resource")
        Scanner it = new Scanner(System.in);
        try {
            return  Integer.parseInt(it.nextLine());
        }catch (Exception e){
            return 0 ;
        }
    }
    public static double getDouble()
    {
        @SuppressWarnings("resource")
        Scanner it = new Scanner(System.in);
        try {
            return  Double.parseDouble(it.nextLine());
        }catch (Exception e){
            return 0 ;
        }
    }
    public static float getFloat(){
        @SuppressWarnings("resource")
        Scanner it = new Scanner(System.in);
        try {
            return  Float.parseFloat(it.nextLine());
        }catch (Exception e){
            return 0 ;
        }
    }

    public static String getString(){
        @SuppressWarnings("resource")
        Scanner it = new Scanner(System.in);
        try {
            return it.nextLine();
        }catch (Exception e){
            return "";
        }
    }

}
