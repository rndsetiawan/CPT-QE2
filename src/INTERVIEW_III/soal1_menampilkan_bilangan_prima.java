package INTERVIEW_III;

import java.util.Scanner;
public class soal1_menampilkan_bilangan_prima {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int bil, cek=0;

        System.out.println("PROGRAM JAVA MENENTUKAN BILANGAN PRIMA ATAU BUKAN");
        System.out.print("Masukan Angka : ");
        bil=input.nextInt();

        System.out.println("----------------------------------------------");
        for (int i=2; i<=bil; i++){
            if (bil%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println(bil+" adalah bilangan prima");
        }else {
            System.out.println(bil+" bukan bilangan prima");
        }
    }
}