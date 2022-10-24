/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO5;

/**
 *
 * @author dzpa1
 */
public class Main {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan nama dosen : ");
        String nama = sc.nextLine();
        System.out.print("masukan alamat dosen : ");

        String alamat = sc.nextLine();

        Dosen dosen1 = new Dosen(nama, alamat);

        for(int i = 0; i < 3; i++){
            System.out.print("masukan mata kuliah yang diampu: ");
            String matkul = sc.nextLine();
            dosen1.addCourse(matkul);
        }

        System.out.println(dosen1);

    }
}
