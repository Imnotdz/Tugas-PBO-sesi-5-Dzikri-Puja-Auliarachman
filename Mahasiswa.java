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
public class Mahasiswa {
     private int jumlahmatkul;
    private ArrayList<String> matakuliah;
    private ArrayList<Integer> nilailList;

    public Mahasiswa (String name, String address){
        super(name, address);
        matakuliah = new ArrayList<>();
        nilailList = new ArrayList<>();
        
    }

    public void addmatakuliahGrade(String matakuliah, int grade){
        this.matakuliah.add(matakuliah);
        this.nilailList.add(grade);
        jumlahmatkul++;
        
    }

    public void printnilailList(){
        for(int i = 0; i < jumlahmatkul; i++){
            System.out.println("matakuliah: " + matakuliah.get(i) + " " + "grade: " + nilailList.get(i));
        }
    }

    public double getAverageGrade(){
        int jumlah = 0;
        for (int i = 0; i < jumlahmatkul; i++) {
            jumlah += nilailList.get(i);
        }

        return jumlah / jumlahmatkul;
    }

    public String toString(){
        return
        super.toString() + 
        "Jumlah matkul diambil : " + this.jumlahmatkul + 
        "\nRata-rata nilai : " + getAverageGrade();
    }
}
