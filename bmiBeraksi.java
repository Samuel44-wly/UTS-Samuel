package Bmi;
import java.util.Scanner;
public class bmiBeraksi {
    public static void main(String[] args) {
    {
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        String JENIS_KELAMIN;
        String NAMA;
        String UMUR;
        
        
        System.out.println("BODY MASS INDEX KALKULAOTR");
        System.out.println("==========================");
        System.out.println("JENIS KELAMIN = ");
        JENIS_KELAMIN=input.nextLine();
        System.out.println("NAMA ANDA = ");
        NAMA=input.nextLine();
        System.out.println("UMUR ANDA = ");
        UMUR=input.nextLine();
        
        
        System.out.println("==================");
        System.out.println("NAMA = "+ JENIS_KELAMIN);
        System.out.println("NAMA = "+ NAMA);
        System.out.println("UMUR = "+ UMUR);
        

        
        bmi bmiKu = new bmi();
        
        bmiKu.setBmi(55, 1.67);
        System.out.println("BMI ANDA: "+Math.round(bmiKu.getBmi()));
        System.out.println();
        
    }
    }
    
}

