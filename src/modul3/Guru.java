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
class Guru extends PraktikumSekolah {
    private String gajiGuru;
    private String alamat;
    
    public Guru(String gajiGuru, String guruMapel, String alamat){
        super(guruMapel);
        this.gajiGuru = gajiGuru;
        this.alamat = alamat;
        
    }
    public void info (){
        System.out.println("Gaji guru : " + this.gajiGuru);
        System.out.println("Alamat : " + this.alamat);
        super.info();
    }
    
}
