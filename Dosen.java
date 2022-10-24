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
public class Dosen {
    private int jumlahmatkul;
    private ArrayList<String> matkuList;

    public Dosen(String name, String address){
        super(name, address);
        jumlahmatkul = 0;
        matkuList = new ArrayList<>();

    }

    public boolean addCourse(String course){
        //jika dalam arraylist ada yang sama maka matkul telah ada
        if(matkuList.contains(course)){
            System.out.println("matkul telah ada");
            return false;
        }

        //menambahkan
        jumlahmatkul++;
        matkuList.add(course);
        return true;
    }

    public boolean removeCourse(String course){
        //jika dalam arraylist tidak ada course maka tidak bisa menghapus matkul
        if(!matkuList.contains(course)){
            System.out.println("matkul yang akan dihapus tidak ada");
            return false;
        }

        //jika ada hapus
        jumlahmatkul--;
        matkuList.remove(course);
        return true;
        
    }

    public int getjumlahmatkul() {
        return jumlahmatkul;
    }

    public String toString(){
        return 
        super.toString() + 
        "\n jumlah mata kuliah yang diampu : " + getjumlahmatkul();
    }
}
