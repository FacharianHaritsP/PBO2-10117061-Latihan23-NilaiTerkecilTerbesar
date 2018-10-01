/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan23.nilaiterkecilterbesar;

import java.util.Scanner;

/**
 * Nama :Fachrian Harits Pratama 
 * NIM :10117061 
 * kelas :if2 
 * Deskripsi program: menampilkan Nilia 
 *                    terbesar dan terkecil dari jumlah nilai
 */
public class PBO210117061Latihan23NilaiTerkecilTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int[] nilai = new int[20];
        int a;
        String nama;

        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan nama petugas\t: ");
        nama = masuk.nextLine();

        System.out.print("Masukkan banyaknya mahasiswa : ");
        n = masuk.nextInt();
        for (a = 0; a < n; a++) {
            System.out.println("Masukan Nilai mahasiswa ke-" + (a + 1) + ":");
            nilai[a] = masuk.nextInt();
        }

        System.out.println("");
        for (a = 0; a < n; a++) {

            System.out.println("Hasil nilai mahasiswa ke-" + (a + 1) + " : " + nilai[a]);

        }

        int min = nilai[1];
        int max = nilai[1];

        for (a = 0; a < n; a++) {

            if (nilai[a] > max) {
                max = nilai[a];
            } else if (nilai[a] < min) {
                min = nilai[a];
            }
        }
        System.out.println("\nnilai terbesar\t: " + max);
        System.out.println("\nnilai terkecil\t: " + min);

    }

}
