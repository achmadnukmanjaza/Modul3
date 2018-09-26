/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author HP
 */
public class PraktikumSekolah {
    private String guruMapel;
    
    public PraktikumSekolah(String guruMapel){
        this.guruMapel = guruMapel;
    }
    public void info (){
        System.out.println("Guru Mapel : " + this.guruMapel);
}
}
