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
    private String tunjangan;
    
    public Guru(String gajiGuru, String guruMapel, String alamat, String tunjangan){
        super(guruMapel);
        this.gajiGuru = gajiGuru;
        this.alamat = alamat;
        this.tunjangan = tunjangan;
        
    }
    public void info (){
        System.out.println("Gaji guru : " + this.gajiGuru);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Tunjangan guru : " + this.tunjangan);
        super.info();
    }
    
}
